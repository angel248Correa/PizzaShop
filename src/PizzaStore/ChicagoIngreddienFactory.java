 package PizzaStore;

public class ChicagoIngreddienFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
	
		return new ThickCrustDough;
	}

	@Override
	public Sauce createSauce() {

		return new TomatoSauce;
	}

	@Override
	public Cheese createCheese() {
		
		return new MozzarellaCheese;
	}

	@Override
	public Veggie[] createVeggies() {
		Veggie veggies[] = {new blackOlives(), new spinish(), new eggplant()};
	
		return veggies ;
	}

	@Override
	public pepperoni createPepperoni() {
		
		return new SlicePepperoni();
	}

	@Override
	public Clams createClam() {
		
		return FrozenClams;
	}

}
