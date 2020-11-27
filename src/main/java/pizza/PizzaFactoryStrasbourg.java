package pizza;

public class PizzaFactoryStrasbourg extends PizzaFactory{
	
private static PizzaFactoryStrasbourg instance = new PizzaFactoryStrasbourg();
	
	private PizzaFactoryStrasbourg() {
		
	}
	
	public static PizzaFactoryStrasbourg getInstance() {
		return instance;
	}

	@Override
	public Pizza create(String name) {
		Pizza pizza = null;

		if(name == "cheese") {
			pizza = new PizzaCheeseStyleBrest();
			pizza.prepare();
			pizza.bake();
			pizza.cut();
			pizza.wrap();
		}
		if(name == "poivron") {
			pizza = new PizzaPoivronStyleBrest();
			pizza.prepare();
			pizza.bake();
			pizza.cut();
			pizza.wrap();
		}
		if(name == "Grecque") {
			pizza = new PizzaGrecqueStyleBrest();
			pizza.prepare();
			pizza.bake();
			pizza.cut();
			pizza.wrap();
		}
		
		return pizza;
	}

}
