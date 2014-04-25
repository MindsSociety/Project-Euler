{- What is the sum of the digits of the number 2^1000? -}

digitsSum :: Integral a => a -> a
digitsSum 0 = 0
digitsSum x = r + digitsSum q
	where (q,r) = quotRem x 10

main = print . digitsSum $ 2^1000
