package listaSimple;

public class Nodo {
	private int dato;
	private Nodo siguiente;
	
	public Nodo(int dato){
		this.dato=dato;
		this.siguiente=null;
	}
	
	public void setDato(int dato){
		this.dato=dato;
	}
	
	public int getDato(){
		return this.dato;
	}
	
	public void setSiguiente(Nodo siguiente){
		this.siguiente=siguiente;
	}
	
	public Nodo getSiguiente(){
		return this.siguiente;
	}
	
	public boolean esIgual(Nodo n){
		return (dato==n.getDato()? true:false);
	}
	
	public String toString(){
		return Integer.toString(dato);
	}
	
	

}
