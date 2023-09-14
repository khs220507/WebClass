package acornPrj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
 

public class AcornDAOSample {
	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:testdb";
	String user="scott";
	String password="tiger";
	
	public Connection dbcon() {		 
		Connection con = null;
		try {
			Class.forName(driver);
			con =DriverManager.getConnection(url, user, password);
			if( con != null) System.out.println( "ok");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;		 	
	}
	
	public ArrayList<Acorn> selectAll(){
		Connection con = dbcon();
		PreparedStatement pst = null;
		ResultSet rs = null;
		String sql = "select * from acorntbl";
		ArrayList<Acorn> list = new ArrayList<>();
		Acorn acorn = null;
		try {
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
			
			while(rs.next()) {
				String id_temp = rs.getString(1);
				String pw_temp = rs.getString(2);
				String name_temp = rs.getString(3);
				acorn = new Acorn(id_temp, pw_temp, name_temp);
				list.add(acorn);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close();
		return list;
	}
	
	
	 
	
	public void close( AutoCloseable ...a) {
		for( AutoCloseable  item : a) {
		   try {
			item.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		}
		
	}

	
	 
	  
	public static void main(String[] args) {
		 
		
	}

}
