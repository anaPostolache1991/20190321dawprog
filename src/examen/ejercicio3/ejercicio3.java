package examen.ejercicio3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class ejercicio3 {
	
	public  ejercicio3() {
		}
	/*
	El usuario introducirá por teclado varios compuestos quimicos.
	En la primera línea introducirá el número de compuestos químicos que escribirá a
	continuación, uno por línea. Una vez leidos los compuestos químicos se mostrarán en pantalla,
	sin repetir, todos los elementos de la tabla periódica que intervienen en dichos compuestos.
	*/
	
	public static void compuestosQuimicos() {
		Map<String,String>mapa=new HashMap<String,String>();
		ArrayList<String>listaElementos=new ArrayList();
		
		
		String respuesta=" ";
		String s;
		int elementos=0;
		int cont=0;
		int contPalabraRepetida=0;
		//String[]vector;
			
		Scanner sc=new Scanner(System.in);
		System.out.println("introduce cuantos elementos queres poner ");
		elementos=sc.nextInt();
		System.out.println("introduce compuestos quimicos");
		do {
			
		respuesta=sc.nextLine();
		 listaElementos.add(respuesta);
		cont++;
		
		}while(cont!=elementos);
		
			if(listaElementos.contains(respuesta)) {
				contPalabraRepetida++;
				listaElementos.remove(respuesta);
		
			}
			Iterator it=listaElementos.iterator();
			while(it.hasNext()) {
				System.out.print(it.next());
			}
		}
		
	//}
	public static void main(String []args) {
		compuestosQuimicos();
	}
    
	
	
	
	
	
}
