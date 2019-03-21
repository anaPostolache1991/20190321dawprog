package examen.ejercicio4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ejercicio4 {
/*
 * El usuario introducira una serie de líneas para agregar entradas a una agenda de teléfonos o para buscar un número según las especificaciones siguientes:
 * •No se establecerá ningún límite al número de entradas que se podrán agregar. El único límite será la capacidad de memoria del ordenador.
•Si en una línea se especifica un nombre seguido de un guión seguido de un número de teléfono, se agrega esta información a la agenda. Si el nombre ya estaba en la agenda, simplemente se sustituye el teléfono antiguo por el nuevo.
•Si en una línea se especifica la palabra buscar seguida de dos puntos (:) seguidos de un nombre, se buscará su número de teléfono en la agenda. Si no se encuentra se mostrará el mensaje correspondiente, en caso contrario se mostrará su número de teléfono.


 */
	static Map<String,String>mapa=new HashMap<String,String>();
	
	public  ejercicio4() {
	
	}
	public static  void contactosExistentes(String nombre,String telefono) {
		 mapa.put("ana","1234");
		 mapa.put("lolo","3212");
		
		 if(mapa.containsKey(nombre)) {
			mapa.put(nombre, telefono);
			 
		 System.out.println("se inserto");
		 }
		 System.out.println(mapa.get(telefono));
		  
		
	}
	
	public static void  agenda() throws Exception  {
	
	
		String s=" ";
		String respuesta=" ";
		Scanner sc=new Scanner(System.in);
		System.out.println("introduce   1 [buscar:nombre] o "
				+ "2 introduce nueva agenda_contacto [nombre-numerotelefono] 3 canbiar_numero ");
		respuesta=sc.nextLine();
		
		
		
		
		for(int i=0;i<respuesta.length();i++) {
			String insertar=" ";
			String buscar=" ";
			if(respuesta.charAt(i)=='1') {
				System.out.println("introduce  buscar:nombre");
				 buscar=sc.nextLine();
				 /*
				 if(buscar!="buscar:")
				 throw new Exception("se esperava [buscar:nombre]");
				 */
			metodo1(buscar);
			}
		if(respuesta.charAt(i)=='2') {
			System.out.println("elegiste 2");
			System.out.println("introduce  nombre-telefono");
			 insertar=sc.nextLine();
			metodo2(respuesta);
			System.out.println("se inserto  corectamente");
		}
		if(respuesta.charAt(i)=='3') {
			System.out.println("elegiste 3");
			System.out.println("introduce  nombre-telefonoNuevo");
			 insertar=sc.nextLine();
			 String  nombre=" ";
	    	   String telefono=" ";
	    	   for(int j=0;j<insertar.length();j++) {
	    	   if(insertar.charAt(j)=='-') {
	    		   int pos=i;
	    		   nombre=insertar.substring(0,pos);
	    		   telefono=insertar.substring(pos+1,insertar.length());
			
			 contactosExistentes(nombre,telefono);
			
		}
		
		
		
		}
		}
		}
		
		

	
	}
		public static  void metodo1(String buscar) {
			String  buscarNombre=" ";
			String insertar=" ";
			int posb=0;
			
			for(int i=0;i<buscar.length();i++) {
		    	   if(buscar.charAt(i)==':') {
		    		  posb=i;
		    		  buscarNombre=buscar.substring(posb+1,buscar.length());
		    		  System.out.println( buscarNombre);
		    		  if(!(mapa.containsKey(buscarNombre)) ){
		    			 // mapa.get();
		    			  Scanner sc=new Scanner(System.in);
		    			    System.out.println("el nombre no esta en la agenda introduce nombre-telefono");
		    			    insertar=sc.nextLine();
		    			    metodo2(insertar);
		    			    System.out.println("se inserto corectamente");
		    		  } 
		    			    }
		    		 
		    		  }
		    	   }
		    	   
			
			
			
			
			
		
		
		
       public static  void metodo2(String insertar) {
    	   String  nombre=" ";
    	   String telefono=" ";
    	   for(int i=0;i<insertar.length();i++) {
    	   if(insertar.charAt(i)=='-') {
    		   int pos=i;
    		   nombre=insertar.substring(0,pos);
    		   telefono=insertar.substring(pos+1,insertar.length());
    		   mapa.put(nombre, telefono);
    		   mapa.forEach((k,v) -> System.out.println("K " + k + ": V: " + v));
    		   
    	   }
    	   
    	   }
    	   
    	   
			
		}
		
	
	
	public static void main(String []args) throws Exception {
		agenda();
		//metodo2("ana-7273");
	//metodo1("buscar:ana");
		//contactosExistentes("ana");
	}
}
