using System;

class Program {
    static void Main() {
        int result = 0;
    	
        for (int num = 0; num < 1000; num++) {
            if (num % 3 == 0 || num % 5 == 0) {
                    result += num;
            }
        }
		
        Console.WriteLine(result);
    }
}
