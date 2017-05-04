public class MonedaFalsa {
	Moneda[] arregloMonedas;

	//Las monedas son insertadas en forma de un arreglo de Vs y Fs donde V son monedas verdaderas y F son monedas falsas
	public static Moneda getMonedaFalsa(char[] arregloValidez) {
		arregloMonedas = new Moneda[arregloValidez.length];

		for (int i = 0; i < arregloValidez.length; i++) {
			arregloMonedas[i] = new Moneda(arregloValidez[i], i);
		}

		int posicion = getPosicion(arregloMonedas, 0, arregloMonedas.length-1);

		return arregloMonedas[getMin(sumarPesos(monedas, 0, monedas.length/3))]

	}

	private static int obtenerPosicion(Moneda[] monedas, ParOrdenado rango) {
		ParOrdenado subRango1 = new ParOrdenado (rango.x, (rango.y)/3);
		ParOrdenado subRango2 = new ParOrdenado ((rango.y)/3, ((rango.y)/3)*2);
		ParOrdenado subRango3 = new ParOrdenado (((rango.y)/3)*2, rango.y);
		if (rango.x != rango.y) {
			pesoRango1 = sumarPesos(monedas, subRango1.x, subRango1.y);
			pesoRango2 = sumarPesos(monedas, subRango2.x, subRango2.y);
			pesoRango3 = sumarPesos(monedas, subRango3.x, subRango3.y);
			
			if ((pesoRango1 <= pesoRango2) && (pesoRango1 <= pesoRango3)) {
				return obtenerPosicion(monedas, subRango1);
			}
			else if ((pesoRango2 <= pesoRango1) && (pesoRango2 <= pesoRango3)) {
				return obtenerPosicion(monedas, subRango2);
			}
			else {
				return obtenerPosicion(monedas, subRango3);
			}
		}
	}

	private static int sumarPesos(Moneda[] monedas, int inicio, int fin) {
		int suma = 0;
		for (int i = inicio; i <= fin; i++) {
			suma = suma + monedas[i].peso;
		}
	}

	private static int getMin(int a, int b, int c) {
		if ((a <= b) && (a <= c)) {
			return a;
		}
		else if ((b <= a) && (b <= c)) {
			return b;
		}

		else {
			return c;
		}
	}
}