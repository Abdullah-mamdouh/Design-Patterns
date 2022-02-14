package Singleton;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("**************************** Without Singleton ***************************");
		 
		withoutSingleton();
		
		System.out.println("**************************** Using Singleton ***************************");
		withSingleton();
		
		
	}
	
	static void withSingleton() {
		Singleton l1 = Singleton.getInstance();
		Singleton l2 = Singleton.getInstance();
		
		System.out.println(" " + l1.hashCode());
		l1.getNames();
		
		System.out.println( " " +  l2.hashCode());
		l2.getNames();
	}
	
	static void withoutSingleton() {
		Lazy_Singleton l1 = new Lazy_Singleton();
		Lazy_Singleton l2 = new Lazy_Singleton();
		
		System.out.println(" " + l1.hashCode());
		l1.getNames();
		
		System.out.println( " " +  l2.hashCode());
		l2.getNames();
	}
	
	
}
