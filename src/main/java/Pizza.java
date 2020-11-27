import java.util.ArrayList;

public abstract class Pizza {
	
	String name;
	String crust;
	String sauce;
	ArrayList<String> garnitures;
	
	public void prepare() {}
	
	public void bake() {}
	
	public void cut() {}
	
	public void wrap() {}
	
	public String getName() {
		return this.name;
	}

}
