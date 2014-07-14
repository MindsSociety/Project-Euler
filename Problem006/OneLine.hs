main = print $ ((^2) $ sum [1..100]) - (sum $ map (^2) [1..100])
