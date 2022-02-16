package Observer;

import java.util.ArrayList;
import java.util.List;

public class Bank_Share implements Subject {
	
	private String name;
	private double value;
	private boolean availability;
	
	public Bank_Share(String name, double value) {
		this.name = name;
		this.value = value;
	}
	
	List<Observer> observerList = new ArrayList();
	
	void setAvailability(boolean available) {
		this.availability = available;
		notifyAllObservers();
	}

	@Override
	public void add(Observer observer) {
		// TODO Auto-generated method stub
		observerList.add(observer);
		
	}

	@Override
	public void remove(Observer observer) {
		// TODO Auto-generated method stub
		observerList.remove(observer);
		
	}

	@Override
	public void notifyAllObservers() {
		// TODO Auto-generated method stub
		for(Observer observer : observerList) {
			observer.update(this.name + " = "+ value + " is " + (availability ? "Available" : "Not Available"));
		}
		
	}
	
	

}
