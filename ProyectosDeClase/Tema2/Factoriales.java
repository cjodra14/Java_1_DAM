import java.util.Scanner;
public class Factoriales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src=new Scanner(System.in);
		int fact, n=0, aux;
		
		fact=1;
		 do{
			
		System.out.println("Teclea un numero");
		n=src.nextInt();
			
		}while(n<0);
		aux=n;
		while(n>0) {
			fact=fact*n;
			n--;
		}
		System.out.println("El factorial de "+aux+" es "+fact);

	}

}
