package movie;

public class Movie {
	String name;
	int runtime;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRuntime() {
		return runtime;
	}
	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}
	
	public Movie() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Movie(String name, int runtime) {
		super();
		this.name = name;
		this.runtime = runtime;
	}
	
	
	@Override
	public String toString() {
		return "Movie [name=" + name + ", runtime=" + runtime + "]";
	}
	
}
