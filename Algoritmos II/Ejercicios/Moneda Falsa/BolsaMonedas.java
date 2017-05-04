public class BolsaMonedas {
	Moneda[] monedas;
	int pesoBolsa;

	public BolsaMonedas(int[] pesos) {
		monedas = new Moneda[pesos.length];
		for (int i = 0; i < pesos.length; i++) {
			monedas[i] = new Moneda(pesos[i]);
		}
		pesoBolsa = calcularPeso(monedas, 0, monedas.length-1);
	}

	public BolsaMonedas(Moneda[] monedas) {
		for (int i = 0; i < monedas.length; i++) {
			this.monedas[i] = new Moneda(monedas[i].peso);
		}
		pesoBolsa = calcularPeso(this.monedas, 0, this.monedas.length-1);
	}

	public BolsaMonedas() {
		monedas = null;
		pesoBolsa = 0;
	}

	public int calcularPeso(Moneda[] monedas, int inicio, int fin) {
		int suma = 0;
		for (int i = inicio; i <= fin; i++) {
			suma = suma + monedas[i].peso;
		}
		return suma;
	}

	public Tupla dividir(int n) {
		int inicio = 0;
		int fin = monedas.length-1;
		Tupla bolsitas = new Tupla();
		Moneda[] subConjMonedas;
		BolsaMonedas subBolsa;


		if (n == 2) {
			subConjMonedas = new Moneda[(fin/2)+1];

			for (int i = inicio; i < fin/2; i++) {
				subConjMonedas[i-inicio] = monedas[i];
			}
			subBolsa = new BolsaMonedas(subConjMonedas);
			bolsitas.setFirst(subBolsa);

			for (int i = (fin/2)+1; i < 2*(fin/3)+1; i++) {
				subConjMonedas[i-inicio] = monedas[i];
			}
			subBolsa = new BolsaMonedas(subConjMonedas);
			bolsitas.setSecond(subBolsa);
		}
		else {
			
			subConjMonedas = new Moneda[(fin/3)+1];

			for (int i = inicio; i < fin/3; i++) {
				subConjMonedas[i-inicio] = monedas[i];
			}
			subBolsa = new BolsaMonedas(subConjMonedas);
			bolsitas.setFirst(subBolsa);

			for (int i = fin/3+1; i < 2*(fin/3)+1; i++) {
				subConjMonedas[i-inicio] = monedas[i];
			}
			subBolsa = new BolsaMonedas(subConjMonedas);
			bolsitas.setSecond(subBolsa);

			for (int i = 2*(fin/3)+2; i < fin; i++) {
				subConjMonedas[i-inicio] = monedas[i];
			}
			subBolsa = new BolsaMonedas(subConjMonedas);
			bolsitas.setThird(subBolsa);
		}
		return bolsitas;
	}

}