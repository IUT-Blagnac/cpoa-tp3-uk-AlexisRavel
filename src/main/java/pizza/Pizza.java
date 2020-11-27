package pizza;
import java.util.ArrayList;

public abstract class Pizza {
	
	protected String name;
	protected String crust;
	protected String sauce;
	protected ArrayList<String> garnitures;
	
	public void prepare() {
		System.out.println("Prepare pizz : " + this.name +" "+ this.crust +" "+ this.sauce +" "+ this.garnitures);
	}
	
	public void bake() {
		System.out.println("Baking");
	}
	
	public void cut() {
		System.out.println("Cuting");
	}
	
	public void wrap() {
		System.out.println("Wrapping");
	}
	
	public String getName() {
		return this.name;
	}

}
