package net.putfirstthingsfirst.collection.set;

import java.util.*;

public class SetApproach {

	public static void main(String[] args) {
		
        Set<String> set = new HashSet<String>(); 
        
		set.add("Ant");
		set.add("Banana");
		set.add("Cat");
		set.add("Dog");
		set.add("Dog");
		set.add("Dog");
		set.add("Dog");
		set.add("Dog");
		set.add("Elephant");
		set.add("AntAnt");
        
        System.out.println(set); 
  
        System.out.println("\nhashSet.contains(\"Dog\") : " + set.contains("Dog"));
        
        set.remove("Dog");
        
        System.out.println("\nhashSet after remove Dog : " + set);
        
        System.out.println("\nUse Iterator ...");
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext())
			System.out.println(iterator.next());
	}

}
