import java.util.Scanner;
public class Ejercicio7Swich {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src=new Scanner(System.in);
		int dia, mes;
		String zodiaco=new String("");
		
		System.out.println("Introduce el dia numericamente");
		dia=src.nextByte();
		
		if(1<=dia&&dia<=31) { //comprueba que el dia introducido esté entre el 1 y el 31
			
			System.out.println("Introduce el mes numericamente");
			mes=src.nextByte();
			
			if(1<=mes&&mes<=12) { //Comprueba que el mes introducido este entre el 1 y el 12
				
				switch(mes) {
				case 1 :
					zodiaco=(dia<21)?"Tu signo es Capricornio":"Tu signo es Acuario";
					System.out.println(zodiaco);
				break;
				case 2:
					zodiaco=(dia<20)?"Tu signo es Acuario":"Tu signo es Piscis";
					System.out.println(zodiaco);
				break;
				case 3:
					zodiaco=(dia<21)?"Tu signo es Piscis":"Tu signo es Aries";
					System.out.println(zodiaco);
				break;
				case 4:
					zodiaco=(dia<21)?"Tu signo es Aries":"Tu signo es Tauro";
					System.out.println(zodiaco);
				break;
				case 5 :
					zodiaco=(dia<22)?"Tu signo es Tauro":"Tu signo es Geminis";
					System.out.println(zodiaco);
				break;
				case 6:
					zodiaco=(dia<22)?"Tu signo es Geminis":"Tu signo es Cancer";
					System.out.println(zodiaco);
				break;
				case 7:
					zodiaco=(dia<24)?"Tu signo es Cancer":"Tu signo es Leo";
					System.out.println(zodiaco);
				break;
				case 8:
					zodiaco=(dia<223)?"Tu signo es Leo":"Tu signo es Virgo";
					System.out.println(zodiaco);
				break;
				case 9 :
					zodiaco=(dia<24)?"Tu signo es Virgo":"Tu signo es Libra";
					System.out.println(zodiaco);
				break;
				case 10:
					zodiaco=(dia<24)?"Tu signo es Libra":"Tu signo es Escorpio";
					System.out.println(zodiaco);
				break;
				case 11:
					zodiaco=(dia<23)?"Tu signo es Escorpio":"Tu signo es Sagitario";
					System.out.println(zodiaco);
				break;
				default :
					System.out.println("Tu signo es Sagitario");
			}
			
				
			}
			else {
				 System.out.println("Los meses solo pueden ir del 1 al 12");
			}
		}
		else {
			 System.out.println("Los dias solo pueden ir del 1 al 31");
		}
	}

}
