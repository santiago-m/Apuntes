public class PruebaMultiplicacionPorFactorConstante {
	public static void main(String[] args) {

		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);	

		System.out.println("Multiplicacion por factor constante: "+MultiDecrease.prodDecreasePorFactor(a, b));
	}
}