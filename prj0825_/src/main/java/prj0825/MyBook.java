package prj0825;

public class MyBook {
	
	String bname;
	String name;
	int price;
	
	public MyBook() {
		// TODO Auto-generated constructor stub
	}

	public MyBook(String bname, String name, int price) {
		super();
		this.bname = bname;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "MyBook [bname=" + bname + ", name=" + name + ", price=" + price + "]";
	}
	
	

}
