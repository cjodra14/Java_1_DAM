import java.util.Scanner;
public class EjercicioABTH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src=new Scanner(System.in);
		byte a,b,t,h;
		
		
		//Teclear a y b
		System.out.println("teclea a: ");
		a=src.nextByte();
		System.out.println("teclea b");
		b=src.nextByte();
		
		//Comprueba si a o b son menores de 50
		while(50<a||50<b) {
			System.out.println("teclea a");
			a=src.nextByte();
			System.out.println("teclea b");
			b=src.nextByte();
		}
		
		
		//Comprueba que b sea menor que a
		if(b<a) {
			t=b;
			h=a;
		}
		else {
			t=a;
			h=b;
		}
		
		
		//si t es menor o igual a h hace esa operacion hasat que se igualen o sea verdadero y termina el programa
		while(t<=h) {
			System.out.println("la var h es "+h+" la var t es "+t);
			t=(byte) (t+5);
			h=(byte) (h-2);
			
		}
		
	}

}
