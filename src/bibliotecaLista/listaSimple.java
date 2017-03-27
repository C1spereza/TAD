package bibliotecaLista;

public class listaSimple {
	private NodoLibro inicio;
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
	
	public void setInicio(NodoLibro inicio){
		this.inicio=inicio;
	}
	
	public NodoLibro getInicio(){
		return this.inicio;
	}
	
	public void insertarInicio(NodoLibro n){
		n.setSiguiente(inicio);
		inicio=n;
		tamaño++;
	}
	
	public void insertarFinal(NodoLibro n){
		NodoLibro a;
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
	
	public boolean insertarMitad(int pos, NodoLibro n){
		NodoLibro a;
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
			NodoLibro n;
			n=inicio;
			inicio=n.getSiguiente();
			tamaño--;
			return true;
		}
	}
	
	public boolean eliminarFinal(){
		int a;
		NodoLibro b;
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
		NodoLibro a, b;
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
	
	public boolean buscar(NodoLibro num){
		int i;
		int contador = 1;
		NodoLibro aux = inicio;
		boolean encontrado = false;
		while(aux!=null && !encontrado){
			aux = aux.getSiguiente();
			contador++;
		}
		if(aux.esIgual(num)){
			System.out.println("La posición del numero es: " + contador);
			return true;
		}else if(tamaño==contador && aux.esIgual(num)){
			System.out.println("La posición del numero es: " + contador);
			return true;
		}else{
			return false;
		}
	}
	
	public NodoLibro obtenerNodo(int pos){
		NodoLibro aux=inicio;
		pos--;
		
		while(pos>0){
			aux=aux.getSiguiente();
			pos--;
		}
		return aux;
	}
	
	public String toString(){
		String salida="La biblioteca contiene: \n";
		NodoLibro aux=inicio;
		while(aux!=null){
			salida=salida + aux.toString() + "\n";
			aux=aux.getSiguiente();
		}
		
		salida=salida + "\nLa libreria tiene " + tamaño + " libros";
		
		return salida;
		
	}

}
