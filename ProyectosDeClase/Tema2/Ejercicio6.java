import java.util.Scanner;
public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src=new Scanner(System.in);
		float importe, total;
		
		System.out.println("Teclee el importe de la compra:");
		importe=src.nextFloat();
		
		total=(float) ((importe>=300)?(importe*0.8):importe);
		System.out.print("El total de la compra es: ");
		System.out.printf("%5.2f",total);
		System.out.println("€");
		

	}

}
