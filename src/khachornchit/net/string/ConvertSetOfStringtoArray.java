package khachornchit.net.string;

// Java program to convert 
// Set of Strings to Array of Strings 

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class ConvertSetOfStringtoArray {

	// Function to convert Set<String> to String[]
	public static String[] Method1NativeConvert(Set<String> setOfString) {

		// Create String[] of size of setOfString
		String[] arrayOfString = new String[setOfString.size()];

		// Copy elements from set to string array
		// using advanced for loop
		int index = 0;
		for (String str : setOfString)
			arrayOfString[index++] = str;

		// return the formed String[]
		return arrayOfString;
	}

	public static String[] Method2Set2Array(Set<String> setOfString) {
		return setOfString.toArray(new String[0]);
	}

	public static String[] Method3CopyOf(Set<String> setOfString) {
		return Arrays.copyOf(setOfString.toArray(), setOfString.size(), String[].class);
	}

	public static String[] Method4SystemArrayCopy(Set<String> setOfString) {
		String[] arrayOfString = new String[setOfString.size()];
		System.arraycopy(setOfString.toArray(), 0, arrayOfString, 0, setOfString.size());
		return arrayOfString;
	}

	public static String[] Method5Stream(Set<String> setOfString) {
		return setOfString.stream().toArray(String[]::new);
	}

	public static void main(String[] args) {
		// Get the Set of String
		Set<String> setOfString = new HashSet<>(Arrays.asList("Geeks", "ForGeeks", "A Computer Portal"));

		// Print the setOfString
		System.out.println("Set of String: " + setOfString);

		// Print the arrayOfString
		System.out.println();
		System.out.println("Method 1 : Native convert");
		System.out.println(Arrays.toString(Method1NativeConvert(setOfString)));

		System.out.println();
		System.out.println("Method 2 : Set.toArray()");
		System.out.println(Arrays.toString(Method2Set2Array(setOfString)));

		System.out.println();
		System.out.println("Method 3 : Arrays.copyOf()");
		System.out.println(Arrays.toString(Method3CopyOf(setOfString)));

		System.out.println();
		System.out.println("Method 4 : System.arrayCopy()");
		System.out.println(Arrays.toString(Method4SystemArrayCopy(setOfString)));
		
		System.out.println();
		System.out.println("Method 5 : Set.stream().toArray()");
		System.out.println(Arrays.toString(Method5Stream(setOfString)));
	}
}
