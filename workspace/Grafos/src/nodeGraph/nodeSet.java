package nodeGraph;

import java.util.Set;

public class nodeSet<E> implements Set<E>{
	ArrayList<E> set;
	
	public nodeSet<E>(int cant) {
		set = new ArrayList<E>(cant);
	}
}
