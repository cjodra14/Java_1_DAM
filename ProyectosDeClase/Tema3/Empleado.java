import java.util.Scanner;
public class Empleado {
	Scanner src=new Scanner(System.in);
	float sueldo;
	String nombre="";
	
	void inicializar() {
		System.out.println("Introduzca su nombre:");
		nombre=src.nextLine();
		System.out.println("Introduzca su sueldo:");
		sueldo=src.nextFloat();
		src.nextLine();
	}
	
	void impuestos() {
		if(sueldo>20000.5f) {
			System.out.println(nombre+" debe pagar impuestos");
		}else {
			System.out.println(nombre+" no debe pagar impuestos");
			
		}
	}
	public static void main(String[] args) {
		Empleado trabajador1=new Empleado();
		trabajador1.inicializar();
		trabajador1.impuestos();
	
			
		

	}

}
