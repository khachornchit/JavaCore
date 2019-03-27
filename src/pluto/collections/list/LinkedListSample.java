package pluto.collections.list;

import java.util.LinkedList;

/**
 * 
 * @author pluto
 *
 */
public class LinkedListSample {

	public static void main(String[] args) {
		LinkedList<String> lString = new LinkedList<String>();
		lString.add("hello1");
		lString.add("hello2");
		lString.add("hello3");
		lString.add("hello4");
		lString.add("hello5");

		lString.addFirst("Header");
		lString.addLast("Footer");

		System.out.println(lString);
		System.out.println(lString.get(0));

		lString.set(1, "item 1 update");
		System.out.println(lString.get(1));
		
		lString.removeFirst();
		lString.removeFirst();
		System.out.println();
		System.out.println("print lString after remove First");
		System.out.println(lString);
		lString.addLast("Latest 1");
		lString.addLast("Latest 2");
		
		System.out.println();
		System.out.println("print All");
		lString.forEach((x)-> {
			System.out.println(x);
		});
	}

}
