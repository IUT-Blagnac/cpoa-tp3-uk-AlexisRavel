package pizza;

public class PizzaFactoryBrest extends PizzaFactory{
	
private static PizzaFactoryBrest instance = new PizzaFactoryBrest();
	
	private PizzaFactoryBrest() {}
	
	public static PizzaFactoryBrest getInstance() {
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
