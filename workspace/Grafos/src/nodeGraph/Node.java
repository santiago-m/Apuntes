package nodeGraph;

public class Node {
	private int id;
	private int value;
	private Node next;
	private boolean mark;
	
	public Node(int id, int v) {
		this.id = id;
		value = v;
		next = null;
		mark = false;
	}
	
	public int id() {
		return id;
	}
	
	public int value() {
		return value;
	}
	
	public Node next() {
		return next;
	}
	
	public boolean hasNext() {
		return next != null;
	}
	
	public boolean isMarked() {
		return mark;
	}
	
	public void setValue(int a) {
		value = a;
	}
	
	public void setNext(Node n) {
		next = n;
	}
	
	public void mark() {
		mark = true;
	}
	
	public void unmark() {
		mark = false;
	}
	
	public void addNext(Node n) {
		if (next == null) {
			setNext(n);
		}
		else {
			next.addNext(n);
		}
	}
}
