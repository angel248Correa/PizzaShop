package PizzaStore;

public interface PizzaIngredientFactory {

		
	
	public Dough createDough(); 
	public Sauce createSauce(); 
	public Cheese createCheese(); 
	public Veggie[] createVeggies(); 
	public pepperoni createPepperoni(); 
	public Clams createClam();
	
}
