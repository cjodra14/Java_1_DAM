import java.util.Scanner;
public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src=new Scanner(System.in);
		byte numero;
		
		System.out.println("teclea un numero");
		numero=src.nextByte();
		
		switch(numero) {
		case 1:
			System.out.println("1 ");
		case 2:
			System.out.println("2 ");
		case 3:
			System.out.println("3 ");
		case 4:
			System.out.println("4 ");
		case 5:
			System.out.println("5 ");

		case 6:
			System.out.println("6 ");

		case 7:
			System.out.println("7 ");
		
		case 8:
			System.out.println("8 ");
	
		case 9:
			System.out.println("9 ");
		case 10:
			System.out.println("10");
			break;
		default:
			System.out.println("El numero es mayor a 10");
		break;
		
		}

	}

}
