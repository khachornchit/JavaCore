package khachornchit.net.hashing;

import java.util.Hashtable;

public class HashTableSample {

	public static void main(String[] args) {
		Hashtable<Object, Object> h = new Hashtable<Object, Object>();

		h.put("A", "Hello A");
		h.put("B", "Hello B");
		h.put("C", "Hello C");

		h.put(1, 100);
		h.put(2, 200);

		System.out.println("h.size() = " + h.size());
		System.out.println("B = " + h.get("B"));
		System.out.println("A = " + h.get("A"));
		System.out.println("2 = " + h.get(2));

		System.out.println();
		System.out.println("Print All");
		h.forEach((k, v) -> {
			System.out.println(k + " = " + v);
		});
	}

}