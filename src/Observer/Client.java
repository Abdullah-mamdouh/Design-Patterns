package Observer;

public class Client implements Observer{
	
	
	private String name;
	
    public Client(String name) {
		// TODO Auto-generated constructor stub
    	this.name = name;
	}

	@Override
	public void update(String Message) {
		// TODO Auto-generated method stub
		System.out.println(this.name  +  " is recived New Notification about " + Message);
		
	}
	
	

}
