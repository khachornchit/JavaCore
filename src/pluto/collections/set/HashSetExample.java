package pluto.collections.set;

import java.util.*;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<String> h = new HashSet<String>();

		// Adding elements into HashSet usind add()
		h.add(null);
		h.add("India");
		h.add("Australia");
		h.add("South Africa");
		h.add("India");// adding duplicate elements
		h.add(null);

		// Displaying the HashSet
		System.out.println("HashSet : " + h);
		System.out.println("Does contain India ? " + h.contains("India"));

		// Removing items from HashSet using remove()
		h.remove("Australia");
		System.out.println("After removing Australia:" + h);

		// Iterating over hash set items
		System.out.println("Iterating over list:");
		Iterator<String> i = h.iterator();
		while (i.hasNext())
			System.out.println(i.next());
	}

}
