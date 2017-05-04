public class PruebaMultiplicacion {
	public static void main(String[] args) {

		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);	

		System.out.println("Multiplicacion por una constante: "+MultiDecrease.prodDecreasePorConstante(a, b));

		System.out.println("Multiplicacion por factor constante: "+MultiDecrease.prodDecreasePorFactor(a, b));
	}
}