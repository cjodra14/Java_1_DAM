import java.util.Scanner;
public class PruebaSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src=new Scanner(System.in);
		short n1, n2;
		char opcion;
		
		System.out.println("Teclea un numero:");
		n1=src.nextShort();
		
		System.out.println("Teclea otro numero:");
		n2=src.nextShort();
		System.out.println();
		
		System.out.println(" s Sumar \n r Restar \n m Multiplicar \n d Dividir \n Elige una Opción:");
		opcion=src.next().charAt(0);
		
		switch(opcion) {
			case 's':
				System.out.println("el resultado de la suma es: "+(n1+n2));
			break;
			case 'r':
				System.out.println("El resultado de la resta es: "+(n1-n2));
			break;
			case 'm':
				System.out.println("El resultado de la multiplicacion es:"+(n1*n2));
			break;
			case 'd':
				System.out.println("El resultado de la división es: "+(n1/n2));
			break;
			
			default :
				System.out.println(" s Sumar \n r Restar \n m Multiplicar \n d Dividir \n Elige una Opción:");
				opcion=src.next().charAt(0);
		}

	}

}
