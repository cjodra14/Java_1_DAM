import java.util.Scanner;

public class EjercicioIfConducir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		byte edad;
		int cc, mma;
		char tipoVehic;
		
		
		
//-----------------------------------------
		System.out.println("¿Para que vehiculo quieres obtener el permiso?(a para coche, m para moto)?");
		tipoVehic=teclado.next().charAt(0);
		if(tipoVehic=='m') {
			System.out.println("¿Cuantos cc tiene la moto que desea conducir?");
			cc=teclado.nextInt();
			if(cc>125) {
				System.out.println("Teclee su edad:");
				edad=teclado.nextByte(); 
				if(edad>=18) {
					System.out.println("PUEDES TENER PERMISO DE CONDUCCIÓN");
					
				}
			}
			else {
				System.out.println("Teclee su edad:");
				edad=teclado.nextByte(); 
				if(edad>=16) {
					System.out.println("PUEDES TENER PERMISO DE CONDUCCIÓN");
					
				}

			}
		}
		else {
			System.out.println("¿Cual es la mma del automovil que desea conducir?");
			mma=teclado.nextInt();
			if(mma<3500) {
				System.out.println("Teclee su edad:");
				edad=teclado.nextByte(); 
				if(edad>=18) {
					System.out.println("PUEDES TENER PERMISO DE CONDUCCIÓN");
					
				}
				
				
			}
			
		}
		

	}

}
