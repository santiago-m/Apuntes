public class Tupla {
	BolsaMonedas first;
	BolsaMonedas second;
	BolsaMonedas third;

	public Tupla() {
		first = new BolsaMonedas();
		second = new BolsaMonedas();
		third = new BolsaMonedas();
	}

	public void setFirst(BolsaMonedas newFirst) {
		first = newFirst;
	}

	public void setSecond(BolsaMonedas newSecond) {
		second = newSecond;
	}

	public void setThird(BolsaMonedas newThird) {
		third = newThird;
	}

	public BolsaMonedas getFirst() {
		return first;
	}

	public BolsaMonedas getSecond() {
		return second;
	}

	public BolsaMonedas getThird() {
		return third;
	}
}