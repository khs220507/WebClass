package page;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

public class MemberDao2 {

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

	public int getTotalCnt() {
		Connection con = dbcon();
		String sql = "select count(*) from member_tbl_11";
		int totalCnt = 0;
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				totalCnt = rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return totalCnt;
	}

	public ArrayList<Member> SelectAll() {
		ArrayList<Member> list = new ArrayList<>();
		Connection con = dbcon();
		String sql = "select * from member_tbl_11";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery(sql);
			while (rs.next()) {
				String id_tmp = rs.getString(1);
				String pw_tmp = rs.getString(2);
				String name_tmp = rs.getString(3);
				String tel_tmp = rs.getString(4);
				Member m = new Member(id_tmp, pw_tmp, name_tmp, tel_tmp);
				list.add(m);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	public ArrayList<Member> getListPage(int page, int pageSize) {
		Connection con = dbcon();
		PreparedStatement pst = null;
		ResultSet rs = null;
		int startPage = 0, endPage = 0;
		startPage = (page-1) * pageSize + 1;
		endPage = page * pageSize;
		String sql = "select * \r\n" + "from (select rownum num, m_id, m_name, m_tel, M_BIRTHDAY, M_POINT, M_GRADE\r\n"
				+ "from member_tbl_11)\r\n" + "where num between ? and ?";
		System.out.println(sql);
		ArrayList<Member> list = new ArrayList<>();

		try {
			pst = con.prepareStatement(sql);
			pst.setInt(1, startPage);
			pst.setInt(2, endPage);
			rs = pst.executeQuery();

			while (rs.next()) {
				String id_tmp = rs.getString(2);
				String pw_tmp = rs.getString(3);
				String name_tmp = rs.getString(4);
				String tel_tmp = rs.getString(5);
				Member m = new Member(id_tmp, pw_tmp, name_tmp, tel_tmp);
				list.add(m);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
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
		MemberDao2 dao = new MemberDao2();
		if (dao.dbcon() != null) {
			System.out.println("DB OK!");

		}
		int totalnum = dao.getTotalCnt();
		System.out.println(totalnum);

		ArrayList<Member> list = dao.SelectAll();
		for (Member item : list) {
			System.out.println(item);
		}

		list = dao.getListPage(2, 5);
		for (Member item : list) {
			System.out.println(item);

		}
	}

}
