import java.util.Scanner;
public class Ejer13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src=new Scanner(System.in);
		int numero;
		
		System.out.println("Introduce un numero para saber sus divisores:");
		numero=src.nextInt();
		for(int i=1;i<=numero;i++) {
			if(numero%i==0){
				System.out.println(i);
			}
		}

	}

}
