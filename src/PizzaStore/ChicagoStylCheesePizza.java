package PizzaStore;

public class ChicagoStylCheesePizza extends Pizza {

	public ChicagoStylCheesePizza () {
		name = "Chicago Style Deep Dish Cheese Pizza";
		dough = "Extra thick Crust Dough";
		sauce = "Plum Tomato Sauce"; 
		
		toppings.add("Sheredded Mozzrella Cheese");
		
	}
	
	public void cut () { 
		System.out.println("cutting the pizza into square slices");
	}
}
