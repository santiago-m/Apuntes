import java.util.Scanner;

public class PruebaFibonacci {
	
	public static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		int fiboDeN = Fibonacci.fibonacciDinamico(Integer.parseInt(args[0]));

		System.out.println(fiboDeN);

		fiboDeN = Fibonacci.calcularNesimo(Integer.parseInt(args[0]));

		System.out.println(fiboDeN);
	}
}