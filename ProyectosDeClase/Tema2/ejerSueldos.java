import java.util.Scanner;
public class ejerSueldos {
/*
 * Si el sueldo es mayor a 2k es el sueldoFinal
 * Si el sueldo es menor a 2k y la antiguedad igual o mayor a 10 el sueldo sube un 20%
 * Si el sueldo es menor a 2k y la antiguedad menor a 10 el sueldo sube un 5%
 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src=new Scanner(System.in);
		float sueldo, sueldoFinal=0 ;
		byte ant;
		char opc;
		
		do {
			System.out.println("Introduzca el sueldo: ");
			sueldo=src.nextFloat();
			if(sueldo<2000) { //Nos comprueba si el sueldo es menor a 2k
				System.out.println("Introduce la antiguedad");
				ant=src.nextByte();
				sueldoFinal=(ant>=10)?(sueldo*1.2F):(sueldo*1.05F); //Depende la antiguedad nos guarda en sueldoFinal  el sueldo por el incremento
			}else {
				sueldoFinal=sueldo;
			}
			System.out.print("El sueldo es:");
			System.out.printf("%.2f",sueldoFinal); //Formate el sueldo a 2 digitos despues de la coma
			System.out.println();
			System.out.println("¿Desea introducir mas sueldos?");
			opc=src.next().charAt(0);
			
		} while(opc=='s'); //Mientras pongamos s en opc nos deja introducir un nuevo sueldo
		
		

	}

}
