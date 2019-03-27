package pluto.collections.set;

// Java program to demonstrate difference between 
// HashSet, LinkedHashSet and TreeSet 
// according to insertion order and insertion time 

// When to use HashSet, TreeSet and LinkedHashSet in Java:
// HashSet: If you don’t want to maintain insertion order but want store unique objects.
// LinkedHashSet: If you want to maintain insertion order of elements then you can use LinkedHashSet. FIFO
// TreeSet: If you want to sort the elements according to some Comparator then use TreeSet.

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

class CompareSets {
	// Function show insertion order of LinkedHashSet, TreeSet and HashSet

	private static void insertionOrder() {
		LinkedHashSet<String> linkSet = new LinkedHashSet<>();
		TreeSet<String> treeSet = new TreeSet<>();
		HashSet<String> hashSet = new HashSet<String>();

		// Add three object in
		// LinkedHashSet and TreeSet
		for (String str : Arrays.asList("Geek2", "Geek1", "Geek3", "Geek1", "Geek4", "Geek5")) {
			hashSet.add(str);
			linkSet.add(str);
			treeSet.add(str);
		}

		// should be sorted order HashSet
		// stores element in sorted order
		System.out.println("HashSet :" + hashSet);

		// insertion order or elements LinkedHashSet
		// stored elements as insertion
		System.out.println("LinkedHashSet :" + linkSet);

		// should be sorted order TreeSet
		// stores element in sorted order
		System.out.println("TreeSet :" + treeSet);

		System.out.println();
	}

	// Function calculate insertion time of
	// 1000 objects of LinkedHashSet,
	// TreeSet and HashSet

	private static void insertionTime() {
		// HashSet performance Test
		// inserting 1000 elements
		HashSet<Integer> numbersHS = new HashSet<>();
		long startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			numbersHS.add(i);
		}
		long endTime = System.nanoTime();
		System.out.println(String.format("HashSet insert 1,000 elements in %,d sec.", endTime - startTime));

		// LinkedHashSet performance Test
		// inserting 1000 elements
		LinkedHashSet<Integer> numbersLLS = new LinkedHashSet<>();

		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			numbersLLS.add(i);
		}
		endTime = System.nanoTime();
		System.out.println(String.format("LinkedHashSet insert 1,000 elements in %,d sec.", endTime - startTime));

		// TreeSet performance Test inserting 1000 objects
		TreeSet<Integer> numbersTS = new TreeSet<>();

		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			numbersTS.add(i);
		}
		endTime = System.nanoTime();
		System.out.println(String.format("TreeSet insert 1,000 elements in %,d sec.", endTime - startTime));

		System.out.println();
	}

	// Function calculate deletion time
	// of 1000 objects LinkedHashSet,
	// TreeSet and HashSet
	// Deletion time always vary
	private static void deletion() {
		// HashSet performance Test inserting
		// and deletion 1000 elements
		HashSet<Integer> deletionHS = new HashSet<>();

		for (int i = 0; i < 10000; i++) {
			deletionHS.add(i);
		}

		long startingTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			deletionHS.remove(i);
		}

		long endedTime = System.nanoTime();
		System.out.println(
				String.format("HashSet deleted 1,000 elements in %,d sec.", Math.abs(startingTime - endedTime)));

		// LinkedHashSet performance Test inserting
		// and deletion 1000 elements
		LinkedHashSet<Integer> deletionLLS = new LinkedHashSet<>();

		for (int i = 0; i < 10000; i++) {
			deletionLLS.add(i);
		}
		startingTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			deletionLLS.remove(i);
		}

		endedTime = System.nanoTime();
		System.out.println(
				String.format("LinkedHashSet deleted 1,000 elements in %,d sec.", Math.abs(startingTime - endedTime)));

		// TreeSet performance Test inserting
		// and deletion 1000 elements
		TreeSet<Integer> deletionTS = new TreeSet<>();

		for (int i = 0; i < 10000; i++) {
			deletionTS.add(i);
		}

		startingTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			deletionTS.remove(i);
		}

		endedTime = System.nanoTime();
		System.out.println(
				String.format("TreeSet deleted 1,000 elements in %,d sec.", Math.abs(startingTime - endedTime)));

		System.out.println();
	}

	public static void main(String args[]) {
		insertionOrder();
		insertionTime();
		deletion();
	}
}
