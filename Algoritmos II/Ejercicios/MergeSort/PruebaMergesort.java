import java.util.Scanner;

public class PruebaMergesort {
	static int[] arregloAOrdenar;
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int cantElementos;

		System.out.print("Ingrese la cantidad de elementos del arreglo: ");
		cantElementos = in.nextInt();
		arregloAOrdenar = new int[cantElementos];

		for(int i = 0; i < cantElementos; i++) {
			System.out.print("Elemento n° "+i+": ");
			arregloAOrdenar[i]=in.nextInt();
		}

		MergeSort.mergeSort(arregloAOrdenar);
	}
}