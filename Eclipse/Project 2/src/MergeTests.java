import java.util.Arrays;

/**
 * Title: Merge Sort Tests
 */

/**
 * @author Colin
 * @date Mar 12, 2016
 *
 *
 * Modifications:
 * Date			Changes
 * 
 */
public class MergeTests {
	public void run(int arraySize, int numTests) {
		MergeSort sorter = new MergeSort();
		GenerateArrays arrayGenerator = new GenerateArrays();
		
		int[] array = new int[7];
		array[0] = 1;
		array[1] = 4;
		array[2] = 7;
		array[3] = 3;
		array[4] = 6;
		array[5] = 8;
		array[6] = 9;
		
		// Copy arrays, so as not to modify originals
		int[] usableArray = array.clone();
		
		//long duration = sorter.merge(usableArray, 0, 2, 6);
		
		System.out.println("Orig array:\n" + Arrays.toString(array));
		System.out.println("Merged array:\n" + Arrays.toString(usableArray));
		//System.out.println("Duration: " + duration);
	}
}
