package PizzaStore;

public class simplePizzaFactory {

	public Pizza createPizza(String type) { 
		Pizza pizza = null; 
		
		if(type.equals("chesse")) { 
			pizza =  new chessePizza(); 
		} else if (type.equals("peperoni")) { 
			pizza = new PepperoniPizza();
		}else if (type.equals("calm")) { 
			pizza = new ClamPizza(); 
		} else if(type.equals("veggie")) { 
			pizza = new VeggiePizza(); 
		}
		return pizza;
	}
}
