
public class Ejer16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, suma, divisor;
		System.out.println("Numeros perfecto entre 1 y 100");
		for(i=1;i<=100;i++) { //i es el numero a comprobar, en este caso 100
			suma=0;
			for(divisor=1;divisor<i;divisor++) { //divisor son los divisores. Se divide desde 1 hasta i-1
				if(i%divisor==0) {
					suma=suma+divisor; //si es divisor se suma
				}
			}
			 if(i == suma){             // si el numero es igual a la suma de sus divisores es perfecto              
	             System.out.println(i);
	          }
			
		}

	}

}
