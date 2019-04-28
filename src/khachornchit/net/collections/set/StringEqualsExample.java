package khachornchit.net.collections.set;

// Both s1 and s2 refers to different objects.
// When one uses == operator for s1 and s2 comparison then the result is false as both have different addresses in memory.
// Using equals, the result is true because its only comparing the values given in s1 and s2.

public class StringEqualsExample {

	public static void main(String[] args) {
        String s1 = new String("HELLO"); 
        String s2 = new String("HELLO"); 
  
        System.out.println(s1 == s2); // This operator is used to compare the object
  
        System.out.println(s1.equals(s2)); 
	}

}
