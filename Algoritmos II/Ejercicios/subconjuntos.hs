subs :: [a] -> [[a]]
subs [] = [[]]
subs (x:xs) = map (x:) (subs xs) ++ (subs xs)

interleave :: a -> [a] -> [[a]]
interleave x [] = [[x]]
interleave x (y:ys) = (x:y:ys):(map (\s -> y:s) (interleave x ys))

permut :: [a] -> [[a]]
permut [] = [[]]
permut (x:xs) = concat (map (\s -> (interleave x s))	(permut xs))

ordenado :: (Ord a) => [a] -> Bool
ordenado [x] = True
ordenado (x:xs) = (x <= (head xs) && ordenado xs)

slowSort :: (Ord a) => [a] -> [a]
slowSort xs = head (filter ordenado (permut xs))

eliminarRepetidos :: (Eq a) => [a] -> [a]
eliminarRepetidos [x] = [x]
eliminarRepetidos (x:xs) |pertenece x xs = eliminarRepetidos xs
												 |otherwise = x:(eliminarRepetidos xs)
												 
pertenece ::(Eq a) => a -> [a] -> Bool
pertenece z [] = False
pertenece z (x:xs) = (z==x) || (pertenece z xs)

subBags :: (Eq a) => [a] -> [[a]]
subBags xs = init (eliminarRepetidos (subs xs))

esPosible :: (Eq a) =>  [a] -> [a] -> Int -> Bool
esPosible xs ys k | ((length xs) - (length ys) <= k) && (perteneceSoloUnaVez ys xs) = True
									|	otherwise = False
									

perteneceSoloUnaVez :: (Eq a) => [a] -> [a] -> Bool
perteneceSoloUnaVez [] xs = True
perteneceSoloUnaVez (x:xs) ys = pertenece x ys && (perteneceSoloUnaVez xs (listaMenosUno x ys))

listaMenosUno :: (Eq a) => a -> [a] -> [a]
listaMenosUno z (x:xs) | z == x = xs
											 | otherwise = listaMenosUno z xs

											 
permutarProposiciones :: [Int] -> [[Int]]
permutarProposiciones xs = filter (\s -> length s == length xs ) (filter (noEsContradiccion) (subs (xs++(listaNegativa xs))))

noEsContradiccion :: [Int] -> Bool
noEsContradiccion xs = not (esContradiccion xs)

esContradiccion :: [Int] -> Bool
esContradiccion [] = False
esContradiccion (x:xs) = (pertenece (-x) xs) || (esContradiccion xs)

listaNegativa :: [Int] -> [Int]
listaNegativa [x] = [-x]
listaNegativa (x:xs) = (-x):(listaNegativa xs)
