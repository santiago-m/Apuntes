package ejercicio3;

public class Racional {
	int numerador;
	int denominador;
	
	public Racional(int num, int den) {
		numerador = num;
		denominador = den;
	}
	
	public String mostrar() {
		String res = numerador+"\n --- \n"+denominador;
		return res;
	}
	
	public Racional sum(Racional other) {
		int denomComun = getDen()*other.getDen();
		Racional result = new Racional(findNumerador(this, denomComun) + findNumerador(other, denomComun), denomComun);
		return result;
	}
	
	public Racional res(Racional other) {
		int denomComun = getDen()*other.getDen();
		Racional result = new Racional(findNumerador(this, denomComun) - findNumerador(other, denomComun), denomComun);
		return result;
	}
	
	public Racional prod(Racional other) {
		Racional result = new Racional(getNum()*other.getNum(), getDen()*other.getDen());
		return result;
	}
	
	public Racional div(Racional other) {
		Racional result = new Racional(getNum()*other.getDen(), getDen()*other.getNum());
		return result;
	}
	
	private int findNumerador(Racional num, int denominador) {
		return num.getNum()*(denominador/num.getDen());
	}
	
	private int getNum() {
		return numerador;
	}
	
	private int getDen() {
		return denominador;
	}
}