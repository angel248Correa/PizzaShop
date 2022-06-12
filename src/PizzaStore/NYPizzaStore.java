package PizzaStore;

public class NYPizzaStore extends PizzaStore {
	
	public NYPizzaStore(simplePizzaFactory factory) {
		super(factory);
		// TODO Auto-generated constructor stub
	}

	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory  ingredientFactory = 
				new NYPizzaIngredientFactory();
		
	
		if(item.equals("cheese" )) { 
			pizza =  new CheesePizza(ingredientFactory); 
			pizza.setName("New York Style Cheese Pizza");
			 
		 } else if (item.equals("Veggie")){ 
			 
			 pizza = new veggiePizza(ingredientFactory);
			 pizza.setName("New York Style Veggie Pizza");
			 
			 
		 } else if(item.equals("clam")) { 
			 pizza = new ClamPizza(ingredientFactory); 
			 pizza.setName("New York Style clam Pizza");
			 
			 
		 }else if(item.equals("pepperoni")) { 
			
			 pizza = new pepperoniPizza(ingredientFactory);
			 pizza.setName("New york style Peppperoni Pizza");
			 
		 } 
		return pizza; 
	}
}