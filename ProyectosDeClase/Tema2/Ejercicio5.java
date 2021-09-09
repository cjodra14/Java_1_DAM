import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src=new Scanner(System.in);
		int n1, n2, n3,n4,n5;
		
		
		System.out.println("Introduce el primer numero");
		n1=src.nextInt();
		System.out.println("Introduce el segundo numero");
		n2=src.nextInt();
		System.out.println("Introduce el tercer numero");
		n3=src.nextInt();
		System.out.println("Introduce el cuarto numero");
		n4=src.nextInt();
		System.out.println("Introduce el quinto numero");
		n5=src.nextInt();
		
		if(n1==n2&&n2==n3&&n3==n4&&n4==n5) {
			System.out.println("Son iguales");
		}
		else {
			if(n1==n2&&n2!=n3) {
				System.out.println(n2+" no es igual que "+n3);
			}
			else {
				if(n1!=n2&&n3==n4) {
					System.out.println("La suma de "+n3+" y "+n4+" es: "+(n3+n4) );
				}
				else {
					if(n1!=n2&&n4==n5) {
						System.out.println("La suma de "+n4+" y "+n5+" es: "+(n5+n4) );
					}
					else {
						
					}
				}
				
				
			}
		}
		src.close();
	}

}
