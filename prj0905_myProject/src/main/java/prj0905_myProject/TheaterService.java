package prj0905_myProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class TheaterService {

	TheaterDAO dao = new TheaterDAO();
	
	public ArrayList<ReservationInfo> getAllList(){
		ArrayList<ReservationInfo> list = dao.selectAll();
		return list;
		}

}
