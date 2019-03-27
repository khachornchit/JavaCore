package pluto.collections.set;

// Java program to illustrate 
// CopyOnWriteArraySet class 
import java.util.concurrent.*;
import java.util.*;

class ConcurrentExample extends Thread {

	static CopyOnWriteArraySet<String> l = new CopyOnWriteArraySet<String>();

	public void run() {
		// Child thread trying to add
		// new element in the Set object
		l.add("D");
	}

	public static void main(String[] args) {
		l.add("A");
		l.add("B");
		l.add("C");

		// We create a child thread
		// that is going to modify
		// CopyOnWriteArraySet l.
		ConcurrentExample t = new ConcurrentExample();
		t.start();

		// Wait for the thread to
		// add the element.
		try {
			System.out.println("Sleep 2000");
			Thread.sleep(2000);
			System.out.println(l);
		} catch (InterruptedException e) {
			System.out.println("child going to add element");
		}

		// Now we iterate through the
		// CopyOnWriteArraySet and we
		// wont get exception.
		Iterator<String> itr = l.iterator();
		while (itr.hasNext()) {
			String s = (String) itr.next();
			System.out.println(s);

			if (s.equals("C")) {
				// Here we will get
				// RuntimeException
				itr.remove();
			}
		}
	}
}
