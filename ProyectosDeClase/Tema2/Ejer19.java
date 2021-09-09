import java.util.*;
public class Ejer19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src=new Scanner(System.in);
		int numero, num=0;
		String binario="";
		
		
		System.out.println("Introduce el numero que quieres convertir en binario:");
		numero=src.nextInt();
		if(numero>0) {  //
			num=numero;
			while(numero>0) {
				if(numero%2==0) {
					binario="0"+binario;
				}else {
					binario="1"+binario;
				}
				numero=numero/2;
			}
		}else if(numero==0) {
			binario="0";
		}
		else {
			System.out.println("Es numero no se pudo convertir a Binario, introduce un numero entero en positivo");
		}
		
		System.out.println("El numero "+num+" convertido a binario es "+binario);

	}

}
