package listaSimple;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		listaSimple lista = new listaSimple();
		Scanner entrada = new Scanner(System.in);
		int pos, pos2, n;
		
		Nodo a = new Nodo(1);
		Nodo b = new Nodo(2);
		Nodo c = new Nodo(3);
		
		
		
		lista.setInicio(a);
		lista.setTamaño(lista.getTamaño()+1);
		
		lista.getInicio().setSiguiente(b);
		lista.setTamaño(lista.getTamaño()+1);
		
		lista.getInicio().getSiguiente().setSiguiente(c);
		lista.setTamaño(lista.getTamaño()+1);
		
		lista.insertarInicio(new Nodo(0));
		
		lista.insertarFinal(new Nodo(4));
		lista.insertarFinal(new Nodo(5));
		
		lista.insertarFinal(new Nodo(6));
		
		System.out.println(lista.toString());
		System.out.println("Dame la posicion donde quieras insertar el valor: ");
		pos=entrada.nextInt();
		
		lista.insertarMitad(pos, new Nodo(7));
		System.out.println(lista.toString());
		
		System.out.println("\nEliminando Inicio\n");
		lista.eliminarInicio();
		System.out.println(lista.toString());
		System.out.println("\nEliminando Final\n");
		lista.eliminarFinal();
		System.out.println(lista.toString());
		System.out.println("Dame la posicion de donde quieras eliminar el valor: ");
		pos2=entrada.nextInt();
		System.out.println("\nEliminando Posicion Deseada\n");
		lista.eliminarMitad(pos2);
		
		System.out.println(lista.toString());
		
		/*System.out.println("Que numero quieres buscar?");
		if(lista.buscarNum(entrada.nextInt())==true){
			System.out.println("Se ha encontrado el numero");
		}
		else{
			System.out.println("No se ha encontrado el numero");
		}*/
		
		System.out.println("Que numero quieres buscar?");
		n=entrada.nextInt();
			System.out.println(lista.buscarTodos(new Nodo(n)));

	}

}
