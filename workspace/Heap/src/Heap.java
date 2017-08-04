
public class Heap {
	Nodo raiz;
	int cantElem = 0;
	
	public Heap(int raiz) {
		this.raiz = new Nodo(raiz);
		cantElem = cantElem+1;
	}
	
	public void agregarALaCola(int elem) {
		addToQueue(this.raiz, elem);
	}
	
	public void addToQueue(Nodo raiz, int elem) {
		if (raiz.getValue() > elem) {
/*			if (raiz.getPre() != null) {
				Nodo aux = new Nodo(raiz.getValue());
				aux.setNext(raiz.getNext());
				aux.setPre(raiz);
				raiz.setValue(elem);
				raiz.setNext(aux);
			}
			else {*/
				Nodo aux = new Nodo(raiz.getValue());
				aux.setNext(raiz.getNext());
				aux.setPre(raiz);
				raiz.setNext(aux);
				raiz.setValue(elem);
			//}
		}
		else if (raiz.getValue() < elem) {
			if (raiz.getNext() != null) {
				addToQueue(raiz.getNext(), elem);
			}
			else {
				Nodo aux = new Nodo(elem);
				aux.setPre(raiz);
				raiz.setNext(aux);
			}
		}
		else if (raiz.getValue() == elem) {
			System.out.println("El elemento que desea ingresar ya se encuentra en la cola de prioridad");
		}
	}
	
	public int desencolar() {
		int minElem = raiz.getValue();
		raiz = raiz.getNext();
		return minElem;
	}
}
