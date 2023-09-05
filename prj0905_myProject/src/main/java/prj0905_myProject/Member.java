package prj0905_myProject;

public class Member {
	String id;
	String name;
	String phone;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return getName();
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Member(String id, String name, String phone) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", phone=" + phone + "]";
	}
	
}
