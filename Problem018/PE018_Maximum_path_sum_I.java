import java.util.Iterator;
import java.util.Vector;

/**
 * Maximum path sum I
 * Problem 18
 * 
 * By starting at the top of the triangle below and moving to adjacent numbers
 * on the row below, the maximum total from top to bottom is 23.
 * 
 *    3
 *   7 4
 *  2 4 6
 * 8 5 9 3
 * 
 * That is, 3 + 7 + 4 + 9 = 23.
 * 
 * Find the maximum total from top to bottom of the triangle below:
 * 
 *               75
 *              95 64
 *             17 47 82
 *            18 35 87 10
 *           20 04 82 47 65
 *          19 01 23 75 03 34
 *         88 02 77 73 07 63 67
 *        99 65 04 28 06 16 70 92
 *       41 41 26 56 83 40 80 70 33
 *      41 48 72 33 47 32 37 16 94 29
 *     53 71 44 65 25 43 91 52 97 51 14
 *    70 11 33 28 77 73 17 78 39 68 17 57
 *   91 71 52 38 17 14 91 43 58 50 27 29 48
 *  63 66 04 68 89 53 67 30 73 16 69 87 40 31
 * 04 62 98 27 23 09 70 98 73 93 38 53 60 04 23
 * 
 * NOTE: As there are only 16384 routes, it is possible to solve this problem by
 * trying every route. However, Problem 67, is the same challenge with a
 * triangle containing one-hundred rows; it cannot be solved by brute force, and
 * requires a clever method! ;o)
 */
public class sol {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		int arr[] = { 75, 95, 64, 17, 47, 82, 18, 35, 87, 10, 20, 4, 82, 47,
				65, 19, 1, 23, 75, 03, 34, 88, 2, 77, 73, 7, 63, 67, 99, 65, 4,
				28, 6, 16, 70, 92, 41, 41, 26, 56, 83, 40, 80, 70, 33, 41, 48,
				72, 33, 47, 32, 37, 16, 94, 29, 53, 71, 44, 65, 25, 43, 91, 52,
				97, 51, 14, 70, 11, 33, 28, 77, 73, 17, 78, 39, 68, 17, 57, 91,
				71, 52, 38, 17, 14, 91, 43, 58, 50, 27, 29, 48, 63, 66, 4, 68,
				89, 53, 67, 30, 73, 16, 69, 87, 40, 31, 4, 62, 98, 27, 23, 9,
				70, 98, 73, 93, 38, 53, 60, 4, 23 };
		int numCount = 1;
		int last = 0;
		int parentLeftIndex = -1, parentRightIndex = -1;
		int parentLeftSum = 0, parentRightSum = 0;
		int currentRow = 1;

		for (int i = 0; i < arr.length; i++) {
			parentLeftSum = 0;
			parentRightSum = 0;

			// Special case for the first element
			if (i == 0) {
				parentLeftSum = arr[i];
				parentRightSum = arr[i];
			}

			// Find parents
			parentLeftIndex = i - currentRow;
			
			if (parentLeftIndex >= 0 && parentLeftIndex != i && numCount > 1) {
				parentLeftSum = ((Integer) v.elementAt(parentLeftIndex))
						.intValue() + arr[i];
			}

			parentRightIndex = i - (currentRow - 1);
			
			if (parentRightIndex >= 0 && parentRightIndex != i
					&& (numCount != (last + 1))) {
				parentRightSum = ((Integer) v.elementAt(parentRightIndex))
						.intValue() + arr[i];
			}

			if (parentRightSum > parentLeftSum) {
				v.add(i, new Integer(parentRightSum));
			} else {
				v.add(i, new Integer(parentLeftSum));
			}

			// Handle new rows
			if (numCount == (last + 1)) {
				currentRow++;
				last = numCount;
				numCount = 0;
			}
			
			numCount++;
		}

		Iterator<Integer> it = v.iterator();
		int colCount = 1;
		int result = 0;
		int current = 0;
		last = 0;

		while (it.hasNext()) {
			current = ((Integer) it.next()).intValue();
			
			if (current > result) {
				result = current;
			}

			if (colCount == (last + 1)) {
				last = colCount;
				colCount = 0;
			}
			
			colCount++;
		}

		System.out.println(result);
	}
}
