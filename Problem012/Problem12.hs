import Utils (primes, count, remove)

--Compose a 1 arity function with a 2 arity function
(.:) = (.) . (.)

-- Triangle n = (n)(n+1)/2
triangles :: [Integer]
triangles = zipWith ((`div` 2) .: (*)) [1..] [2..]

{- 
	The number of factors a number has can be calculated without actually 
	producing the factors.  Its a bit of a trick.  Take a number, get all of its
	prime factors, get the frequency of each prime factor.  Then the number of
	factors = product(map(1 + frequency, primeFactors))

	http://www.gmathacks.com/gmat-math/number-of-factors-of-a-large-integer.html
-}
numberOfFactors :: Integer -> Int
numberOfFactors = product . map (\x -> 1 + snd x) . primeFactorPairs

primeFactors :: Integer -> [Integer]
primeFactors 1 = []
primeFactors n = factor : primeFactors (n `div` factor)
	where factor = head [x | x <- primes, n `mod` x == 0]

primeFactorPairs :: Integer -> [(Integer, Int)]
primeFactorPairs = frequencies . primeFactors

{- Finds the frequency of each element in a list
	sorts the list and groups the common elements
	returns a frequency as (element, frequency)
-}
frequencies :: Ord a => [a] -> [(a,Int)]
frequencies = map (\x -> (head x, length x)) . group . sort 

main :: IO ()
main = print $ head [x | x <- triangles, numberOfFactors x > 500]
