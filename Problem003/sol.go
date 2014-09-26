package main

import "fmt"

const num int64 = 600851475143

func main() {
  var largest int
	var isPrime bool
	primes := make([]int, 2)
	factors := make([]int, 0)

	primes[0] = 2
	primes[1] = 3

	for j := 5; j <= 10000; j += 2 {
		isPrime = true

		for i := 1; isPrime && j / primes[i] >= primes[i] && i < len(primes); i++ {
			if j % primes[i] == 0 {
				isPrime = false
			}
		}

		if isPrime == true {
			primes = append(primes, j)
		}
	}

	for _, prime := range primes {
		p64 := int64(prime)

		if num % p64 == 0 {
			factors = append(factors, prime)

			if prime > largest {
				largest = prime;
			}
		}
	}

	fmt.Println(largest)
}
