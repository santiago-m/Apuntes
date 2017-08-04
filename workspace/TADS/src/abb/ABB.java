package abb;

public class ABB {
	int raiz;
	ABB hi;
	ABB hd;
	
	public ABB (int r) {
		raiz = r;
	}
	
	public void add(int i) {
		rAdd(this, i);
	}
	
	private static void rAdd(ABB a, int i) {
		if (a == null) {
			a = new ABB(i);
		}
		else {
			if (i < a.getRaiz()) {
				if (a.hi() == null) {
					ABB aux = new ABB(i);
					a.setHI(aux);
				}
				else {
					rAdd(a.hi(), i);
				}
			}
			else if (i > a.getRaiz()) {
				if (a.hd() == null) {
					ABB aux = new ABB(i);
					a.setHD(aux);
				}
				else {
					rAdd(a.hd(), i);
				}
			}
		}
	}
	
	public void delete(int e) {
		rDelete(this, e);
	}
	
	public static void rDelete(ABB a, int e) {
		if (a != null) {
			if (e < a.getRaiz()) {
				rDelete(a.hi(), e);
			}
			
			else if (e > a.getRaiz()) {
				rDelete(a.hd(), e);
			}
			
			else {
				
				ABB auxD = a.hd();
				ABB auxI = a.hi();
				
				if (a.hi() == null && a.hd() == null) {
					a = null;
				}
				else if (a.hi() == null && a.hd() != null){
					a = auxD;
				}
				else if (a.hi() != null && a.hd() == null) {
					a = auxI;
				}
				else {
					a = new ABB(getMin(a.hd()));
				}
			}
		}
	}
	
	public boolean consultar(int e) {
		return pertenece (this, e);
	}
	
	public static boolean pertenece (ABB a, int elem) {
		if (a != null) {
			if (elem == a.getRaiz()) {
				return true;
			}
			else if (elem < a.getRaiz()) {
				return pertenece (a.hi(), elem);
			}
			else {
				return pertenece (a.hd(), elem);
			}
		}
		else {
			return false;
		}
	}
	
	private static int getMin(ABB a) {
		if (a.hi() != null) {
			return getMin(a.hi());
		}
		else {
			return a.getRaiz();
		}
	}
	
	public int getRaiz() {
		return raiz;
	}
	
	public ABB hi() {
		return hi;
	}
	
	public ABB hd() {
		return hd;
	}
	
	public void setHD(ABB h) {
		hd = h;
	}
	
	public void setHI(ABB h) {
		hi = h;
	}
	
	public static void preOrder(ABB a) {
		if (a.hi() != null) {
			preOrder(a.hi());
		}
		System.out.println(a.getRaiz());
		if (a.hd() != null) {
			preOrder(a.hd());
		}
	}
}
