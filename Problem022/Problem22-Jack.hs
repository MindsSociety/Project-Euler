import Data.Char
import Data.List
import System.IO

index :: Eq a => a -> [a] -> Int
index str names = f 1 names str
  where f _ [] _  = -1 :: Int
        f i (x:xs) str 
          | x == str  = i
          | otherwise = f (i+1) xs str

wordScore :: String -> Int
wordScore = abs . sum . map ((64-) . ord)

solution :: [String] -> String -> Int
solution names str = wordScore str * index str names

main :: IO ()
main = do
	file <- openFile "names.txt" ReadMode
	openFile <- hGetContents file
	let names = sort $ (read :: String -> [String]) openFile
	print . maximum $ map (solution names) names
