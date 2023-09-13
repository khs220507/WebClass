package prj0913;

import java.util.ArrayList;
import java.util.HashMap;

public class MapEx {
	public static void main(String[] args) {
		// Map
		// 키, 값 형태로 데이터 저장함
		// 키, 값
		HashMap<String, String> map1 = new HashMap<>();
		HashMap<String, ArrayList<String>> map2 = new HashMap<>();
		
		map1.put("key1", "apple");
		map1.put("key2", "banana");
		map1.put("key3", "mango");
		
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("apple");
		list1.add("banana");
		list1.add("mango");
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("아메리카노");
		list2.add("카페라떼");
		list2.add("헤이즐넛");
		
		map2.put("fruit",list1);
		map2.put("beverage",list2);
		
		ArrayList<String> resultList1 = map2.get("fruit");
		for(String f : resultList1) {
			System.out.println(f);
		}
		
		ArrayList<String> resultList2 = map2.get("beverage");
		for(String c : resultList2) {
			System.out.println(c);
		}
		
	}
}
