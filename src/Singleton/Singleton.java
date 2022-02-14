package Singleton;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Singleton {
	
	
String[] names = {"Ali","Ahmed","Hossam","Mohamed","Khaled","Abdo"};
	
	private List<String> names_list = Arrays.asList(names);
	
	
	private static volatile Singleton instance = new Singleton();
	
	public static Singleton getInstance() {
		
		if(instance == null) {
			synchronized (Singleton.class) {
				Thread.currentThread();
				try {Thread.sleep(1000); }catch(Exception e) {System.out.println();}
				instance = new Singleton();
			}
			
		}
		return instance;
	}
	
	private Singleton() {
		Collections.shuffle(names_list);
	}
	
	void getNames(){ 
		
		for(String name : names_list) {
			System.out.print(" " + name);
		}
		System.out.println();
	}
}
