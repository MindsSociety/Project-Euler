module NumberLetter (showNumber) where

import Data.List
import Data.Map (Map, (!))
import qualified Data.Map as Map

import Utils (digits, undigits, trim)

{- This is definitely not the most efficient way to do this, but
    I kinda wanted this for myself, to annoy people by using ridiculously
    long written numbers.
-}

units :: Map Integer [Char]
units = Map.fromList [( 0, "") ,        ( 1, "one")
                     ,( 2, "two"),      ( 3, "three")
                     ,( 4, "four"),     ( 5, "five")
                     ,( 6, "six"),      ( 7, "seven")
                     ,( 8, "eight"),    ( 9, "nine")
                     ,(10, "ten"),      (11, "eleven")
                     ,(12, "twelve"),   (13, "thirteen")
                     ,(14, "fourteen"), (15, "fifteen")
                     ,(16, "sixteen"),  (17, "seventeen")
                     ,(18, "eighteen"), (19, "nineteen")]

tens :: Map Integer [Char]
tens = Map.fromList [(0, "")       ,(1, "ten")
                    ,(2, "twenty") ,(3, "thirty")
                    ,(4, "forty")  ,(5, "fifty")
                    ,(6, "sixty")  ,(7, "seventy")
                    ,(8, "eighty") ,(9, "ninety")]

magnitude :: Map Integer [Char]
magnitude = Map.fromList [( 0, ""),            ( 1, "thousand")
                         ,( 2, "million"),     ( 3, "billion")
                         ,( 4, "trillion"),    ( 5, "quadrillion")
                         ,( 6, "quintillion"), ( 7, "sextillion")
                         ,( 8, "septillion"),  ( 9, "Octillion")
                         ,(10, "Nonillion") ,  (11, "Decillion")
                         ,(12, "Undecillion"), (13, "Duodecillion")
                         ,(14, "Tredecillion")]

groupThree :: Integer -> [[Integer]]
groupThree = map padZero . reverse . map reverse . group3 . reverse . digits
  where group3 [] = []
        group3 x = top : group3 rest
          where (top, rest) = splitAt 3 x

padZero :: Num a => [a] -> [a]
padZero [] = []
padZero xs
  | len == 2 = 0 : xs
  | len == 1 = 0 : 0 : xs
  | otherwise = xs
  where len = length xs `mod` 3

showHundred :: [Integer] -> String
showHundred [0,0,0] = ""
showHundred (x:xs)
  | undigits (x:xs) `mod` 100 == 0 = units ! x ++ " hundred"
  | undigits (x:xs) < 100 = showTen xs
  | otherwise =  units ! x ++ " hundred and " ++ showTen xs

showTen :: [Integer] -> String
showTen xs
  | num < 20 = units ! num
  | otherwise = tens ! head xs ++ showUnit (last xs)
  where num = undigits xs

showUnit :: Integer -> String
showUnit 0 = ""
showUnit n = " " ++ (units ! n)

showMagnitude :: [String] -> String
showMagnitude = concatMap (uncurry f) . reverse . zip [0..7] . reverse
  where f mag [] = ""
        f 0 n = n
        f mag n = if mag < 15 then n ++ " " ++ magnitude ! mag ++ ", "
                             else "Thats a really fucking big number!"

showNumber :: Integer -> String
showNumber = trim . showMagnitude . map showHundred . groupThree

main = print . sum $ map (length . filter (\c -> c /= ' ' &&  c /= ',') . showNumber) [1..1000]
