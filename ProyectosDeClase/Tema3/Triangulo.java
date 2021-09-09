import java.util.*;
public class Triangulo {
	Scanner src=new Scanner(System.in);
	byte lado1, lado2, lado3;
	 static boolean equil;
	
	void setDatos() {
		System.out.println("Teclea la longitud del lado 1:");
		lado1=src.nextByte();
		System.out.println("Teclea la longitud del lado 2:");
		lado2=src.nextByte();
		System.out.println("Teclea la longitud del lado 3:");
		lado3=src.nextByte();
		
	}
	void ladoMayor() {
		if((lado1>lado2)&&(lado1>lado3)) {
			System.out.println("El lado 1 es mas largo");
			}
		else if((lado2>lado3)) {
			System.out.println("El lado 2 es mas largo");
		}else {
			System.out.println("El lado 3 es mas largo");
		}
		
	}
	void equilatero() {
		if((lado1==lado2)&&(lado2==lado3)) {
			equil=true;
			System.out.println("es equilatero");
		}else {
			System.out.println("no es equilatero");
			equil=false;
		}
		
	}
	

	public static void main(String[] args) {
		Triangulo tri=new Triangulo();
		tri.setDatos();
		tri.equilatero();
		if(equil==false) {
			tri.ladoMayor();}
		
		
		
		

	}
	

}
