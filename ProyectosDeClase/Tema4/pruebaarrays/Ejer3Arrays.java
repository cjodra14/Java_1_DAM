package pruebaarrays;
import java.util.Scanner;

public class Ejer3Arrays {
	Scanner src=new Scanner(System.in);
	int longitud=0;
	int [] n;
	Ejer3Arrays(){
		System.out.println("Teclea la longitud deseada para el array");
		longitud=src.nextInt();
		n=new int[longitud];
		
		
	}
	void llenar() {
		for(int x=0;x<n.length;x++) {
			n[x]=x+1;
		}
	}
	void visualizar() {
		for(int x=0;x<n.length;x++) {
			System.out.println(n[x]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejer3Arrays obj=new Ejer3Arrays();
		obj.llenar();
		obj.visualizar();

	}

}
