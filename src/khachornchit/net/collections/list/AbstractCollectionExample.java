package khachornchit.net.collections.list;

import java.util.*;

public class AbstractCollectionExample {

	public static void main(String[] args) {
		// Create an empty collection
		AbstractCollection<Object> arrayList = new ArrayList<Object>();

		// Use add() method to add
		// elements in the collection
		
		arrayList.add(null);
		
		arrayList.add("Welcome");
		arrayList.add("To");
		arrayList.add("Geeks");
		arrayList.add("4");
		arrayList.add("Geeks");
		
		arrayList.add("Welcome");
		arrayList.add("To");
		arrayList.add("Geeks");
		arrayList.add("4");
		arrayList.add("Geeks");
		
		// Displaying the Collection
		System.out.println("AbstractCollection ArrayList : " + arrayList);
			
		Set<Object> hashSet = new HashSet<Object>();
//		hashSet.add(null);
		hashSet.addAll(arrayList);
		System.out.println("HashSet: " + hashSet);
		
		arrayList.remove(null);
		Set<Object> treeSet = new TreeSet<Object>();
		treeSet.addAll(arrayList);
		System.out.println("TreeSet: " + treeSet);
	}

}
