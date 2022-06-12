package PizzaStore;

import java.awt.geom.Arc2D.Double;
import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;

public abstract class Pizza {
	
	String name;
	
	Double  Dough; 
	Double  Sauce;
	Double Veggies[]; 
	 Double Cheese; 
	 Double pepperoni; 
	 Double Clams;

	
	abstract void prepare();
		
		void bake() { 
		System.out.println("bake for 25 minute at 350");	
	}
	
		void cut () { 
		System.out.println("Cutting the pizza into diagonal slices");
	}
	
		void box () { 
		System.out.println("Place pizza in offical PizzaStore box");
	}
		void setName(String name) { 
			this.name = name; 
		}
	
	public String getName() { 
		return name; 
	}
	public String toString() {
		return name; 
		
	}
}
