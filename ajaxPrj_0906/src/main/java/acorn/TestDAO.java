package acorn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestDAO {

	// 데이터베이스 연결정보
	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:testdb";
	String user="scott";
	String password="tiger";

	public Connection dbcon() {
		Connection con=null;
		// 객체생성하는코드 
		
			try {
				Class.forName(driver);
				con = DriverManager.getConnection(url, user, password);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return con;
		}
	// 시험문제
	/*
	 public ArrayList<Member> selectAll(){
	 
	 }
	 */
	
	public String selectOne(String id) {
		String name ="";
		Connection con = dbcon();
		String sql="select name from acorntbl where id = ? ";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1,  id);
			ResultSet rs = pst.executeQuery();
			// 1건 조회
			if(rs.next()) {
				name = rs.getString(1);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return name;
	}
	
	public static void main(String[] args) {
		TestDAO dao = new TestDAO();
		Connection con = dao.dbcon();
		if(con!=null) System.out.println("DB OK");
		
		String name = dao.selectOne("yj");
		System.out.println(name);
	}
	}
	

