import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Names scores
 * Problem 22
 * 
 * Using names.txt (right click and 'Save Link/Target As...'), a 46K text file
 * containing over five-thousand first names, begin by sorting it into
 * alphabetical order. Then working out the alphabetical value for each name,
 * multiply this value by its alphabetical position in the list to obtain a name
 * score.
 * 
 * For example, when the list is sorted into alphabetical order, COLIN, which is
 * worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list. So, COLIN
 * would obtain a score of 938 × 53 = 49714.
 * 
 * What is the total of all the name scores in the file?
 */
public class PE022_Names_scores {
	public static void main(String[] args) throws IOException {
		long start = System.nanoTime();
		
		File file = new File("PE022_names.txt");
		Scanner scn = new Scanner(file);
		String[] names = scn.nextLine().split(",");
		scn.close();
		int result = 0, score = 0;
		
		for (int i = 0; i < names.length; i++) {
			names[i] = names[i].substring(1, names[i].length() - 1);
		}
		
		Arrays.sort(names);
		
		for (int i = 0; i < names.length; i++) {
			score = 0;
			
			for (int j = 0; j < names[i].length(); j++) {
				score += (Character.getNumericValue(names[i].charAt(j)) - 9);
			}
			
			score *= (i + 1);
			result += score;
		}
		
		long end = System.nanoTime();
		long runtime = end - start;
		System.out.println(result);
		System.out.println("Runtime: " + runtime / 1000000 + "ms (" + runtime
				+ "ns)");
	}
}
