package prj0901_Training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CoffeeDAO {

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
	
	public Coffee selectOne(String id) {
		Connection con = dbcon();
		String sql = " select * from goodstbl where id = ? ";
		PreparedStatement pst = null;
		ResultSet rs = null;
		Coffee c = null;
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1,id);
			rs = pst.executeQuery();
			if(rs.next()) {
				String id_temp = rs.getString(1);
				String pw_temp = rs.getString(2);
				int price_temp = rs.getInt(3);
				c = new Coffee(id_temp, pw_temp, price_temp);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close(rs, pst, con);
		return c;
	}

	public ArrayList<Coffee> selectAll() {
		Connection con = dbcon();
		String sql = " select * from goodstbl";
		PreparedStatement pst = null;
		ResultSet rs = null;
		Coffee c = null;
		ArrayList<Coffee> list = new ArrayList<Coffee>();
		try {
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				String id_temp = rs.getString(1);
				String id_name = rs.getString(2);
				int price_temp = rs.getInt(3);
				c = new Coffee(id_temp, id_name, price_temp);
				list.add(c);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close(rs, pst, con);
		return list; 
	}
	
	public void insertCoffee(Coffee c) {
		Connection con = dbcon();
		String sql = "insert into goodstbl values(?,?,?)";
		PreparedStatement pst = null;
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1,c.getId());
			pst.setString(2,c.getName());
			pst.setInt(3,c.getPrice());
			pst.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close(pst,con);
	}
	
	public void deleteOne(String id) {
		Connection con = dbcon();
		String sql = " delete from goodstbl where id = ? ";
		PreparedStatement pst = null;
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, id);
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close(pst, con);
	}
	
	public void updateOne(Coffee c) {
		Connection con = dbcon();
		PreparedStatement pst = null;
		String sql = " update goodstbl set price = ? where id = ?";
		
		try {
			pst = con.prepareStatement(sql);
			pst.setInt(1, c.getPrice());
			pst.setString(2, c.getId());
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close();
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
		CoffeeDAO dao = new CoffeeDAO();
		
		Coffee c = dao.selectOne("c001");
		
		System.out.println(c);
		
		
		
	}
}
