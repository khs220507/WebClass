package prj0907_testPractice;

import java.util.ArrayList;

public class MemberService {
	
	MemberDAO dao = new MemberDAO();
	
	public ArrayList<Member> getMemberAllList(){
		ArrayList<Member> list = dao.selectAll();
		return list;
	}

}
