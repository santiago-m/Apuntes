/**
 * Clase Main, que contiene el metodo principal del proyecto.
 * Esta clase llama a heapsort de la clase Sorter, con un numero de
 * entradas de ejemplo.
 *
 */
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("<h4>-- Ordenamiento de arreglos usando HeapSort --</h4>");

        int[] arrayOne = new int[] {2, 3, 42, 12, 7};
        System.out.println("arreglo original: " + Arrays.toString(arrayOne));
        Sorter.heapsort(arrayOne);
        System.out.println("arreglo resultante: " + Arrays.toString(arrayOne));

        int[] arrayTwo = new int[] {12, 0, 420, 122, 7, -50};
        System.out.println("arreglo original: " + Arrays.toString(arrayTwo));
        Sorter.heapsort(arrayTwo);
        System.out.println("arreglo resultante: " + Arrays.toString(arrayTwo));

        int[] arrayThree = new int[] { };
        System.out.println("arreglo original: " + Arrays.toString(arrayThree));
        Sorter.heapsort(arrayThree);
        System.out.println("arreglo resultante: " + Arrays.toString(arrayThree));

        int[] arrayFour = new int[] {1, 2, 3, 4, 5, 6, 7 ,8 ,9, 10};
        System.out.println("arreglo original: " + Arrays.toString(arrayFour));
        Sorter.heapsort(arrayFour);
        System.out.println("arreglo resultante: " + Arrays.toString(arrayFour));

        int[] arrayFive = new int[] {100, 99, 98, 97, 96, 95, 94, -10101, 30, 11, 22};
        System.out.println("arreglo original: " + Arrays.toString(arrayFive));
        Sorter.heapsort(arrayFive);
        System.out.println("arreglo resultante: " + Arrays.toString(arrayFive));

    }
}