/* CS 1301/9
 * Fall 2017   
 * Name: Aidan Murphy	
 * Instructor: Monisha Verma
 * Assignment: Lab 5
*/
package Lab5;

public class EvenandOdd {

	public static void main(String[] args) {
		//declarations
		int i = 50;
		int o = 50;
		boolean x = false;
		System.out.print("Even numbers between 0 and 100: ");
		//while loop for even numbers
		while (i<=100) {
			int checker = i%2;
			
			if (x== false) {
				System.out.print(i);
				x = true;
			}
			
			if (checker == 0) {
				System.out.print(", " + i);
			} 
			
			i++;
		}
		//moves to new line
		System.out.println();
		System.out.print("Odd numbers between 0 and 100: ");
		//while loop for odd numbers
		while (o<=100) {
			int checker = o%2;
			if (checker != 0) {
				System.out.print(o + ", ");
			} 
			o++;
		}

	}

}
