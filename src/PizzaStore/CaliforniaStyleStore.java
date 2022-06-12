package PizzaStore;

public class CaliforniaStyleStore extends PizzaStore {

	public CaliforniaStyleStore(simplePizzaFactory factory) {
		super(factory);
		// TODO Auto-generated constructor stub
	}
	@Override
	Pizza createPizza(String item) {
		if(item.equals("cheese" )) { 
			 return new CaliforniaStylCheesePizza(); 
		 } else if (item.equals("Veggie" )){ 
			 return new CaliforniaStyleVeggiePizza();
		 } else if(item.equals("clam")) { 
			 return new CaliforniaStyleClamPizza();
		 }else if(item.equals("pepperoni")) { 
			 return  new CaliforniaStylePepperoniPizza();
		 }else return null; 
	}
}


