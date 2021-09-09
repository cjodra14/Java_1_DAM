import java.util.Scanner;
//visualiza true o false si un año es bisiesto o no
public class Bisiesto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		boolean bisiesto;
		int anio; 
		boolean a, b, c;
		
		
		
		System.out.println("Teclea un numero:");
		anio=teclado.nextInt();
		bisiesto=anio%100==0?anio%400==0:anio%4==0;
		
		/*c=anio%4==0;
		a=anio%100==0;
		b=anio%400==0;
		bisiesto=((a&&b)||(!a&&c));
		*/
		System.out.println(bisiesto);
		

	}

}
