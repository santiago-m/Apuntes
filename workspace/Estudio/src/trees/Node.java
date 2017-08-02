package trees;

public class Node extends Tree implements INode{
	Object info;
	Node next;
	
	public Node() {
		info = null;
		next = null;
	}
	
	public Node(Object i) {
		info = i;
		next = null;
	}
	
	public Object getInfo() {
		return info;
	}
	
	public Node next() {
		return next;
	}
	
	public void setInfo(Object i) {
		info = i;
	}
	
	public void setNext(INode n) {
		next = (Node) n;
	}
	
	public boolean hasBro() {
		return next != null;
	}
}
