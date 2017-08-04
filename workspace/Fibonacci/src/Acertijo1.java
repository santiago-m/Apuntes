public class Acertijo1 {
	
	public static int fibLoop(int n) {
		int a = 1;
		int result = 1;
		
		for (int i = 2; i <= n; i++) {
			result = result + a;
			a = result - a;
			
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length < 1 || args.length > 1 || args[0] < 0) {
			System.out.println("Este programa toma un parametro entero mayor o igual a 0 para funcionar.")
		}
		else {
			
		}
		int a = args[0];
		
		for (int i = 0; i <= a; i++) {
			System.out.println(fibLoop(i));	
		}

	}

}
