/* CS 1301/9
 * Fall 2017   
 * Name: Aidan Murphy	
 * Instructor: Monisha Verma
 * Assignment: Lab 5
*/
package Lab5;

public class sumOfValues {

	public static void main(String[] args) {
		//declarations
		int i = 1;
		int sum = 0;
		//while loop adding sum and printing
		while (i <= 100) {
			sum += i;
			i++;
			System.out.println(sum);
		}
	}
}
