package listaSimple;

public class listaSimple {
	private Nodo inicio;
	private int tamaño;
	
	public listaSimple(){
		inicio=null;
		tamaño=0;
	}
	
	public void setTamaño(int tamaño){
		this.tamaño=tamaño;
	}
	
	public int getTamaño(){
		return this.tamaño;
	}
	
	public void setInicio(Nodo inicio){
		this.inicio=inicio;
	}
	
	public Nodo getInicio(){
		return this.inicio;
	}
	
	public void insertarInicio(Nodo n){
		n.setSiguiente(inicio);
		inicio=n;
		tamaño++;
	}
	
	public void insertarFinal(Nodo n){
		Nodo a;
		a=inicio;
		if(inicio==null){
			insertarInicio(n);
		}else{
			while(a.getSiguiente()!=null){
				a=a.getSiguiente();
			}
			a.setSiguiente(n);
			n.setSiguiente(null);
			tamaño++;
		}
	}
	
	public boolean insertarMitad(int pos, Nodo n){
		Nodo a;
		int i;
		a=inicio;
		if(inicio==null){
			insertarInicio(n);
			return true;
		}else if(pos==tamaño+1){
			insertarFinal(n);
			return true;
		}else if(pos>tamaño || pos<1){
			return false;
		}else if(pos==1){
			insertarInicio(n);
			return true;
		}else{
			for(i=0; i<pos-2; i++){
				a=a.getSiguiente();
			}
			n.setSiguiente(a.getSiguiente());
			a.setSiguiente(n);
			tamaño++;
			
			return true;
		}
	}
	
	public boolean eliminarInicio(){
		if(inicio==null){
			return false;
		}else{
			Nodo n;
			n=inicio;
			inicio=n.getSiguiente();
			tamaño--;
			return true;
		}
	}
	
	public boolean eliminarFinal(){
		int a;
		Nodo b;
		b=inicio;
		if(inicio==null){
			return false;
		}else{
			a=this.tamaño;
			for(int i=0; i<a-2; i++){
				b=b.getSiguiente();
			}
			b.setSiguiente(null);
			tamaño--;
			return false;
		}
	}
	
	public boolean eliminarMitad(int pos){
		Nodo a, b;
		int i;
		a=inicio;
		b=a;
		if(inicio==null){
			return false;
		}else if(pos>tamaño || pos<1){
			return false;
		}else if(pos==1){
			eliminarInicio();
			return true;
		}else{
			for(i=0; i<pos-2; i++){
				a=a.getSiguiente();
			}
			for(i=0; i<pos; i++){
				b=b.getSiguiente();
			}
			
			a.setSiguiente(b);
			tamaño--;
			
			return true;
		}
	}
	
	public boolean buscarNum(int num){
		int i;
		int contador = 1;
		Nodo aux = inicio;
		boolean encontrado = false;
		while(aux!=null && !encontrado){
			aux = aux.getSiguiente();
			contador++;
		}
		if(aux.getDato()==num){
			System.out.println("La posición del numero es: " + contador);
			return true;
		}else if(tamaño==contador && aux.getDato()==num){
			System.out.println("La posición del numero es: " + contador);
			return true;
		}else{
			return false;
		}
	}
	
	public listaSimple buscarTodos(Nodo n){
		listaSimple resultado = new listaSimple();
		int posicion=1;
		Nodo aux = inicio;
		while(aux!=null){
			if(aux.esIgual(n)){
				resultado.insertarFinal(new Nodo(posicion));
			}
			posicion++;
			aux=aux.getSiguiente();
		}
		return resultado;
	}
	
	public void BorrarTodos(Nodo n){
		Nodo aux = this.buscarTodos(n).getInicio();
		while(aux!=null){
			this.eliminarMitad(aux.getDato());
			aux=aux.getSiguiente();
		}
	}
	
	public String toString(){
		String salida="La lista contiene: \n";
		Nodo aux=inicio;
		while(aux!=null){
			salida=salida + aux.toString() + ", ";
			aux=aux.getSiguiente();
		}
		
		salida=salida + "\nLa lista tiene " + tamaño + " elementos";
		
		return salida;
		
	}

}
