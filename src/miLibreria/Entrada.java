package miLibreria;
import java.util.Scanner;

public class Entrada {

		Scanner entrada=new Scanner(System.in);
		
		public int obtenerEntero(String msg){
			int ent=0;
			String teclado="";
			boolean loop=true;
			do{
				try{
					System.out.println(msg);
					teclado=entrada.nextLine();
					ent=Integer.parseInt(teclado);
					loop=false;
				}catch(Exception e){
					System.out.println("Entrada incorrecta. Introduce un numero entero.");
					entrada.next();
				}
			}while(loop);
			
			return ent;
		}
		
		public float obtenerFloat(String msg){
			float ent=0;
			boolean loop=true;
			do{
				try{
					System.out.println(msg);
					ent=entrada.nextFloat();
					loop=false;
				}catch(Exception e){
					System.out.println("Entrada incorrecta. Introduce un numero decimal.");
					entrada.next();
				}
			}while(loop);
			
			return ent;
		}
		
		public String obtenerString(String msg){
			String ent="";
			boolean loop=true;
			do{
				try{
					System.out.println(msg);
					ent=entrada.nextLine();
					loop=false;
				}catch(Exception e){
					System.out.println("Entrada incorrecta. Introduce una cadena de caracteres.");
					entrada.next();
				}
			}while(loop);
			
			return ent;
		}
		
		public char obtenerChar(String msg){
			char ent=' ';
			boolean loop=true;
			do{
				try{
					System.out.println(msg);
					ent=entrada.next().charAt(0);
					loop=false;
				}catch(Exception e){
					System.out.println("Entrada incorrecta. Introduce un caracter.");
					entrada.next();
				}
			}while(loop);
			
			return ent;
		}
}
