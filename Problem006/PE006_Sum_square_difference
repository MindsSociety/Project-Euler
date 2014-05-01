/**
 * Sum square difference
 * Problem 6
 * 
 * The sum of the squares of the first ten natural numbers is, 12 + 22 + ... +
 * 102 = 385 The square of the sum of the first ten natural numbers is, (1 + 2 +
 * ... + 10)2 = 552 = 3025 Hence the difference between the sum of the squares
 * of the first ten natural numbers and the square of the sum is 3025 - 385 =
 * 2640. Find the difference between the sum of the squares of the first one
 * hundred natural numbers and the square of the sum.
 */
public class PE006_Sum_square_difference {
	public static void main(String[] args) {
		long start = System.nanoTime();
		
		int sumSquare = (100 * 101 * 201) / 6;
		int result = 0, sum = 0, squareSum = 0;
		
		for (int i = 0; i <= 100; i++) {
			sum += i;
			squareSum = sum * sum;
		}
		result = squareSum - sumSquare;
		
		long end = System.nanoTime();
		long runtime = end - start;
		System.out.println(result);
		System.out.println("Runtime: " + runtime / 1000000 + "ms (" + runtime
				+ "ns)");
	}
}
