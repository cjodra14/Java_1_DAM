package pruebaarrays;
import java.util.Scanner;

public class ArraysBiAlumnos {
	Scanner src=new Scanner(System.in);
	int longitud;
	String [] alumnos;
	String[] asignaturas={"Sistemas","Programación","Bases de Datos","Entornos","Ingles","Lenguajes de Marcas","Fol"};
			ArraysBiAlumnos() {
		 System.out.println("Teclea la longitud deseada para el array");
			longitud=src.nextInt();src.nextLine();
			
	}
	void alumnos() {
				  alumnos=new String[longitud];
				  for(int i=0;i<alumnos.length;i++) {
					  System.out.println("Como se llama el alumno: ");
						alumnos[i]=src.nextLine();
				  }
			  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArraysBiAlumnos ob=new ArraysBiAlumnos();
		ob.alumnos();

	}

}
