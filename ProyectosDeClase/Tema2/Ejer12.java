import java.util.Scanner;
public class Ejer12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src=new Scanner(System.in);
		final double CAMISA=29.99, CINTURON=16.99, ZAPATOS=55.95, PANTALON=59.99, CALCETINES=9.99, GORRAS=30, SUETER=32.95, CORBATA=40.95, CHAQUETA=84.95, FALDA=39 ;
		byte exit=0, codigo, unidad;
			do {
				System.out.println("		ELIJA EL PRODUCTO DESEADO: ");
				System.out.println();
				System.out.println(" 		PRODUCTO.....................CODIGO");
				System.out.println();
				System.out.println(" 		CAMISA........................ 1");
				System.out.println(" 		CINTURON...................... 2");
				System.out.println(" 		ZAPATOS....................... 3");
				System.out.println(" 		PANTALON...................... 4");
				System.out.println(" 		CALCETINES.................... 5");
				System.out.println(" 		FALDAS........................ 6");
				System.out.println(" 		GORRAS........................ 7");
				System.out.println(" 		SUETER........................ 8");
				System.out.println(" 		CORBATA....................... 9");
				System.out.println(" 		CHAQUETA...................... 10");
				System.out.println();
				System.out.println("		INTRODUZCA CODIGO: ");
				codigo=src.nextByte();
				switch(codigo) {
				case 1:
					System.out.print("		EL PRECIO ES:");
					System.out.printf("%.2f",CAMISA);
					System.out.println(" €");
					System.out.println("		INTRODUZCA NUMERO DE UNIDADES: ");
					unidad=src.nextByte();
					System.out.println();
					System.out.print("		EL TOTAL A PAGAR ES:");
					System.out.printf("%.2f",CAMISA*(double)unidad);
					System.out.println(" €");
					
					break;
				case 2:
					System.out.print("		EL PRECIO ES:");
					System.out.printf("%.2f",CINTURON);
					System.out.println(" €");
					System.out.println("		INTRODUZCA NUMERO DE UNIDADES: ");
					unidad=src.nextByte();
					System.out.println();
					System.out.print("		EL TOTAL A PAGAR ES:");
					System.out.printf("%.2f",CINTURON*(double)unidad);
					System.out.println(" €");
					
					break;
				case 3:
					System.out.print("		EL PRECIO ES:");
					System.out.printf("%.2f",ZAPATOS);
					System.out.println(" €");
					System.out.println("		INTRODUZCA NUMERO DE UNIDADES: ");
					unidad=src.nextByte();
					System.out.println();
					System.out.print("		EL TOTAL A PAGAR ES:");
					System.out.printf("%.2f",ZAPATOS*(double)unidad);
					System.out.println(" €");
					
					break;
				case 4:
					System.out.print("		EL PRECIO ES:");
					System.out.printf("%.2f",PANTALON);
					System.out.println(" €");
					System.out.println("		INTRODUZCA NUMERO DE UNIDADES: ");
					unidad=src.nextByte();
					System.out.println();
					System.out.print("		EL TOTAL A PAGAR ES:");
					System.out.printf("%.2f",PANTALON*(double)unidad);
					System.out.println(" €");
					
					break;
				case 5:
					System.out.print("		EL PRECIO ES:");
					System.out.printf("%.2f",CALCETINES);
					System.out.println(" €");
					System.out.println("		INTRODUZCA NUMERO DE UNIDADES: ");
					unidad=src.nextByte();
					System.out.println();
					System.out.print("		EL TOTAL A PAGAR ES:");
					System.out.printf("%.2f",CALCETINES*(double)unidad);
					System.out.println(" €");
					
					break;
				case 6:
					System.out.print("		EL PRECIO ES:");
					System.out.printf("%.2f",FALDA);
					System.out.println(" €");
					System.out.println("		INTRODUZCA NUMERO DE UNIDADES: ");
					unidad=src.nextByte();
					System.out.println();
					System.out.print("		EL TOTAL A PAGAR ES:");
					System.out.printf("%.2f",FALDA*(double)unidad);
					System.out.println(" €");
					
					break;
				case 7:
					System.out.print("		EL PRECIO ES:");
					System.out.printf("%.2f",GORRAS);
					System.out.println(" €");
					System.out.println("		INTRODUZCA NUMERO DE UNIDADES: ");
					unidad=src.nextByte();
					System.out.println();
					System.out.print("		EL TOTAL A PAGAR ES:");
					System.out.printf("%.2f",GORRAS*(double)unidad);
					System.out.println(" €");
					
					break;
				case 8:
					System.out.print("		EL PRECIO ES:");
					System.out.printf("%.2f",SUETER);
					System.out.println(" €");
					System.out.println("		INTRODUZCA NUMERO DE UNIDADES: ");
					unidad=src.nextByte();
					System.out.println();
					System.out.print("		EL TOTAL A PAGAR ES:");
					System.out.printf("%.2f",SUETER*(double)unidad);
					System.out.println(" €");
					
					break;
				case 9:
					System.out.print("		EL PRECIO ES:");
					System.out.printf("%.2f",CORBATA);
					System.out.println(" €");
					System.out.println("		INTRODUZCA NUMERO DE UNIDADES: ");
					unidad=src.nextByte();
					System.out.println();
					System.out.print("		EL TOTAL A PAGAR ES:");
					System.out.printf("%.2f",CORBATA*(double)unidad);
					System.out.println(" €");
					
					break;
				case 10:
					System.out.print("		EL PRECIO ES:");
					System.out.printf("%.2f",CHAQUETA);
					System.out.println(" €");
					System.out.println("		INTRODUZCA NUMERO DE UNIDADES: ");
					unidad=src.nextByte();
					System.out.println();
					System.out.print("		EL TOTAL A PAGAR ES:");
					System.out.printf("%.2f",CHAQUETA*(double)unidad);
					System.out.println(" €");
					
					break;
				default:
					System.out.println("El numero introducido no es valido");
					break;
					
					
				}
				System.out.println("SI DESEA SALIR PRESIONE 1 O DE LO CONTRIO PRESIONE OTRO NUMERO:");
				exit=src.nextByte();
				
			}while(exit==1);
	}

}
