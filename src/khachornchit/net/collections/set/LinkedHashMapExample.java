package khachornchit.net.collections.set;

// Important : Keeping the insertion order in both LinkedHashmap and LinkedHashset have additional associated costs, 
// both in terms of spending additional CPU cycles and needing more memory.
// If you do not need the insertion order maintained, 
// it is recommended to use the lighter-weight HashSet and HashMap instead.

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		Map<String, Integer> linkedHashMap = new LinkedHashMap<String, Integer>();
		
		linkedHashMap.put("Geeks-1", 4);
		linkedHashMap.put("Geeks-2", 4);
		linkedHashMap.put("Welcome", 8);
		linkedHashMap.put("Map", 12);
		
		System.out.println(linkedHashMap);
	}

}
