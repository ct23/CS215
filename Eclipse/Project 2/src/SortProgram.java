import java.util.Scanner;

/**
 * Title: Sort Program
 * 
 * Description: Driver for the sort program.
 */

/**
 * @author Colin
 * @date Jan 31, 2016
 *
 *
 * Modifications:
 * Date			Changes
 * 
 */

public class SortProgram {

	public static void main(String[] args) {
		Tests tester = new Tests();
		Scanner reader = new Scanner(System.in);
		try {
			// Prompt user for size of array
			System.out.println("How many ints would you like in your array?");
			int arraySize = reader.nextInt();
			// Prompt user for number of tests
			System.out.println("How many tests would you like to run?");
			int numTests = reader.nextInt();
			
			tester.run(arraySize, numTests);
		} finally {
			reader.close();	// (must close reader for proper resource cleanup)
		}
		
		//MergeTests mergeTester = new MergeTests();
		//mergeTester.run(0,0);
		//mergeTester.run(0, 0);
		
		//HeapTests heapTester = new HeapTests();
		//heapTester.run(0,0);
		
	}

}
