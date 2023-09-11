package prj0911_paging_practice;

import java.util.ArrayList;

public class AcornService {
	
	public ArrayList<Acorn> getListPage(int page, int pageSize){
		AcornDAO dao = new AcornDAO();
		ArrayList<Acorn> list = dao.getListPage(page, pageSize);
		return list;
	}
}
