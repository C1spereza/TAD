package listaDobleEnlace;

public class ListaDobleEnlace {
	private Nodo cabeza;
	private Nodo cola;
	private int tamaño;
	
	public ListaDobleEnlace(){
		this.cabeza=null;
		this.cola=null;
		this.tamaño=0;
	}
	
	public Nodo getCabeza() {
		return cabeza;
	}
	
	public void setCabeza(Nodo cabeza) {
		this.cabeza = cabeza;
	}
	
	public Nodo getCola() {
		return cola;
	}
	
	public void setCola(Nodo cola) {
		this.cola = cola;
	}
	
	public int getTamaño() {
		return tamaño;
	}
	
	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}
	
	public void insertarInicio(Nodo n){
		if(tamaño==0){
			cabeza=n;
			cola=n;
			tamaño++;
		}else{
			n.setDerecha(cabeza);
			n.getDerecha().setIzquierda(n);
			cabeza=n;
			tamaño++;
		}
	}
	
	public void insertarCola(Nodo n){
		if(tamaño==0){
			cabeza=n;
			cola=n;
			tamaño++;
		}else{
			n.setIzquierda(cola);
			cola.setDerecha(n);
			cola=n;
			tamaño++;
		}
	}
	
	public boolean insertarMitad(int posicion, Nodo n){
		Nodo aux;
		Nodo aux2;
		aux=cabeza.getDerecha();
		aux2=cabeza;
		if(tamaño==0){
			cabeza=n;
			cola=n;
			tamaño++;
			return true;
		}else if(posicion==tamaño+1){
			insertarCola(n);
			tamaño++;
			return true;
		}else if(posicion==1){
			insertarInicio(n);
			tamaño++;
			return true;
		}else{
			for(int i=0; i<posicion-2; i++){
				aux2=aux;
				aux=aux.getDerecha();
			}
			n.setDerecha(aux);
			n.setIzquierda(aux2);
			aux2.setDerecha(n);
			aux.setIzquierda(n);
			return true;
		}
	}
	
	public String toString(){
		String salida="La lista contiene: \n";
		Nodo aux=cabeza;
		while(aux!=null){
			salida=salida + aux.toString() + ", ";
			aux=aux.getDerecha();
		}
		
		salida=salida + "\nLa lista tiene " + tamaño + " elementos";
		
		return salida + "\n" +
				"La cabeza es: " + cabeza + "\n" +
				"La cola es: " + cola;
	}
	
	

}
