{- 
    Considering natural numbers of the form, a^b, where a, b < 100, what is the
    maximum digital sum? 
-}

digitsSum :: Integral a => a -> a
digitsSum 0 = 0
digitsSum x = r + digitsSum q
    where (q,r) = quotRem x 10

main = print . maximumBy (comparing length) . [a^b | a <- [1..99], b <- [1..99]]
