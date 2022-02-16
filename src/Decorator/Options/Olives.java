package Decorator.Options;

import Decorator.Pizza;
import Decorator.Pizza_Decorator;

public class Olives extends Pizza_Decorator {
	
	
	public Olives(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Olives";
    }

    @Override
    public double getCost() {
        return super.getCost() + 5;
    }
	
}
