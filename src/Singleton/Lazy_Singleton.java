package Singleton;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Lazy_Singleton {
	
	
	String[] names = {"Ali","Ahmed","Hossam","Mohamed","Khaled","Abdo"};
	
	private List<String> names_list = Arrays.asList(names);
	
	public Lazy_Singleton() {
		Collections.shuffle(names_list);
	}
	
	void getNames(){ 
		
		for(String name : names_list) {
			System.out.print(" " + name);
		}
		System.out.println();
	}
}
