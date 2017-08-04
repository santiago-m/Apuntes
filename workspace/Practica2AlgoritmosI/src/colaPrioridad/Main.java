package colaPrioridad;

import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		ArrayList<Comparable> lista = new ArrayList<Comparable>();
		Random rnd;
		
		for (int i = 0; i < 10; i++) {
			rnd = new Random();
			lista.add(rnd.nextInt(55)+i);
		}

		ColaDePrioridad cola = new ColaDePrioridad();
		
		for (int i = 0; i < lista.size(); i++) {
			cola.add(lista.get(i));
		}
		
		System.out.println(cola.toString());
		
	}

}
