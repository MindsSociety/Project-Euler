fib n = l 1 1 n where
    l a b c = if c<2 then a else l (a+b) a (c-1)

fibsum = sum(filter (<4000000) (filter even [ (fib x) | x <- [1..63]]))
 
main = print $ fibsum

--------------------------------------------------------------------------------

fib = 0 : 1 : zipWith (+) fib (tail fib)

main = print . sum . filter even $ takeWhile (<4000000) $ fib
