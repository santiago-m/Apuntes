public class MultiDecrease {
	
	public static int prodDecreasePorConstante(int a, int b) {
		if (b == 1) {
			return a;
		}
		else if (b == -1) {
			return -a;
		}
		else if (b == 0) {
			return 0;
		}
		else if (b > 0) {
			return a + prodDecreasePorConstante(a, b-1);
		}
		else {
			return -(a) + prodDecreasePorConstante(a, b+1);
		}
	}

	public static int prodDecreasePorFactor(int a, int b) {
		if (b == 1) {
			return a;
		}
		else if (b == -1) {
			return -a;
		}
		else if (b == 0) {
			return 0;
		}
		else if (b % 2 == 0) {
			return prodDecreasePorFactor(a, b/2) + prodDecreasePorFactor(a, b/2);
		}
		else {
			return prodDecreasePorFactor(a, b/2) + prodDecreasePorFactor(a, b/2) + (b<0?-a:a);
		}
	}
}