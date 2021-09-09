import java.util.Scanner;
public class Prueba6 {

	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		int primo=0, divisor=2, nume;
		
		System.out.println("Teclea un numero");
		nume=src.nextInt();
		while(divisor<nume&&primo==0) {
			if(nume%divisor==0) {
				primo=1;
			}else { 
			divisor=divisor+1;}
		}
		if(primo==0) {
			System.out.println("Es primo");
		}else {
			System.out.println("no es primo");
		}
		

	}

}
