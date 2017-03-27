package bibliotecaLista;

import listaSimple.Nodo;

public class NodoLibro {
	private Libro libro;
	private NodoLibro siguiente;
	
	public NodoLibro(Libro libro){
		this.libro=libro;
		this.siguiente=null;
	}
	
	public void setLibro(Libro libro){
		this.libro=libro;
	}
	
	public Libro getLibro(){
		return this.libro;
	}
	
	public void setSiguiente(NodoLibro siguiente){
		this.siguiente=siguiente;
	}
	
	public NodoLibro getSiguiente(){
		return this.siguiente;
	}
	
	public boolean esIgual(NodoLibro n){
		return (libro.getTitulo()==n.getLibro().getTitulo())? true:false;
	}
	
	public String toString(){
		return libro.toString();
	}
}
