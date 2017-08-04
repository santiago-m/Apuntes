package nodeGraph;

import java.util.Random;
import java.util.AbstractSet;
/**
 	* Clase que implementa un Grafo utilizando listas de adyacencias.
 	* @version 1.0
 	* @author santiago maria
 */
public class Graph {
	Node[] grafo;
	
	/**
	 	* Constructor de la clase, inicializa el grafo sin relacion entre sus nodos.
	 	* @param cantNodos cantidad de nodos que tiene el grafo
	 */
	public Graph(int cantNodos) {
		grafo = new Node[cantNodos];
		for (int i = 0; i < cantNodos; i++) {
			grafo[i] = new Node(i, 0);
		}
	}
	
	/**
	 	* Metodo que crea relaciones random entre los nodos de un grafo vacio
	 */
	public void randomRelation() {
		int random;
		Random r = new Random();
		for (int i = 0; i < grafo.length; i++) {
			random = r.nextInt(grafo.length);
			for (int j = 0; j < random; j++) {
				Node rand = new Node(r.nextInt(grafo.length), r.nextInt(51));
				grafo[i].addNext(rand);
			}
		}
 	}
	
	/**
	 * Metodo que dados dos nodos y una distancia crea una relacion entre el primer y el segundo nodo con el valor proporcionado como distancia.
	 * @param a Nodo al cual se le agregará el segundo como adyacente.
	 * @param b Nodo que es agregado como adyacente del primero
	 * @param dist Distancia o valor de costo de llegar del primer nodo al segundo.
	 * */
	public void addRelation(Node a, Node b, int dist) {
		int posA = -1, posB = -1;
		for (int i = 0; i < grafo.length; i++) {
			if (grafo[i].id() == a.id()) {
				posA = i;
			}
			else if(grafo[i].id() == b.id()) {
				posB = i;
			}
		}
		if (posA == -1 || posB == -1) {
			System.out.println("Al menos uno de los nodos no existe dentro del grafo.");
		}
		else {
			b.setValue(dist);
			grafo[posA].addNext(b);
		}
	}
	
	/**
	 * Metodo que dados dos nodos representados como sus posiciones dentro del arreglo, genera una relacion cuyo costo es pasado como parametro.
	 * @param a Posicion dentro del arreglo del nodo al cual se le agregara el segundo como adyacente.
	 * @param b Posicion dentro del arreglo del nodo que sera agregado como adyacente al primero
	 * @param dist Distancia o valor de costo de llegar del primer nodo al segundo.
	 * */
	public void addRelation(int a, int b, int dist) {
		Node ady = new Node(b, dist);
		grafo[a].addNext(ady);
	}
	
	public void print() {
		Node a;
		for (int i = 0; i < grafo.length; i++) {
			a = grafo[i];
			while(a.hasNext()) {
				System.out.print("("+a.id()+", "+a.value()+") --> ");
				a = a.next();
			}
			System.out.println("("+a.id()+", "+a.value()+")");
		}
	}
	
	public void dfs() {
		dfs(grafo[0]);
		unmarkAll();
	}
	
	public void dfs(Node i) {
		Node actual = grafo[i.id()];
		Node aux = i;
		if (!actual.isMarked()) {
			System.out.print(i.id());
			actual.mark();
			
			while (aux.hasNext()) {
				dfs(grafo[aux.next().id()]);
				aux = aux.next();
			}
		}
	}
	
	public void unmarkAll() {
		for (int i = 0; i < grafo.length; i++) {
			grafo[i].unmark();
		}
	}
	
	public void dijkstra(Graph g, Node v, Node[] prev, int[] dist) {
		for(int i = 0; i < grafo.length; i++) {
			prev[i] = null;
			dist[i] = -1;
		}
		dist[v.id()] = 0;
		Set a = new Set();
		
	}
}
