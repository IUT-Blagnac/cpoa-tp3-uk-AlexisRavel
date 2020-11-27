package pizza;

public abstract class Pizzeria {
	
	private PizzaFactory pizzaFactory;
	
	public Pizzeria(PizzaFactory pizzaFactory) {
		
		this.pizzaFactory = pizzaFactory;
		
	}

	public Pizza orderPizza(String type) {
		
		return this.createPizza(type);
		
	}
	
	protected Pizza createPizza(String type) {
		
		return pizzaFactory.create(type);
		
	}

}
