package Decorator.Options;

import Decorator.Pizza;
import Decorator.Pizza_Decorator;

public class TomatoSauce extends Pizza_Decorator {
		
		
		public TomatoSauce(Pizza pizza) {
	        super(pizza);
	    }

	    @Override
	    public String getDescription() {
	        return super.getDescription() + ", TomatoSauce";
	    }

	    @Override
	    public double getCost() {
	        return super.getCost() + 4;
	    }
		
	}


