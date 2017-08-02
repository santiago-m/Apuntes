package trees;

public class AVL extends ABB {
	int balance;
	
	public void calcBalance(ABB a) {
		balance = calcAltura(a.hi()) - calcAltura(a.hd());
	}
	
	public int calcAltura(ABB a) {
		int res = 0;
		if (a != null) {
			res++;
			res = res + max(calcAltura(a.hi()), calcAltura(a.hd()));
		}
		return res;
	}
	
	public void add(Comparable d) {
		super.add(d);
		calcBalance(this);
		rebalance();
	}
	
	public void rebalance() {
		
	}
	
	private int max(int a, int b) {
		return (a >= b)?a:b;
	}
	
	
	
}
