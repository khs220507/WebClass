package acorn;

import java.sql.SQLException;

public class AcornService {
	AcornDAO dao = new AcornDAO();
	// 회원정보등록기능
	
	public void registerCustomer(Customer c) throws SQLException  {
		dao.insert(c);
	}

}
