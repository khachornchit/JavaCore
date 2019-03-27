package pluto.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSample {

	public static <E> void main(String[] args) {
		
		// size of ArrayList
		int n = 5;

		// declaring ArrayList with initial size n
		List<Integer> al = new ArrayList<>(n);

		// Appending the new element at the end of the list
		for (int i = 1; i <= n; i++) {
			al.add(i);
			al.add(i);
		}

		// Printing elements
		System.out.println(al);

		// Remove element at index 3
		al.remove(3);

		// Displaying ArrayList after deletion
		System.out.println(al);

		// Printing elements one by one
		for (int i = 0; i < al.size(); i++) {
			System.out.print(al.get(i) + " ");
		}
	}

}
