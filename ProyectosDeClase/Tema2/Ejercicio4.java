import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src=new Scanner(System.in);
		boolean bisiesto;
		int anio; 
		boolean a, b, c;
		
		System.out.println("Teclea un año:");
		anio=src.nextInt();
		if(anio%100==0) {
			if(anio%400==0) {
				System.out.println("El año es bisiesto");
			}
			else {
				System.out.println("El año no es bisiesto");
			}
		}
		else {
			if(anio%4==0) {
				System.out.println("El año es bisiesto");
			}
			else {
				System.out.println("El año no es bisiesto");
			}
		}
	src.close();
	}

}
