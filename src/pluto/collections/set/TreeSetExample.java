package pluto.collections.set;

import java.util.*; 

public class TreeSetExample {

	public static void main(String[] args) {
        TreeSet<String> ts1 = new TreeSet<String>(); 
        
        // Elements are added using add() method 
        ts1.add("G"); 
        ts1.add("B"); 
        ts1.add("H"); 
        ts1.add("A"); 
//        ts1.add(null);        // Exception in thread "main" java.lang.NullPointerException 
        ts1.add("C");
        
 
        // Duplicates will not get insert 
        ts1.add("C"); 
  
        // Elements get stored in default natural 
        // Sorting Order(Ascending) 
        System.out.println(ts1); 
	}

}
