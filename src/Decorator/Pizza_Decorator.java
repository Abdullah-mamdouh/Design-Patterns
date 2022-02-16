package Decorator;

public abstract  class Pizza_Decorator implements Pizza{
	
	private Pizza pizza ;
	
	public Pizza_Decorator(Pizza pizza) {
		// TODO Auto-generated constructor stub
		this.pizza = pizza ;
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return pizza.getCost();
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return pizza.getDescription();
	}

}
