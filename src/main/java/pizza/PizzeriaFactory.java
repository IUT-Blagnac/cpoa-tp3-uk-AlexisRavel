package pizza;

public class PizzeriaFactory {
	
	private static PizzeriaFactory uniqueInstance = new PizzeriaFactory();
	
	public PizzeriaFactory() {}
	
	public static PizzeriaFactory getInstance() {
		return uniqueInstance;
	}

	public Pizzeria create(String string) {
		
		if(string == "Brest") {
			return new PizzeriaBrest(PizzaFactoryBrest.getInstance());
		}
		
		if(string == "Strasbourg") {
			return new PizzeriaStrasbourg(PizzaFactoryStrasbourg.getInstance());
		}
		
		else {
			return null;
		}
		
	}

}
