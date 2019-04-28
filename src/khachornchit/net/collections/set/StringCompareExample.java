package khachornchit.net.collections.set;

public class StringCompareExample {

	public static void main(String[] args) {
        String string1 = new String("Geeksforgeeks"); 
        String string2 = new String("Practice"); 
        String string3 = new String("Geeks"); 
        String string4 = new String("Geeks"); 
        String string5 = new String("geeks"); 
        
        // Comparing for String 1 != String 2 
        System.out.println("Comparing " + string1 + " and " + string2 
                           + " : " + string1.equals(string2)); 
  
        // Comparing for String 3 = String 4 
        System.out.println("Comparing " + string3 + " and " + string4 
                           + " : " + string3.equals(string4)); 
        
        System.out.println();  
        // Comparing for String 4 != String 5 
        System.out.println("Comparing " + string4 + " and " + string5 
                           + " : " + string4.equals(string5));
        System.out.println("Comparing Ignore Case " + string4 + " and " + string5 
                + " : " + string4.equalsIgnoreCase(string5)); 
  
        System.out.println();
        // Comparing for String 1 != String 4 
        System.out.println("Comparing " + string1 + " and " + string4 
                           + " : " + string1.equals(string4));         
        
        System.out.println();
        System.out.println("compareTo()");
        System.out.println("Start with the max length String !");
        System.out.println("It will return (size of diff) in - when not found!, ");
        System.out.println("It will return (size of diff in) + when found the follow string !");
        System.out.println("("+string1 + ").compareTo(" + string2 
                + ") : " + string1.compareTo(string2)); 
        System.out.println("("+string1 + ").compareTo(" + string3 
                + ") : " + string1.compareTo(string3));         
	}

}
