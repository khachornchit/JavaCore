package khachornchit.net.collections.set;

import java.util.concurrent.ConcurrentSkipListSet;

public class ConcurrentSkipListSetLastExample {

	public static void main(String[] args) {
		// Initializing the set using ConcurrentSkipListSet()
		ConcurrentSkipListSet<Integer> set = new ConcurrentSkipListSet<Integer>();

		// Adding elements to this set
		// using add() method
		set.add(78);
		set.add(64);
		set.add(12);
		set.add(45);
		set.add(8);

		// Printing the ConcurrentSkipListSet
		System.out.println("ConcurrentSkipListSet: " + set);
		
		ConcurrentSkipListSet<Integer> cloneSet = set.clone();
		System.out.println("set.clone() :  " + cloneSet);

		// Printing the highest element of the set
		// using last() method
		System.out.println("Maximum value set.last() : " + set.last());

		// Retrieving and removing first element of the set
		System.out.println("The first element of the set: " + set.pollFirst());		

		// Checks if 9 is present in the set
		// using contains() method
		if (set.contains(9))
			System.out.println("9 is present in the set.");
		else
			System.out.println("9 is not present in the set.");

		// Printing the size of the set
		// using size() method
		System.out.println("set.size() : " + set.size());
		
		ConcurrentSkipListSet<Integer> rm = new ConcurrentSkipListSet<Integer>();
		rm.add(64);
		rm.add(78);
		
		set.removeAll(rm);
		System.out.println("set.removeAll(rm) : " + set);
		
		set.clear();
		System.out.println("set.clear() : " + set);
	}

}
