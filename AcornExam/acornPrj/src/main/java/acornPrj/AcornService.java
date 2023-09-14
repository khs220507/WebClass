package acornPrj;

import java.util.ArrayList;

public class AcornService {
	
	public ArrayList<Acorn> getAllList(){
		AcornDAOSample dao = new AcornDAOSample();
		ArrayList<Acorn> list = dao.selectAll();
		System.out.println(list);
		return list;
	}

}
