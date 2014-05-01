/**
 * Smallest multiple
 * Problem 5
 * 
 * 2520 is the smallest number that can be divided by each of the numbers from 1
 * to 10 without any remainder. What is the smallest positive number that is
 * evenly divisible by all of the numbers from 1 to 20?
 */
public class PE005_Smallest_multiple {
	public static void main(String[] args) {
		long start = System.nanoTime();

		boolean found = false;
		int check = 1;
		while (!found) {
			check++;
			if (check % 1 == 0 && check % 2 == 0 && check % 3 == 0
					&& check % 4 == 0 && check % 5 == 0 && check % 6 == 0
					&& check % 7 == 0 && check % 8 == 0 && check % 9 == 0
					&& check % 10 == 0 && check % 11 == 0 && check % 12 == 0
					&& check % 13 == 0 && check % 14 == 0 && check % 15 == 0
					&& check % 16 == 0 && check % 17 == 0 && check % 18 == 0
					&& check % 19 == 0 && check % 20 == 0) {
				System.out.println(check);
				found = true;
			}
		}

		long end = System.nanoTime();
		long runtime = end - start;
		System.out.println("Runtime: " + runtime / 1000000 + "ms (" + runtime
				+ "ns)");
	}
}
