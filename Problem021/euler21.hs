factors :: Integer -> [Integer]
factors = removeDuplicates . map product . powerSet . primeFactors

powerSet :: [a] -> [[a]]
powerSet = filterM (const [True, False])

removeDuplicates :: Ord a => [a] -> [a]
removeDuplicates = map head . group . sort

d :: Integer -> Integer
d n = sum . filter (<n) $ factors n

amicable :: Integer -> Bool
amicable n = (n == (d . d $ n)) && (n /= d n)

main :: IO ()
main = print $ sum [x | x <- [1..10000], amicable x]
