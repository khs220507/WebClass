package prj0911_paging_practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AcornDAO {

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
				System.out.println("DB OK - 01");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
	public ArrayList<Acorn> getListPage(int page, int pageSize){
		Connection con = dbcon();
		PreparedStatement pst = null;
		ResultSet rs = null;
		int startPage = 0, endPage = 0;
		startPage = (page-1) * pageSize + 1;
		endPage = page * pageSize;
		String sql = "select *\r\n"
				+ "from (select rownum num, id, pw, name from ACORNTBL)\r\n"
				+ "where num BETWEEN ? and ?";
		ArrayList<Acorn> list = new ArrayList<>();
		
		try {
			pst = con.prepareStatement(sql);
			pst.setInt(1, startPage);
			pst.setInt(2, endPage);
			rs = pst.executeQuery();
			
			while(rs.next()) {
				String id_tmp = rs.getString(2);
				String pw_tmp = rs.getString(3);
				String name_tmp = rs.getString(4);
				Acorn a = new Acorn(id_tmp, pw_tmp, name_tmp);
				list.add(a);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	public int getTotalCnt() {
		Connection con = dbcon();
		String sql = "select count(*) from acorntbl";
		int totalCnt = 0;
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				totalCnt = rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return totalCnt;
	}
	
	public void close(AutoCloseable... a) {
		for (AutoCloseable item : a) {
			try {
				item.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		AcornDAO dao = new AcornDAO();
		
		int totalCnt = dao.getTotalCnt();
		System.out.println(totalCnt);
		
		if(dao.dbcon()!=null) {
			System.out.println("DB OK - 02");
		}
		ArrayList<Acorn> list;
		list = dao.getListPage(2, 5);
		System.out.println(list);
	}
}
