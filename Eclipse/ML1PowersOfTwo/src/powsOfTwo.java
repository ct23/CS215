import java.util.Scanner;
import java.lang.Math;

/**
 * Accepts an integer n between 0 and 20
 * and prints the powers of 2 from 0 to n. 
 * @author Colin Klein
 * @date 19 Jan 2016
 * 
 *
 */

public class powsOfTwo {
	// Declare & instantiate scanner to get user input
	static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = promptInput();	// Prompt for user input
		run(n);	// Run calculation & print
	}
	
	/*
	 * Prompts user for input.
	 */
	public static int promptInput() {
		System.out.println("Please enter an integer between 0 and 20:");
		int n = reader.nextInt(); // scans next token of input as an int
		return n;
	}
	
	/*
	 * Runs calculation with user's specified int n
	 * Prints powers of 2 from 0 to n
	 */
	public static void run(int n) {
		// Run and print calculation
		for (int i = 0; i <= n; i++) {
			System.out.println(Math.pow(2, i));
		}
	}
	
}
