package Decorator;

import Decorator.Options.Cheese;
import Decorator.Options.Mushroom;
import Decorator.Options.TomatoSauce;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new TomatoSauce(new BasicPizza())
		
		Pizza pizza = new Cheese(new Mushroom(new TomatoSauce(new BasicPizza())));

        System.out.printf("Description: %s%n", pizza.getDescription());
        System.out.printf("Cost: %.2f", pizza.getCost());

	}

}
