import java.util.Scanner;
public class AlturaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src=new Scanner(System.in);
		int altura;
		String nombre;
		
		
		System.out.println("Introduce tu altura");
		altura=src.nextInt();
		src.nextLine();// LO utilizamos para limpiar el buffer
		
		System.out.println("Introduce tu nombre");
		nombre=src.nextLine();
		
		
		System.out.println("Te llamas "+nombre+" y tu altura es "+altura+"cm");
		src.close();
	}

}
