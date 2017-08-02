package trees;

public class Tree {
	Node first;
	int cantHijos;
	
	public Tree() {
		first = null;
		cantHijos = 0;
	}
	
	public void preorder(Node f) {
		if (f.cantHijos() != 0) {
			preorder(f.first);
			
			if(f.first.hasBro()) {
				preorder(f.next());
			}
		}
		else {
			System.out.print(f.getInfo()+"\t");
		}
	}
	
	public void inorder(Node f) {
		System.out.print(f.getInfo()+"\t");
		
		if(f.cantHijos() != 0) {
			inorder(f.first);
		}
		
		if (f.hasBro()) {
			inorder(f.next());
		}
	}
	
	public void posorder(Node f) {
		if (f.hasBro()) {
			posorder(f.next());
		}
		if (f.cantHijos() != 0) {
			posorder(f.first);
		}
		else {
			System.out.print(f.getInfo());
		}
	}
	
	public int cantHijos() {
		return cantHijos;
	}
	

}
