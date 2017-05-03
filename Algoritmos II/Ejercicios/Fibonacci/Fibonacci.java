public class Fibonacci {

	public static int calcularNesimo(int n) {
		if ((n == 0) || (n == 1) ) {
			return 1;
		}
		else {
			return calcularNesimo(n-1) + calcularNesimo(n-2);
		}
	}

	public static int fibonacciDinamico(int n) {

		int[] anteriores = new int[3];
		anteriores[0] = 1;
		anteriores[1] = 1;
		anteriores[2] = 1;
			
		for (int i = 2; i <= n; i++) {
			anteriores[2] = anteriores[0] + anteriores[1];
			anteriores[0] = anteriores[1];
			anteriores[1] = anteriores[2];
		}
		return anteriores[2];
	}
}