/**
 * Esta clase provee metodos para ordenar arreglos.
 *
 */
 
import java.util.Arrays;

public class Sorter {

    /**
     * Ordena un arreglo de enteros, usando heapsort.
     * @param input es el arreglo a ordenar
     */
    public static void heapsort(int[] input) {
    	if (input.length > 0) {
    		Heap colaOrdenada = new Heap(input[0]);
    		int[] listaOrdenada = new int[input.length];
        
    		for (int i = 1; i < input.length; i++) {
    			colaOrdenada.agregarALaCola(input[i]);
    		}
    		for (int i = 0; i < input.length; i++) {
    			listaOrdenada[i] = colaOrdenada.desencolar();
    		}	
    	
    		for(int i = 0; i < input.length; i++) {
    			input[i] = listaOrdenada[i];
    		}
    	}
    }
}