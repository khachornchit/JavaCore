package pluto.basics;

/**
 * 
 * @author pluto
 *
 */
public class LoopsConcept {

	public static void main(String[] args) {
		int i = 1;

		System.out.println("while loop");
		while (i <= 10) {
			System.out.println("i = " + i++);
		}
		
		System.out.println("for loop");
		for (int j = 0; j < 10; j++) {
			System.out.println("i = " + j);
		}
	}

}