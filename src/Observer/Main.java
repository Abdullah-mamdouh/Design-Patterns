package Observer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Client c1 = new Client("Ali");
		Client c2 = new Client("Omr");
		Client c3 = new Client("Sam");
		
		Bank_Share bankShare = new Bank_Share("AJX_57", 5000);
		
		bankShare.add(c1);
		bankShare.add(c2);
		bankShare.add(c3);
		
		
		bankShare.setAvailability(true);
	}
	
}