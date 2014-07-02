using System;

public class sol {
	public static void Main() {
		int previous = 1;
		int result = 0;
		int x = 0;
		
		for (int i = 1; i <= 4000000; i += previous) {
			if(x > 0) {
				previous = i - previous;
			}
			
			x++;
			
			if (i % 2 == 0) {
				result += i;
			}
		}
		
		Console.WriteLine(result);
	}
}
