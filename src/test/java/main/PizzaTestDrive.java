package main;

import pizza.Pizza;
import pizza.Pizzeria;
import pizza.PizzeriaFactory;

public class PizzaTestDrive {
	
	public static void main(String[] args) {
		
		PizzeriaFactory factory = PizzeriaFactory.getInstance();
		
        Pizzeria brest = factory.create("Brest");
        Pizzeria strasbourg = factory.create("Strasbourg");
        
        Pizza pizza = brest.orderPizza("cheese");
        System.out.println("Pizza ordered : " + pizza.getName() + "\n");

        pizza = strasbourg.orderPizza("cheese");
        System.out.println("Pizza ordered : " + pizza.getName() + "\n");
    }

}
