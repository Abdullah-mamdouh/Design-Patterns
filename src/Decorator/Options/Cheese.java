package Decorator.Options;

import Decorator.Pizza;
import Decorator.Pizza_Decorator;


public class Cheese extends Pizza_Decorator {
		
		
		public Cheese(Pizza pizza) {
	        super(pizza);
	    }

	    @Override
	    public String getDescription() {
	        return super.getDescription() + ", Cheese";
	    }

	    @Override
	    public double getCost() {
	        return super.getCost() + 6;
	    }
		
	}

