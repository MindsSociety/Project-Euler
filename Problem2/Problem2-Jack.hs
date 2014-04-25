{- 
	By considering the terms in the Fibonacci sequence whose values do not
	exceed four million, find the sum of the even-valued terms.
-}

fib :: [Integer] fib = 0 : 1 : zipWith (+) fib (tail fib)

main = do
	print . sum . filter even $ takeWhile (<= 4000000) fib
