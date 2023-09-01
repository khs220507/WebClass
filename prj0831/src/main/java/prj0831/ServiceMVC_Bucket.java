package prj0831;

import java.util.ArrayList;

public class ServiceMVC_Bucket {
	
	public ArrayList<Bucket> getlist(){
		ArrayList<Bucket> list = new ArrayList<Bucket>();
		list.add(new Bucket("피라미드가기", "2030년", "하"));
		list.add(new Bucket("독일취업하기", "2027년", "상"));
		list.add(new Bucket("영어고수되기", "2026년", "상"));
		list.add(new Bucket("개발고수되기", "2027년", "상"));
		return list;
	}
}
