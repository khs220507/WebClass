package prj0905_myProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class TheaterDAO {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:testdb";
	String user = "scott";
	String password = "tiger";

	public Connection dbcon() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			if (con != null)
				System.out.println("ok");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
	public ArrayList<ReservationInfo> selectAll() {
		// 연결
		Connection con = dbcon();

		// sql
		String sql = " select * from tbl_customer_02 c inner join tbl_movie_order_02 o on c.ID = o.O_ID inner join tbl_movie02 m on o.O_CODE = m.M_CODE";
		// sql실행
		PreparedStatement pst = null;
		ResultSet rs = null;
		ReservationInfo r = null;

		ArrayList<ReservationInfo> list = new ArrayList<ReservationInfo>();
		try {
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
			

			while (rs.next()) {
				String id_temp = rs.getString(1);
				String pw_temp = rs.getString(2);
				String name_temp = rs.getString(3);
				String phone_temp = rs.getString(4);
				String r_num_temp = rs.getString(5);
				String o_id_temp = rs.getString(6);
				int o_cnt_temp = rs.getInt(7);
				String m_code_temp = rs.getString(8);
				String m_title_temp = rs.getString(9);
				String m_genre_temp  = rs.getString(10);
				int m_price_temp  = rs.getInt(11);
				String m_runtime_temp  = rs.getString(12);
				String m_start_end_temp  = rs.getString(13);
				
				r = new ReservationInfo(id_temp, pw_temp, name_temp, phone_temp, r_num_temp, o_id_temp, m_code_temp, o_cnt_temp, m_code_temp, m_title_temp, m_genre_temp, m_price_temp, m_runtime_temp, m_start_end_temp);
				list.add(r);
			}
			
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 해제
		close(rs, pst, con);
		return list;
	}

	private void close(ResultSet rs, PreparedStatement pst, Connection con) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		TheaterDAO dao = new TheaterDAO();
		dao.dbcon();
	}
	
}
