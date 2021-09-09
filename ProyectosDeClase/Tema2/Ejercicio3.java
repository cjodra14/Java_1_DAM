import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src=new Scanner(System.in);
		int n1, n2, n3;
		String result;
		
		System.out.println("Introduce el primer numero");
		n1=src.nextInt();
		System.out.println("Introduce el segundo numero");
		n2=src.nextInt();
		System.out.println("Introduce el tercer numero");
		n3=src.nextInt();
		
		result=((n1+n2==n3)|(n1+n3==n2)|(n2+n3==n1))?"Son iguales":"No son iguales";
		
		System.out.println(result);
		
		
		
	
		
	}

}
