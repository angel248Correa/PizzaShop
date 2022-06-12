package PizzaStore;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		
		return new ThinCrustDough(); 
	}

	@Override
	public Sauce createSauce() {
	
		return new MarinaraSauce();
	}

	@Override
	public Cheese createCheese() {
		
		return ReggianoCheese;
	}

	@Override
	public Veggie[] createVeggies() {
		Vegggie veggie[] = { new Garlic(), new Onion, new Mashroom, new Redpepper()};
		return veggie;
	}

	@Override
	public pepperoni createPepperoni() {
	 
		return new SlicePepperoni();
	}

	@Override
	public Clams createClam() {
		
		return new FreshClams();
	}

}
