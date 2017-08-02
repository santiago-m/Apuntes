package trees;

public class ABB {
	private Object data;
	private ABB hi;
	private ABB hd;
	
	public ABB() {
		data = null;
		hi = null;
		hd = null;
	}
	
	public ABB(Object d) {
		data = d;
		hi = null;
		hd = null;
	}
	
	public void add(Comparable d) {
		rAdd(this, d);
	}
	
	public void rAdd(ABB a, Comparable d) {
		if (a == null) {
			a = new ABB(d);
		}
		else {
			if (a.data() == null) {
				a.setData(d);
			}
			else {
				if (d.compareTo((Comparable) a.data()) > 0) {
					rAdd(a.hd(), d);
				}
				else if (d.compareTo((Comparable) a.data()) < 0) {
					rAdd(a.hi(), d);
				}
				else {
					System.out.println("El elemento que desea ingresar ya existe");
				}
			}
		}
	}
	
	public Object data() {
		return data;
	}
	
	public ABB hi() {
		return hi;
	}
	
	public ABB hd() {
		return hd;
	}
	
	public void setData(Object d) {
		data = d;
	}
	
	public void setHI(ABB h) {
		hi = h;
	}
	
	public void setHD(ABB h) {
		hd = h;
	}
	
	public String inorder(ABB raiz) {
		String res = "";
		if (raiz.hi() != null) {
			inorder(raiz.hi());
		}
		res = res+raiz.data();
		if (raiz.hd() != null) {
			inorder(raiz.hd());
		}
		return res;
	}
	
	public String preorder(ABB raiz) {
		String res = raiz.data().toString();
		if (raiz.hi() != null) {
			preorder(raiz.hi());
		}
		if (raiz.hd() != null) {
			preorder(raiz.hd());
		}
		return res;
	}
	
	public String posorder(ABB raiz) {
		String res = "";
		if (raiz.hi() != null) {
			posorder(raiz.hi());
		}
		if (raiz.hd() != null) {
			posorder(raiz.hd());
		}
		res = res+raiz.data();
		
		return res;
	}
}
