{- Find the last ten digits of the series, 1^1 + 2^2 + 3^3 + ... + 1000^1000. -}

main = print . (`mod` 10^10) $ sum [x^x | x <- [1..1000]]
