package PizzaStore;

public class chessePizza extends Pizza {

	PizzaIngredientFactory ingredientFactory; 
	
	public void CheesePizza(PizzaIngredientFactory ingredientFactory) { 
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	void prepare() {
		System.out.println("preparing  " + name);
		dough = ingredientFactory.createDough(); 
		sauce = ingredientFactory.createSauce(); 
		cheese = ingredientFactory.createCheese(); 
		
	}
	
}
