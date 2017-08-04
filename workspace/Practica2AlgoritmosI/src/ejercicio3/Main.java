package ejercicio3;

public class Main {

	public static void main(String[] args) {
		Racional rac1 = new Racional(5, 7);
		Racional rac2 = new Racional(8, 3);

		System.out.println("suma: \n"+rac1.sum(rac2).mostrar() + "\n \n");
		System.out.println("resta: \n"+rac1.res(rac2).mostrar() + "\n \n");
		System.out.println("producto \n: "+rac1.prod(rac2).mostrar() + "\n \n");
		System.out.println("division: \n"+rac1.div(rac2).mostrar() + "\n \n");

	}

}
