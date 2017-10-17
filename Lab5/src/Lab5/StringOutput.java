/* CS 1301/9
 * Fall 2017   
 * Name: Aidan Murphy	
 * Instructor: Monisha Verma
 * Assignment: Lab 5
*/
package Lab5;
import java.util.Scanner;

public class StringOutput {

	public static void main(String[] args) {
		//decalring scanner
		Scanner s = new Scanner(System.in);
		//prompting user for input
		System.out.println("Enter a string");
		String s1 = s.nextLine();
		//for loop displaying output
		for (int i = 0; i<s1.length(); i++) {
			System.out.println("Character #" + (i+1) + ": \t" + s1.charAt(i));
		}

	}

}
