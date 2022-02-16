package Decorator.Options;

import Decorator.Pizza;
import Decorator.Pizza_Decorator;

public class Mushroom extends Pizza_Decorator {
	
	
	public Mushroom(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Mushroom";
    }

    @Override
    public double getCost() {
        return super.getCost() + 8;
    }
	
}