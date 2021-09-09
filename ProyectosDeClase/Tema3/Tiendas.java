import java.util.Scanner;
public class Tiendas {
	Scanner src=new Scanner(System.in);
	String nomTienda="", cif="", calle="", web="", mail="", dniDuenio="" , nombreDuenio="", apel1="", apel2=""; 
	byte num;
	int tel, fax;
	
	Tiendas(){
		System.out.println("Introduzca el CIF de la tienda:");
		cif=src.nextLine();
		System.out.println("¿Cómo se llama la tienda?");
		nomTienda=src.nextLine();
		System.out.println("¿Cual es el telefono de la tienda?");
		tel=src.nextInt();
		src.nextLine();
		System.out.println("¿En que calle esta la tienda?");
		calle=src.nextLine();
		System.out.println("¿Cual es el numero del portal de la tienda?");
		num=src.nextByte();
		src.nextLine();
		System.out.println("¿Cual es la web de la empresa?");
		web=src.nextLine();
		System.out.println("Introduzca el fax de la empresa:");
		fax=src.nextInt();
		src.nextLine();
		System.out.println("Introduzca el e-mail de la empresa:");
		mail=src.nextLine();
		System.out.println("¿Cual es el DNI del dueño?");
		dniDuenio=src.nextLine();
		System.out.println("¿Cual es el nombre del dueño?");
		nombreDuenio=src.nextLine();
		System.out.println("¿Cual es el primer apellido del dueño?");
		apel1=src.nextLine();
		System.out.println("¿Cual es el primer apellido del dueño?");
		apel2=src.nextLine();
		
	}
	void datosTienda() {
		System.out.println("El numero de "+nomTienda+" es el siguiente: "+tel);
		
	}
	void datosDuenio() {
		System.out.println("El CIF es el siguiente: "+cif);
		System.out.println("Su dueño es: "+nombreDuenio+" "+apel1+" "+apel2);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tiendas tien1=new Tiendas();
		tien1.datosTienda();
		tien1.datosDuenio();
		
		

	}

}
