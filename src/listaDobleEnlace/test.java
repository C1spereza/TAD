package listaDobleEnlace;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nodo a = new Nodo(5);
		Nodo b = new Nodo(4);
		ListaDobleEnlace lista = new ListaDobleEnlace();
		
		lista.insertarInicio(a);
		lista.insertarInicio(b);
		lista.insertarInicio(new Nodo(3));
		lista.insertarCola(new Nodo(6));
		lista.insertarMitad(2, new Nodo(9));
		
		System.out.println(lista.toString());
		

	}

}
