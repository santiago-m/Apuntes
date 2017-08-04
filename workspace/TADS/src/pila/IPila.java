package pila;

import java.util.ArrayList;

public interface IPila<T> {
	
	public abstract void init();
	
	public abstract boolean empty();
	
	public abstract void apilar(T elem);
	
	public abstract void desapilar();
	
	public abstract T tope();
}
