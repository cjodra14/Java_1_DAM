import java.util.Scanner;
public class Ejer10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src=new Scanner(System.in);
		float nota;
		
		
		System.out.println("			 NOTAS 		 EQUIVALETE");
		System.out.println("			9.0 - 10.0 	      A ");
		System.out.println("			8.5 - 8.9  	      B+ ");
		System.out.println("			8.0 - 8.4 	      B ");
		System.out.println("			7.5 - 7.9 	      C+ ");
		System.out.println("			7.0 - 7.4 	      C ");
		System.out.println("			6.0 - 6.9 	      D ");
		System.out.println("			0.0 - 5.9 	      F ");
		
		System.out.println("Introduzca su nota en programación	: ");
		nota=src.nextFloat();
		if(nota<9) {
			if(nota<8.5) {
				if(nota<8) {
					if(nota<7.5) {
						if(nota<7) {
							if(nota<6) {
								System.out.println("NOTA EQUIVALENTE EN STANDARD GRADING SYSTEM:F");
								System.out.println("Mal, nivel muy bajo");
							}
							else {
								System.out.println("NOTA EQUIVALENTE EN STANDARD GRADING SYSTEM:	D");
								System.out.println("Mal, nivel bajo");
							}
						}
						else {
							System.out.println("NOTA EQUIVALENTE EN STANDARD GRADING SYSTEM:	C");
							System.out.println("Bien, nivel medio");
						}
					}
					else {
						System.out.println("NOTA EQUIVALENTE EN STANDARD GRADING SYSTEM:	C+");
						System.out.println("Bien, nivel bastante bueno");
					}
				}
				else {
					System.out.println("NOTA EQUIVALENTE EN STANDARD GRADING SYSTEM:	B");
					System.out.println("Bien, nivel bueno");
				}
			}else {
				System.out.println("NOTA EQUIVALENTE EN STANDARD GRADING SYSTEM:	B+");
				System.out.println("Bien, nivel muy bueno");
			}
		}
		else {
		System.out.println("NOTA EQUIVALENTE EN STANDARD GRADING SYSTEM:	A");
		System.out.println("Bien, nivel excelente");
		}
		
	}

}
