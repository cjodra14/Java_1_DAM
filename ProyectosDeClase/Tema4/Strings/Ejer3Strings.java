package Strings;
import java.util.Scanner;

public class Ejer3Strings {
	Scanner src=new Scanner(System.in);
	String contra="12345abc";
	String comprobar;
	
	void introducir() {
		System.out.println("Introduce la contraseņa para avanzar");
		comprobar=src.nextLine();
	}
	void comprobacion() {
		if(comprobar.equals(contra)) {
			System.out.println("Contraseņa correcta");
			
		}else {
			System.out.println("Contraseņa incorrecta");
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejer3Strings ob1=new Ejer3Strings();
		ob1.introducir();
		ob1.comprobacion();

	}

}
