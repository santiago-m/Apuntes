public class Subsecuencia {
	int[] arregloPadre;
	int inicio, fin;
	int suma;

	public Subsecuencia (int[] arregloPadre, int inicio, int fin) {
		this.arregloPadre = arregloPadre;
		this.inicio = inicio;
		this.fin = fin;

		suma = calcularSuma(inicio, fin);
	}

	public Subsecuencia(int[] arregloPadre) {
		this.arregloPadre = arregloPadre;
		inicio = 0;
		fin = arregloPadre.length-1;

		suma = calcularSuma(inicio, fin);
	}	

	public Subsecuencia subsecSumaMinima() {
		int min = inicio;
		int max = fin;
		int med = (max-min)/2;
		Subsecuencia resultado = new Subsecuencia(arregloPadre);

		splitAndSum (min, med, max, resultado);

		return resultado;

	}

	public void splitAndSum (int min, int med, int max, Subsecuencia sumaMinima) {
		Subsecuencia sumaProv;

		if(med > min) {
			splitAndSum (min, ((med-min)/2)+min, med, sumaMinima);
		}
		if (max > med+1){
			splitAndSum (med+1, ((max-(med+1))/2)+med+1, max, sumaMinima);
		}

		sumaProv = calcularSumaMinima(min, med, med+1, max);

		if (sumaProv.suma < sumaMinima.suma) {
			reemplazarSecuencia (sumaProv, sumaMinima);
		}

	}

	private void reemplazarSecuencia (Subsecuencia fuente, Subsecuencia destino) {
		if ( (fuente.fin == destino.inicio-1) && (fuente.suma + destino.suma < fuente.suma) ){
			destino.inicio = fuente.inicio;
			destino.suma += fuente.suma;
		}
		else if ( (fuente.inicio == destino.fin+1) && (fuente.suma + destino.suma < fuente.suma) ){
			destino.fin = fuente.fin;
			destino.suma += fuente.suma;
		}
		else {
			destino.inicio = fuente.inicio;
			destino.fin = fuente.fin;
			destino.suma = fuente.suma;
		}
	}

	//Metodo que calcula la suma de una secuencia sumando al ultimo elemento de la misma, el resto.
	private int calcularSuma (int inicio, int fin) {
		int suma = arregloPadre[fin];
		for (int i = inicio; i < fin; i++) {
			suma = suma + arregloPadre[i];
		}

		return suma;
	}

	private Subsecuencia calcularSumaMinima (int inicio1, int fin1, int inicio2, int fin2) {
		int sumaIzq = arregloPadre[fin1];
		int sumaDer = arregloPadre[fin2];
		Subsecuencia result;

		for (int i = inicio1; i < fin1; i++){
			sumaIzq = suma + arregloPadre[i];
		}

		for (int i = inicio2; i < fin2; i++){
			sumaDer = suma + arregloPadre[i];
		}		
		
		if (sumaIzq <= sumaDer) {
			result = new Subsecuencia(arregloPadre, inicio1, fin1);
		}
		else {
			result = new Subsecuencia(arregloPadre, inicio2, fin2);
		}
		return result;
	}		
}