package prj0831;

public class Bucket {
	
	String object = "";
	String year = "";
	String importance = "";
	
	
	public Bucket() {
		// TODO Auto-generated constructor stub
	}
	
	public Bucket(String object, String year, String importance) {
		super();
		this.object = object;
		this.year = year;
		this.importance = importance;
	}
	
	public String getObject() {
		return object;
	}
	public void setObject(String object) {
		this.object = object;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getImportance() {
		return importance;
	}
	public void setImportance(String importance) {
		this.importance = importance;
	}

	@Override
	public String toString() {
		return "Bucket [object=" + object + ", year=" + year + ", importance=" + importance + "]";
	}
	
	
	
	

}
