import java.util.Scanner;
public class EjercicioParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte num, cantNegativos=0, cantPositivos=0, cantMultiplos=0, contNumeros=0;
		short sumarPares=0;
		Scanner src=new Scanner(System.in) ;
		
		
		
		do {
			System.out.println("Teclea un número:");
			num=src.nextByte();
			if(num>=0) {
				cantPositivos++;				
			}
			else {
				cantNegativos++;
			}
			if(num%15==0) {
				cantMultiplos++;
				
			}
			if(num%2==0) {
				sumarPares=(short)(sumarPares+num);
			}
			contNumeros++;
		}
		while(contNumeros<10);
		
		System.out.println("la cantidad de positivos es:"+cantPositivos);
		System.out.println("la cantidad de negativos es:"+cantNegativos);
		System.out.println("la cantidad de multiplos es: "+cantMultiplos);
		System.out.println("la suma de los pares es: "+sumarPares);
			
		/*
		 * 
		while(contNumeros<10) {
			System.out.println("Teclea un número:");
			num=src.nextByte();
			if(num>=0) {
				cantPositivos++;				
			}
			else {
				cantNegativos++;
			}
			if(num%15==0) {
				cantMultiplos++;
				
			}
			if(num%2==0) {
				sumarPares=(short)(sumarPares+num);
			}
			contNumeros++;
			
			
		}
		System.out.println("la cantidad de positivos es:"+cantPositivos);
		System.out.println("la cantidad de negativos es:"+cantNegativos);
		System.out.println("la cantidad de multiplos es: "+cantMultiplos);
		System.out.println("la suma de los pares es: "+sumarPares);
		*/
	}

}
