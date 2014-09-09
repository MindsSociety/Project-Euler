using System.IO;
using System;

class sol {
	static void Main(string[] args) {
		double num = 600851475143;
        	int result = 0;

		for(int i = 3; i <= Math.Sqrt(num); i += 2) {
			if(num % i == 0 && isprime(i) == 1) {
                		result = i;
			}
		}

        	Console.WriteLine(result);
	}

	static int isprime(double p) {
		if (p % 2 == 0) {
			return 0;
		}

		for (int i = 3; i <= Math.Sqrt(p); i += 2) {
			if (p % i == 0) {
				return 0;
			}
		}

		return 1;
	}
}
