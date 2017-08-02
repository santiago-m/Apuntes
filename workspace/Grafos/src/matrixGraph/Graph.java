package matrixGraph;

import java.lang.Math;

public class Graph {
	int[][] grafo;
	final int INF = -1;
	
	public Graph(int cantNodos) {
		grafo = new int[cantNodos][cantNodos]; 
	}
	
	public void llenarAleatorio() {
		for (int i = 0; i < grafo[0].length; i++) {
			for (int j = 0; j < grafo[1].length; j++) {
				grafo[i][j] = (int) (Math.random()*50);
			}
		}
	}
	
	public void printGraph() {
		for (int i = 0; i < grafo[0].length; i++) {
			System.out.print("\n");
			for (int j = 0; j < grafo[1].length; j++) {
				System.out.print(grafo[i][j]+"\t");
			}
		}
	}

	public int[] warshall(int nodeI, int nodeF, int cant) {
		int[] result;
		if (cant == 0) {
			//int a = grafo[nodeI-1][nodeF-1];
			//int [] res = {a};
			
			int[] res = {nodeI, nodeF};
			return res;
		}
		else {
			int[] pos1 = warshall(nodeI, nodeF, cant-1);
			int[] pos2 = concat (warshall(nodeI, cant, cant-1), warshall(cant, nodeF, cant-1));			
			
			//pos2 = deleteRepetidos(pos2);
			
			if (sum(pos1) <= sum(pos2)) {
				return pos1;
			}
			else {
				return pos2;
			}
		}
	}
	

	// warshall: calcula el camino mas corto entre todos los nodos
	// graph es una matriz conteniendo el grafo, dist es la matriz en donde las distancias se  
	// guardaran y path una matriz en donde se guardan los caminos
	public void nRecursivewarshall(int[][] graph, int[][] d, int[][] path) {
		int inf = INF;
		int n = graph.length; 
		// cantidad de nodos
		// se inicializa dist y path
		for (int i = 1; i < n; i++) { 
			for (int j = 1; j < n; j++) { 
	            d[i][j] = graph[i][j];
	            path[i][j] = -1;
	            if (graph[i][j] > 0 && graph[i][j] < inf)    
	                path[i][j] = i; 
			} 
	    } 
		// se considera cada camino pasando por un posible k
		for(int k =	1; k < n; k++) { 
			for(int i = 1; i < n; i++) { 
				for(int j = 1; j < n; j++) { 
					// si hay un nuevo minimo se cambia el valor
					if (d[i][k] + d[k][j] < d[i][j]) { 
	                    d[i][j] = d[i][k] + d[k][j]; 
	                    path[i][j] = k; 
	                } 
	            } 
	        } 
	    } 
	}
	
	
	public int sum (int[] arr) {
		int res = 0;
		for (int i = 0; i < arr.length; i++) {
			res = res+arr[i];
		}
		return res;
	}
	
	public int[] concat(int[] f, int[] s) {
		int[] res = new int[f.length+s.length];
		for (int i = 0; i < f.length; i++) {
			res[i] = f[i];
		}
		for (int i = f.length; i < s.length+f.length; i++) {
			res[i] = s[i-f.length];
		}
		return res;
	}
	
	private int[] deleteRepetidos(int[] p) {
		int j = 0;
		for (int i = 0; i < p.length-1; i++) {
			if (p[i] == p[i+1]) {
				p[i+1] = -2;
				j++;
			}
		}
		int[] n = new int[p.length-j];
		j = 0;
		for (int i = 0; i < p.length; i++) {
			if (p[i] != -2) {
				n[i-j] = p[i];
			}
			else {
				j++;
			}
		}
		return n;
	}
}
