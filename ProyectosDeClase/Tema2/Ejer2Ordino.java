import java.util.*;
public class Ejer2Ordino {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src=new Scanner(System.in);
		int curso=0, conth=0, contm=0;
		char sexo='0', mas='0';
		String nombre="";
		
		
		do {
			System.out.println("Cual es el nombre del alumno/a");
			nombre=src.nextLine();	// Introduce el nombre en la string
			do {	//
				System.out.println("cual es su sexo?( M para mujeres, H para hombres)");
				sexo=src.next().charAt(0); //Introduce el caracter del sexo
				
			}while(sexo!='M'&&sexo!='H'); // mientras no sea m o h  vuelve
			do {
				System.out.println("En que curso esta?");
				curso=src.nextInt(); //  introducimos el curso
			}while(curso<1||curso>3); // mientras el curso sea menor que 1 o mayor que 3  vuelve al do
			if(sexo=='H') { // si  en sexo hemos puesto h suma 1 al contador hombres
				conth++;
			}else { // si en sexo no hemos puesto h suma 1 al contador mujeres
				contm++;
			}
			System.out.println("Si no desea continuar teclea la letra N");
			mas=src.next().charAt(0); // Introduce el caracter para continuar
			src.nextLine();
		}while(mas!='n'&&mas!='N'); // si mas es diferente de n o N  vuelve al do del principio 
		System.out.println("En total hay "+conth+" hombres y "+contm+" mujeres");
		

	}

}
