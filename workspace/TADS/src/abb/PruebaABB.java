package abb;

public class PruebaABB {

	public static void main(String[] args) {
		ABB aBinario = new ABB(15);
		
		aBinario.add(10);
		aBinario.add(12);
		aBinario.add(16);
		aBinario.add(19);
		aBinario.add(17);
		aBinario.add(18);
		aBinario.add(8);
		
		ABB.preOrder(aBinario);

	}

}
