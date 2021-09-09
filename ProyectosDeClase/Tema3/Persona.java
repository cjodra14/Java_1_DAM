import java.util.*;
public class Persona {
	Scanner src=new Scanner(System.in);
	String nombre="";
	byte edad;
	
	void setDatos() {
		System.out.println("Introduce el nombre de la persona:");
		nombre=src.nextLine();
		System.out.println("Introduce la edad de "+nombre+":");
		edad=src.nextByte();
		src.nextLine();
	}
	void getDatos() {
		System.out.println(nombre+" tiene "+edad+" años");
	}
	void mayorEdad() {
		if(edad>=18) {
			System.out.println(nombre+" es mayor de edad");
		}else {
			System.out.println(nombre+" es menor de edad");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona user=new Persona();
		user.setDatos();
		user.getDatos();
		user.mayorEdad();
	}

}
