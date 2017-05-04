public class PruebaMonedaFalsa {
	
	public static void main(String[] args) {
		int[] pesos = {5, 5, 5, 5, 5, 3, 5, 5};

		BolsaMonedas bolsita = new BolsaMonedas(pesos);
		Moneda monedaFalsa;

		monedaFalsa = MonedaFalsa.getMonedaFalsa(bolsita);
	}
}