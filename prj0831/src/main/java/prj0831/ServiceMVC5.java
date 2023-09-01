package prj0831;

import java.util.ArrayList;

public class ServiceMVC5 {
	
	public ArrayList<Member> getList(){
		ArrayList<Member> list = new ArrayList<>();
		list.add(new Member("khs", "7553", "김현수"));
		list.add(new Member("pkt", "7551", "표준태"));
		list.add(new Member("kdy", "7551", "김현수"));
		return list;
	}

}
