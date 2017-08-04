package colaPrioridad;

import java.util.ArrayList;

public class ColaDePrioridad {
	ArrayList<Comparable> lista;
	
	public ColaDePrioridad() {
		lista = new ArrayList<Comparable>();
	}
	
	public ColaDePrioridad(ArrayList<Comparable> l) {
		lista = l;
	}
	
	public void add(Comparable elem) {
		if (lista.isEmpty()) {
			lista.add(elem);
		}
		else {
			for (int i = 0; i < lista.size(); i++) {
				
				if (elem.compareTo(lista.get(i)) < 0) {
					lista.add(i, elem);
					break;
				}
			}
			if (!lista.contains(elem)) {
				lista.add(lista.size(), elem);
			}
		}
	}
	
	public String toString() {
		String l = lista.get(0)+"\t";
		for (int i = 1; i < lista.size(); i++) {
			l = l+lista.get(i)+"\t";
		}
		return l;
	}
}
