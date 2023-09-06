package acorn;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

public class FoodService {
	
	FoodDAO dao = new FoodDAO();

	public JSONObject getFoodInfo() {
		Food food = new Food("라멘", "10000원");
		JSONObject o = new JSONObject();
		o.put("name", food.getName());
		o.put("price", food.getPrice());
		return o;
	}

	public JSONArray getFoodList() {
		ArrayList<Food> list = new ArrayList<>();
		list.add(new Food("지로우라멘", "10000원"));
		list.add(new Food("미정국수", "8000원"));
		list.add(new Food("버거킹", "9800원"));
		
		JSONArray arr = new JSONArray();
		for(int i=0; i<list.size(); i++) {
			Food f = list.get(i);
			JSONObject o = new JSONObject();
			o.put("name", f.getName());
			o.put("price", f.getPrice());
			arr.put(o);
		}
		return arr;
	}
	
	public JSONArray getFoodRealList() {
		ArrayList<Food> list = dao.getFoodList();
//		list.add(new Food("지로우라멘", "10000원"));
//		list.add(new Food("미정국수", "8000원"));
//		list.add(new Food("버거킹", "9800원"));
		
		JSONArray arr = new JSONArray();
		for(int i=0; i<list.size(); i++) {
			Food f = list.get(i);
			JSONObject o = new JSONObject();
			o.put("name", f.getName());
			o.put("price", f.getPrice());
			arr.put(o);
		}
		return arr;
	}
	
	

}
