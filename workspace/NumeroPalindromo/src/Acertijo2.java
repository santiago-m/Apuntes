
public class Acertijo2 {

	public static boolean elNumeroEsPalindromo(int n) {
		boolean result = true;
		String numeroEnString = String.valueOf(n); 
		
		for (int i = 0; i < (numeroEnString.length() / 2); i++) {
			result = result && numeroEnString.charAt(i) == numeroEnString.charAt(numeroEnString.length() - (i+1));
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int a = 55;
		
		for (int i = 0; i <= a; i++) {
			if (elNumeroEsPalindromo(i)) {
				System.out.println("Para " + String.valueOf(i) + " se obtuvo TRUE.");
			}
		}
	}
}