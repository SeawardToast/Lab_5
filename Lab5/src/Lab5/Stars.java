/* CS 1301/9
 * Fall 2017   
 * Name: Aidan Murphy	
 * Instructor: Monisha Verma
 * Assignment: Lab 5
*/
package Lab5;

public class Stars {

	public static void main(String[] args) {
		//nested for loop displaying star pattern
		for (int i=1; i<=10; i++) {
			System.out.println();
			
			for (int k=10; k>=i; k--) {
				System.out.print("*");
			}
		}
	}
}


