public class PruebaSubsecuencia {
	
	public static void main(String[] args) {
		int[] arreglo = {0, -4, -5, 7, -90};
		Subsecuencia subsec = new Subsecuencia (arreglo);

		Subsecuencia sumaMinima = subsec.subsecSumaMinima();

		System.out.println("Arreglo Original: ");
		for (int i = 0; i < arreglo.length; i++) {
			System.out.print("	"+arreglo[i]);
		}
		System.out.println();


		System.out.println("Subsecuencia suma minima: ");
		for (int i = sumaMinima.inicio; i <= sumaMinima.fin; i++){
			System.out.print("	"+sumaMinima.arregloPadre[i]);
		}

		System.out.println();		
		System.out.println("Suma minima: "+ sumaMinima.suma);
	}
}