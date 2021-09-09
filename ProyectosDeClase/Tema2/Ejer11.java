import java.util.Scanner;
public class Ejer11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src=new Scanner(System.in);
		final float SUELDOBASE=12F;
		float horasOficina, horas25, horas50, horasDoble;
		byte exit;
		
		
		do {
			System.out.println("		Horario			 Pago	");
			System.out.println("	8:00 AM - 4:00PM	 	PAGO BASE");
			System.out.println("	4:00 PM - 8:00PM	  25 POR CIENTO EXTRA");
			System.out.println("	8:00 PM - 0:00AM	  50 POR CIENTO EXTRA");
			System.out.println("	0:00 AM - 8:00AM	 	PAGO DOBLE");
			System.out.println();
			System.out.println("SUELDO BASE POR HORA TRABAJADA: 12€");
			System.out.println();
			System.out.println("Numero de horas trabajadas  de 8:00 am a 4:00pm: ");
			horasOficina=src.nextFloat();
			System.out.println("Numero de horas trabajadas  de 4:00 pm a 8:00pm: ");
			horas25=src.nextFloat();
			System.out.println("Numero de horas trabajadas  de 8:00 pm a 0:00am: ");
			horas50=src.nextFloat();
			System.out.println("Numero de horas trabajadas  de 0:00 am a 8:00am: ");
			horasDoble=src.nextFloat();
			System.out.println();
			System.out.print("EL PAGO TOTAL QUE RECIBIRA EL TRABAJADOR ES:");
			System.out.printf("%.2f",(horasOficina*SUELDOBASE+horas25*SUELDOBASE+horas50*SUELDOBASE+horasDoble*SUELDOBASE));
			System.out.println(" €");
			System.out.println();
			System.out.print("EL SALARIO DEL TRABAJADOR POR HORAS DE OFICINA ES: ");
			System.out.printf("%.2f",(horasOficina*SUELDOBASE));
			System.out.println("€");
			System.out.print("EL SALARIO DEL TRABAJADOR POR HORAS EXTRA ES: ");
			System.out.printf("%.2f",(horas25*SUELDOBASE+horas50*SUELDOBASE+horasDoble*SUELDOBASE));
			System.out.println("€");
			if(horas25*SUELDOBASE+horas50*SUELDOBASE+horasDoble*SUELDOBASE>horasOficina*SUELDOBASE) {
				System.out.println("EL TRABAJADOR GANO MAS DINERO POR HORAS EXTRA QUE POR HORAS DE OFICINA");
			}else {
				System.out.println("EL TRABAJADOR GANO MAS DINERO POR HORAS DE OFICINA QUE POR HORAS EXTRA");
			}
			System.out.println();
			System.out.println("SI DESEA CONTINUAR PRESIONE 1 O DE LO CONTRARIO PRESIONE OTRO NUMERO:");
			exit=src.nextByte();
			
		}while(exit==1);

	}

}
