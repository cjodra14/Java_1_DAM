import java.util.Scanner;

public class Alumno {
	Scanner src=new Scanner(System.in);
	String nombre="";
	byte nota;
	Alumno(){
		System.out.println("teclea el nombre del alumno:");
		nombre=src.nextLine();
		System.out.println("Teclea la nota de "+nombre);
		nota=src.nextByte();
		src.nextLine();
	}
	void calificaciones() {
		if(nota>=5) {
			System.out.println(nombre+" ha aprobado la asignatura con un "+nota);
		}else {
			System.out.println(nombre+" ha suspendido la asignatura con un "+nota);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alumno alumno1=new Alumno();
		alumno1.calificaciones();
		

	}

}
