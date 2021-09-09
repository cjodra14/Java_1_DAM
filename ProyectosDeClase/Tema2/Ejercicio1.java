import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int numero;
		
	//Entrada del numero
		System.out.println("Teclea un numero:");
		numero=teclado.nextInt();
		if(numero>0) {
			System.out.println("El numero "+numero+" es positivo");
		}
		else if(numero<0) {
			System.out.println("El numero "+numero+" es negativo");
		}
			
	}

}
