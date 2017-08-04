package pila;

import java.util.ArrayList;

public class Pila implements IPila<Integer> {
	ArrayList<Integer> pila;
	
	public void init() {
		pila = new ArrayList<Integer>();
	}
	
	public boolean empty() {
		return pila.size() == 0;
	}
	
	public void apilar(Integer elem) {
		pila.add(elem);
	}
	
	public void desapilar() {
		pila.remove(pila.size()-1);
	}
	
	public Integer tope() {
		return pila.get(pila.size()-1);
	}
	
}
