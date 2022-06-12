package PizzaStore;

public class ChicagoPizzaStore extends PizzaStore {
		
		public ChicagoPizzaStore(simplePizzaFactory factory) {
		super(factory);
		// TODO Auto-generated constructor stub
	}

		Pizza createPizza(String item) {
			
			 if(item.equals("cheese")) { 
				  return new ChicagoStylCheesePizza();
			 } else if(item.equals("veggie")) { 
				 return  new ChicagoStyleVeggiePizza();  
			 } else if(item.equals("clam")) {
				 return new ChicagoStyleClamPizza(); 
			 } else if(item.equals("pepperoni")) { 
				 return new ChicagoStylePepperoniPizza();
			 }
			return null;
		
	}

}
