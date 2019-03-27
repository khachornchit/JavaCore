package pluto.collections.list;

import java.util.*;

public class AbstractCollectionExample {

	public static void main(String[] args) {
		// Create an empty collection
		AbstractCollection<Object> abs = new ArrayList<Object>();

		// Use add() method to add
		// elements in the collection
		abs.add("Welcome");
		abs.add("To");
		abs.add("Geeks");
		abs.add("4");
		abs.add("Geeks");
		
		abs.add("Welcome");
		abs.add("To");
		abs.add("Geeks");
		abs.add("4");
		abs.add("Geeks");
		
		// Displaying the Collection
		System.out.println("AbstractCollection: " + abs);
		
		Set<Object> treeSet = new TreeSet<Object>();
		treeSet.addAll(abs);
		System.out.println("TreeSet: " + treeSet);
		
		Set<Object> hashSet = new HashSet<Object>();
		hashSet.add(null);
		hashSet.addAll(abs);
		System.out.println("HashSet: " + hashSet);
	}

}
