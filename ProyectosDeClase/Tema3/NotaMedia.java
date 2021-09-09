import java.util.Scanner;
public class NotaMedia {
	String nombre="";
	float notas=0.0F, nota, total;
	byte cont=0;
	char exit='s';
	
	
	Scanner src=new Scanner(System.in);

	NotaMedia(){
		System.out.println("Introduzca el nombre del alumno:");
		nombre=src.nextLine();
			while(exit=='s') {
				System.out.println("Teclea la nota de la asignatura");
				nota=src.nextFloat();
				notas=notas+nota;
				cont++;
				System.out.println("Si desea salir pulse n, si desea continuar pulse s");
				exit=src.next().charAt(0);
				
			}
	}
	
	void obtenerNotaMedia() {
		total=notas/cont;
		System.out.println("La nota media de "+nombre+" es: "+total);
	}
	
	public static void main(String[] args) {
		NotaMedia alum1=new NotaMedia();
		alum1.obtenerNotaMedia();

	}

}
