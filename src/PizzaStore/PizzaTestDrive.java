package PizzaStore;

public class PizzaTestDrive {

	public static void main(String[] args) {
		PizzaStore nystore = new NYPizzaStore(null); 
		PizzaStore chicagoStore =  new ChicagoPizzaStore(null); 
		
		
		Pizza pizza =  nystore.orderPizza("cheese");
		System.out.println("Ethan orderd a  " + pizza.getName() + "\n");
		
		pizza  =  chicagoStore.orderPizza("cheese"); 
		System.out.println("joel ordered a  "  + pizza.getName() + "\n"); 
		

	}

}
