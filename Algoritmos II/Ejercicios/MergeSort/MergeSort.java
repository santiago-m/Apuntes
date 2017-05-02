public class MergeSort {

	public static void mergeSort(int[] arreglo) {
		int min = 0;
		int max = arreglo.length-1;
		int med = (max-min)/2;

		splitAndJoin (arreglo, min, med, max);

		for (int i = 0; i < arreglo.length; i++) {
			System.out.print("	"+arreglo[i]);
		}
		System.out.println();

	}

	public static void splitAndJoin (int[] arreglo, int min, int med, int max) {
		if(med > min) {
			splitAndJoin(arreglo, min, ((med-min)/2)+min, med);
		}
		if (max > med+1){
			splitAndJoin(arreglo, med+1, ((max-(med+1))/2)+med+1, max);
		}

		merge(arreglo, min, ((med-min)/2)+min, med, med+1, ((max-(med+1))/2)+med+1, max);
	}

	public static void merge(int[] arreglo, int min1, int med1, int max1, int min2, int med2, int max2) {
		int[] result = new int[arreglo.length];
		int k = min1;
		int j = min2, i = min1;

		while (i <= max1) {
			while (j <= max2) {
				if ((i <= max1) && (arreglo[i] <= arreglo[j])) {
					result[k] = arreglo[i];
					i++;
				}
				else {
					result[k] = arreglo[j];
					j++;
				}
				k++;
			}
			if ((j > max2) && (i <= max1)) {
				result[k] = arreglo[i];
				i++;
				k++;
			}
		}

		for (int h = min1; h <= max2; h++) {
			arreglo[h] = result[h];
		}
	}
}