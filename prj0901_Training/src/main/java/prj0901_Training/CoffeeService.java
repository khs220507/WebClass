package prj0901_Training;

import java.util.ArrayList;

public class CoffeeService {
	
	CoffeeDAO dao = new CoffeeDAO();
	
	public ArrayList<Coffee> getCoffeeListAll(){
		ArrayList<Coffee> list = dao.selectAll();
		return list;
	}
	
	public Coffee getCoffeeOne(String id) {
		Coffee c = dao.selectOne(id);
		return c;
	
	}
	public void registerCoffee(Coffee c) {
		dao.insertCoffee(c);
}
	
	public void deleteCoffee(String id)
	{
		dao.deleteOne(id);
	}
	
	public void updateCoffee(Coffee c) {
		dao.updateOne(c);
	}
}
