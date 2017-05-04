public class MonedaFalsa {
	
	public static Moneda getMonedaFalsa(BolsaMonedas bolsa) {

		Tupla bolsitas;
		BolsaMonedas subBolsa;
		Moneda monedaResult = null;

		if (bolsa.monedas.length % 3 == 0) {
			bolsitas = bolsa.dividir(3);
			subBolsa = getMin(bolsitas, 3);
		}

		else {
			bolsitas = bolsa.dividir(2);	
			subBolsa = getMin(bolsitas, 2);
		}

		if (subBolsa.monedas.length > 1){
			monedaResult = getMonedaFalsa(subBolsa);
		}
		return monedaResult;
	}

	private static BolsaMonedas getMin(Tupla bolsitas, int n) {

		if (n == 2) {
			int peso1 = bolsitas.getFirst().pesoBolsa;
			int peso2 = bolsitas.getSecond().pesoBolsa;

			return (peso1<peso2)?bolsitas.getFirst():bolsitas.getSecond();
		}
		else {
			int peso1 = bolsitas.getFirst().pesoBolsa;
			int peso2 = bolsitas.getSecond().pesoBolsa;
			int peso3 = bolsitas.getThird().pesoBolsa;

			if ((peso1 < peso2) && (peso1 < peso3)) {
				return bolsitas.getFirst();
			}
			else if ((peso2 < peso1) && (peso2 < peso3)) {
				return bolsitas.getSecond();
			}
			else {
				return bolsitas.getThird();
			}
		}
	}
}