public class Moneda {
	public String nombre;
	public int peso;
	private char validez;

	public Moneda (char a, int i) {
		if ((a == 'V') || (a == 'v')) {
			nombre = "Moneda "+i;
			peso = 5;
			validez = 'V';
		}
		else {
			peso = 3;
			validez = 'F';
		}
	}


}