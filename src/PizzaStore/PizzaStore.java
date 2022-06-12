package PizzaStore;

public  abstract class PizzaStore {
	simplePizzaFactory factory; 
	
	public PizzaStore(simplePizzaFactory factory ) { 
		this.factory = factory; 
		
	}
	public Pizza orderPizza(String type) {
		Pizza pizza; 
		
		pizza = createPizza(type); 
		
		pizza.prepare(); 
		pizza.bake(); 
		pizza.cut(); 
		pizza.box(); 
		
		return pizza; 
	}
	
	 abstract Pizza createPizza(String type);

}
