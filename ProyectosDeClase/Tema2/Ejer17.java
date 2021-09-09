import java.util.*;
public class Ejer17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src=new Scanner(System.in);
		int n1, n2, suma=0, i;
		
		System.out.println("Introduce el primer numero:");
		n1=src.nextInt();
		System.out.println("Introduce el segundo numero");
		n2=src.nextInt();
		
		for(i=1;i<n1;i++) {
			if(n1%i==0) { // Si el resto es igual a 0 entre en el if
				suma=suma+i; // a suma le añade el divisor
			}
			
		}
		
		if(suma==n2) { //Comprueba si  la suma de divisores es igual al segundo numero introducido
			suma=0; //Iguala suma a 0
			for(i=1;i<n2;i++) { 
				if(n2%i==0) { //si el resto de el segundo numero es 0 entra en el if
					suma=suma+i; // Le añade divisor a suma
				}
				
			}
			if(suma==n1) {
				System.out.println("Son amigos"); //Compara si suma es iguala  1
			}else {
				System.out.println("No son amigos");
			}
			
		}
		else {
			System.out.println("No son amigos");
		}
		
		src.close();
			
		

	}

}
