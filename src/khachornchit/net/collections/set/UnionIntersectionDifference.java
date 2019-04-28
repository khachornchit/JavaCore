package khachornchit.net.collections.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnionIntersectionDifference {

	public static void main(String[] args) {
        Set<Integer> a = new HashSet<Integer>(); 
        a.addAll(Arrays.asList(new Integer[] {1, 3, 2, 4, 8, 9, 0})); 
        Set<Integer> b = new HashSet<Integer>(); 
        b.addAll(Arrays.asList(new Integer[] {1, 3, 7, 5, 4, 0, 7, 5}));
        
        System.out.println("a : " + a);
        System.out.println("b : " + b);
  
        // To find union 
        Set<Integer> union = new HashSet<Integer>(a); 
        union.addAll(b); 
        System.out.println("Union : " + union);
  
        // To find intersection 
        Set<Integer> intersection = new HashSet<Integer>(a); 
        intersection.retainAll(b); 
        System.out.println("Intersection : " + intersection);
  
        // To find the symmetric difference 
        Set<Integer> difference = new HashSet<Integer>(a); 
        difference.removeAll(b); 
        System.out.println("Difference : " + difference); 
	}

}