package matrixGraph;

import java.util.Scanner;

public class Main {
	static Scanner in;
	
	public static void main(String[] args) {
		Graph grafito = new Graph(5);
		
		grafito.llenarAleatorio();
		grafito.printGraph();
		
		System.out.print("Ingrese los nodos cuya distancia mas corta desea calcular: ");
		int node1 = readNode();
		int node2 = readNode();
		System.out.print("Por cuantos nodos aceptaria pasar? ");
		int cantNodes = readNode();
		
		int[] path = grafito.warshall(node1, node2, cantNodes);
		
		for(int i = 0; i < path.length; i++) {
			System.out.print(path[i]+"\t");
		}
		System.out.println();
		
		int[][] aux = new int[grafito.grafo[0].length][grafito.grafo[0].length];
		int[][] path2 = new int[grafito.grafo[0].length][grafito.grafo[0].length];
		
		grafito.nRecursivewarshall(grafito.grafo, aux, path2);
		
		for (int i = 0; i < aux[0].length; i++) {
			System.out.println();
			for (int j = 0; j < aux[0].length; j++) {
				System.out.print(aux[i][j]+"\t");
			}
		}
		
		for (int i = 0; i < path2[0].length; i++) {
			System.out.println();
			for (int j = 0; j < path2[0].length; j++) {
				System.out.print(path2[0].length+"\t");
			}
		}
		
	}
	
	public static int readNode() {
		in = new Scanner(System.in);
		
		return in.nextInt();
	}

	
}
