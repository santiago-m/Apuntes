package nodeGraph;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph grafito = new Graph(7);
		grafito.randomRelation();
		
		grafito.print();
		System.out.println();
		grafito.dfs();
		
		
	}

}
