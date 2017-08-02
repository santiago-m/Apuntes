package trees;

public interface INode {

	public abstract Object getInfo();
	
	public abstract INode next();
	
	public abstract void setInfo(Object i);
	
	public abstract void setNext(INode n);
	
}
