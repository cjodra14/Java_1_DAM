import java.util.*;
public class Ejer20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src=new Scanner(System.in);
		 int numero, baseIni, baseFin, suma;
		 String convertido="";
		 
		 System.out.println("Introduza el numero que desea convertir:");
		 numero=src.nextInt();
		 System.out.println("Introduza en que base está");
		 baseIni=src.nextInt();
		 System.out.println("A que base desea convertirlo?");
		 baseFin=src.nextInt();
		 if(baseIni>baseFin) {
			 //Este es el camino que hace si es de una base mayor a una menor P.E. de decimal a binario
			 while(numero>0) {
				 convertido=(numero%baseFin)+convertido;
				 numero/=baseFin;
			 }
			System.out.println(convertido);
		 }else {
			 //Este camino que hace si es de una base menor a otra mayor P.E. de binario a decimal
			 
		 }
		 
		 
		
	}

}
