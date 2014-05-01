/**
 * Number letter counts
 * Problem 17
 * 
 * If the numbers 1 to 5 are written out in words: one, two, three, four, five,
 * then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total. If all the
 * numbers from 1 to 1000 (one thousand) inclusive were written out in words,
 * how many letters would be used? NOTE: Do not count spaces or hyphens. For
 * example, 342 (three hundred and forty-two) contains 23 letters and 115 (one
 * hundred and fifteen) contains 20 letters. The use of "and" when writing out
 * numbers is in compliance with British usage.
 */
public class PE017_Number_letter_counts {
	public static void main(String[] args) {
		long start = System.nanoTime();

		int result = 0;
		int oneToNine = "onetwothreefourfivesixseveneightnine".length();
		int tenToNineteen = "teneleventwelvethirteenfourteenfifteensixteen_seventeeneighteennineteen"
				.length();
		int and = "and".length();
		int twentyToNinety = "twentythirtyfortyfiftysixtyseventyeightyninety"
				.length();
		int hundred = "hundred".length();
		int thousand = "thousand".length();
		result = "one".length() + thousand + 900 * hundred + 100 * oneToNine
				+ 100 * twentyToNinety + 891 * and + 80 * oneToNine + 10
				* (oneToNine + tenToNineteen);

		long end = System.nanoTime();
		long runtime = end - start;
		System.out.println(result);
		System.out.println("Runtime: " + runtime / 1000000 + "ms (" + runtime
				+ "ns)");
	}
}
