-- Main function of the Haskell program.

module Main where

import Anagrama

main = do
        putStrLn "--- TESTS PARA ANAGRAMAS ---"
        putStrLn "Son 'hola' y 'chau' anagramas?"
        if (anagramas "hola" "chau")
                then putStrLn "    ERROR: tu programa dice que lo son, y no lo son."
                else putStrLn "    OK: tu programa dice que NO lo son, y es asi."
        putStrLn "Son 'esponja' y 'japones' anagramas?"
        if (anagramas "esponja" "japones")
                then putStrLn "    OK: tu programa dice que lo son, y es asi."
                else putStrLn "    ERROR: tu programa dice que NO lo son, y no es asi."
        putStrLn "Son '' y 'japones' anagramas?"
        if (anagramas "" "japones")
                then putStrLn "    ERROR: tu programa dice que lo son, y no lo son."
                else putStrLn "    OK: tu programa dice que NO lo son, y es asi."
        putStrLn "Son '' y '' anagramas?"
        if (anagramas "" "")
                then putStrLn "    OK: tu programa dice que lo son, y es asi."
                else putStrLn "    ERROR: tu programa dice que NO lo son, y no es asi."
        putStrLn "Son 'amor' y 'omar' anagramas?"
        if (anagramas "amor" "omar")
                then putStrLn "    OK: tu programa dice que lo son, y es asi."
                else putStrLn "    ERROR: tu programa dice que NO lo son, y no es asi."
        putStrLn "Son 'morsa' y 'ramon' anagramas?"
        if (anagramas "morsa" "ramon")
                then putStrLn "    ERROR: tu programa dice que lo son, y no lo son."
                else putStrLn "    OK: tu programa dice que NO lo son, y es asi."
        putStrLn "Son 'hola' y 'hola' anagramas?"
        if (anagramas "hola" "hola")
                then putStrLn "    OK: tu programa dice que lo son, y es asi."
                else putStrLn "    ERROR: tu programa dice que NO lo son, y no es asi."
        putStrLn "Son 'morsa' y 'morsa' anagramas?"
        if (anagramas "morsa" "morsa")
                then putStrLn "    OK: tu programa dice que lo son, y es asi."
                else putStrLn "    ERROR: tu programa dice que NO lo son, y no es asi."
