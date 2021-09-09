import java.util.Scanner;
public class MediaAlturas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src=new Scanner(System.in);
		float altura, sumaAlturas=0, cont=0, media;
		
		do {
			System.out.println("Teclea la altura:");
			altura=src.nextFloat();
			sumaAlturas=sumaAlturas+altura;
			cont++;
		}while(cont<10);
		media=sumaAlturas/cont;
		System.out.print("La altura media de la clase es: ");
		System.out.printf("%4.2f",media);
		
		
		

	}

}
