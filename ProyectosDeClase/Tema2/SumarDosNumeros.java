import java.util.Scanner;

public class SumarDosNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int n1, n2;
		boolean numero;
		
		System.out.println("Tecelea un numero:");
		n1=teclado.nextInt();
		System.out.println("Teclea otro numero:");
		n2=teclado.nextInt();
		System.out.println("El producto de los dos numeros es: "+(n1*n2));
		System.out.println("La suma de los dos numeros es: "+(n1+n2));
		
		//numero=(n1>n2);
		//System.out.println("El primer numero es mayor?"+numero);
		
		if(n1>n2) {
			System.out.println("El numero mayor es: "+n1);
		}
		else if(n1==n2) {
			System.out.println("Los numeros son iguales");
		}
		else {
			System.out.println("El numero mayor es: "+n2);
		}
	}

}
