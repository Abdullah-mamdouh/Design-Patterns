package Decorator.Options;

import Decorator.Pizza;
import Decorator.Pizza_Decorator;

class Meat extends Pizza_Decorator {
	
	
	public Meat(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Meat";
    }

    @Override
    public double getCost() {
        return super.getCost() + 10;
    }
	
}