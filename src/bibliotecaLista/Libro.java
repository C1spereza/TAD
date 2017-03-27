package bibliotecaLista;

import listaSimple.Nodo;

public class Libro {
	private String autor;
	private String titulo;
	private int numEjemplares;
	private int numPrestados;
	private Libro siguiente;
	
	public Libro(){
		this.autor="";
		this.titulo="";
		this.numEjemplares=0;
		this.numPrestados=0;
		
	}
	
	public Libro(String autor, String titulo, int numEjemplares, int numPrestados){
		this.autor=autor;
		this.titulo=titulo;
		this.numEjemplares=numEjemplares;
		this.numPrestados=numPrestados;
	}
	
	public void setSiguiente(Libro siguiente){
		this.siguiente=siguiente;
	}
	
	public Libro getSiguiente(){
		return this.siguiente;
	}
	
	public void setAutor(String autor){
		this.autor=autor;
	}
	
	public void setTitulo(String titulo){
		this.titulo=titulo;
	}
	
	public void setNumEjemplares(int numEjemplares){
		this.numEjemplares=numEjemplares;
	}
	
	public void setNumPrestados(int numPrestados){
		this.numPrestados=numPrestados;
	}
	
	public String getAutor(){
		return autor;
	}
	
	public String getTitulo(){
		return titulo;
	}
	
	public int getNumEjemplares(){
		return numEjemplares;
	}
	
	public int getNumPrestados(){
		return numPrestados;
	}
	
	public boolean prestamo(){
		if(this.numPrestados<this.numEjemplares){
			numPrestados++;
			return true;
		}else{
			return false;
		}
	}
	
	public boolean devolucion(){
		if(this.numPrestados>0){
			numPrestados--;
			return true;
		}else{
			return false;
		}
	}
	
	public String toString(){
		return "Autor: \t\t\t\t" + autor + "\n"
		+ "Titulo: \t\t\t" + titulo + "\n" 
		+ "Numero de ejemplares: \t\t" + numEjemplares + "\n" 
		+ "Numero de ejemplares prestados: " + numPrestados + "\n";
	}


}
