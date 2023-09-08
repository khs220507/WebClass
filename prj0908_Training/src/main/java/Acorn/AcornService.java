package Acorn;

import java.util.ArrayList;

public class AcornService {
	
	public  ArrayList<Acorn> selectAll(){
		
		AcornDAO dao = new AcornDAO();
		ArrayList<Acorn> list = dao.getAllMember();
		return list;
	}

}
