package Acorn;

import java.security.interfaces.RSAKey;
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

	public ArrayList<Acorn> getAllMember(){
		
		ArrayList<Acorn> list = new ArrayList<>();
		ResultSet rs = null;
		PreparedStatement pst = null;
		Connection con = dbcon();
		String sql= " select * from acorntbl";
		
		
		try {
			
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
			String id_temp;
			String pw_temp;
			String name_temp;
			
			while(rs.next()) {
				id_temp = rs.getString(1);
				pw_temp = rs.getString(2);
				name_temp = rs.getString(3);
				list.add(new Acorn(id_temp, pw_temp, name_temp));
			}
			
			rs.close();
			pst.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	
	
	
	
	
		
		
	

	
}
