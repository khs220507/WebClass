package source;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

public class MemberService {
	
	MemberDAO dao = new MemberDAO();
	
	public JSONArray getAllList() {
		ArrayList<Member> list = dao.selectAll();
		JSONArray arr = new JSONArray();
		for(int i=0; i<list.size(); i++) {
			Member m = list.get(i);
			JSONObject o = new JSONObject();
			o.put("id", m.getId());
			o.put("pw", m.getPw());
			o.put("name", m.getName());
			arr.put(o);
		}
		return arr;
	}
	public static void main(String[] args) {
		MemberService s = new MemberService();
		System.out.println(s.getAllList());
	}

}
