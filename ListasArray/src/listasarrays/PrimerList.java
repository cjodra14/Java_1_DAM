package listasarrays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

//https://puntocomnoesunlenguaje.blogspot.com/2013/02/arraylist-de-objetos-en-java.html

public class PrimerList {
	
	Scanner src=new Scanner(System.in);
	
	void todo() {
		ArrayList<String> nombre=new ArrayList();
	
		nombre.add("Miren");
		nombre.add("Aitor");
		nombre.add(1,"Javier");
	
		for (int i = 0; i < 3; i++) {
			System.out.println("teclea un nombre:");
			nombre.add(src.nextLine());
		}
		
	
	
	
		for(int i=0;i<nombre.size();i++) {
			System.out.println(nombre.get(i));
		}
	
	
	
			System.out.println("El nombre Aitor está en a posicion:"+nombre.indexOf("Aitor")+" el nombre Paco está "+nombre.indexOf("Paco"));
			System.out.println(nombre.contains("Aitor"));
		
	
	
	
		nombre.remove("Aitor");
		
	
	
	Iterator<String> it= nombre.iterator();
	while(it.hasNext() ){
		System.out.println(it.next());
	}

	}
	
	
	
	void metodo2() {
		class MiClase{
			int numEmpleado;
			public int getNumEmpleado() {
				return numEmpleado;
			}
			public void setNumEmpleado(int numEmpleado) {
				this.numEmpleado = numEmpleado;
			}
			public String getNombre() {
				return nombre;
			}
			public void setNombre(String nombre) {
				this.nombre = nombre;
			}
			public String getProvincia() {
				return provincia;
			}
			public void setProvincia(String provincia) {
				this.provincia = provincia;
			}
			String nombre;
			String provincia;
		}
		
		
		int num;
		String nombre;
		String provincia;
		char fin='s';
		ArrayList<MiClase> empleados =new ArrayList();

		do {
			MiClase auxiliar =new MiClase();
			System.out.println("Teclea el numero del empleado:");
			auxiliar.numEmpleado=src.nextInt();
			src.nextLine();
			System.out.println("Teclea el nombre del empleado:");
			auxiliar.nombre=src.nextLine();
			System.out.println("Teclea la provincia del empleado:");
			auxiliar.provincia=src.nextLine();
			empleados.add(auxiliar);
			System.out.println("Teclea cualquier letra si desea continuar o e para salir");
			try{fin=src.next().charAt(0);}
			catch (Exception e) {
				fin='s';
			}
			
		}while(fin!='e');
		
		
		Iterator<MiClase> iter= empleados.iterator();
		while(iter.hasNext() ){
			MiClase obj = iter.next();
			System.out.println(obj.getNumEmpleado());
			System.out.println(obj.getNombre());
			System.out.println(obj.getProvincia());
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimerList ob=new PrimerList();
		//ob.todo();
		ob.metodo2();
		

	}

	
}
