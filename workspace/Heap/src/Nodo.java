
public class Nodo {
	Integer value;
	Nodo next;
	Nodo pre;
	
	public Nodo(int value) {
		this.value = value;
		next = null;
		pre = null;
	}
	
	public Integer getValue() {
		return value;
	}
	
	public Nodo getNext() {
		if (next != null) {
			return next;
		}
		else {
			return null;
		}
	}
	
	public Nodo getPre() {
		return pre;
	}
	
	public void setValue(int newValue) {
		value = newValue;
	}
	
	public void setNext(Nodo newNext) {
		next = new Nodo(-1);
		next = newNext;
	}
	
	public void setPre(Nodo newPre) {
		pre = new Nodo(-1);
		pre = newPre;
	}
}
