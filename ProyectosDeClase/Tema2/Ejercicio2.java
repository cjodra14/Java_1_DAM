import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src=new Scanner(System.in);
		int n1, n2, n3;
		
		System.out.println("Tecelea un numero:");
		n1=src.nextInt();
		System.out.println("Teclea otro numero:");
		n2=src.nextInt();
		System.out.println("Teclear un tercer numero:");
		n3=src.nextInt();
		if(n1>n2) {
			System.out.println("La suma de las cantidades es: "+(n1+n2));
		}
		else{
			if(n1<=n2) {
				System.out.println(n1-n2);
				
			}
	
		}
		if(n2>n3) {
			System.out.println(n2*n3);
		}
		else {
			System.out.println(n2/n3);
			
		}


	}

}
