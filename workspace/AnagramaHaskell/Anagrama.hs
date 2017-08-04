module Anagrama where

quitarElemento::Char -> [Char] -> Int -> [Char]
quitarElemento y [] z = []
quitarElemento y (x:xs) z |(y == x && z < 1) = (quitarElemento y xs (z+1))
                          |otherwise = x:(quitarElemento y xs z)

esAnagrama::[Char] -> [Char] -> Bool
esAnagrama [] (x:xs) = False
esAnagrama (y:ys) [] = False
esAnagrama [] [] = True
esAnagrama (x:xs) ys | (elem x ys) = True && esAnagrama xs (quitarElemento x ys 0)
		    | otherwise = False
					
anagramas :: [Char] -> [Char] -> Bool
anagramas x y = esAnagrama x y