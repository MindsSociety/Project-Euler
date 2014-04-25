{- What is the largest prime factor of the number 600851475143? -}

import Utils (primes)

primeFactors :: Int -> [Int]
primeFactors 1 = []
primeFactors n = factor : primeFactors (n `div` factor)
	where factor = head [x | x <- primes, n `mod` x == 0]

main = print . head . reverse $ primeFactors 600851475143
