import java.util.Scanner;
public class Impresoras {
	Scanner src=new Scanner(System.in);
	String marca, interfaz ;
	byte ppm;
	float peso;
	char color;
	int buffer;
	
Impresoras(){
	System.out.println("Introduce el nombre de la impresora");
	marca=src.nextLine();
	System.out.println("Cual es su velocidad de impresión expresada en ppm: ");
	ppm=src.nextByte();
	System.out.println("Cuanto pesa la impresora (expresado en KG)");
	peso=src.nextFloat();
	System.out.println("¿De que color es la impresora? (utilizar un solo caracter)");
	color=src.next().charAt(0);
	System.out.println("Cuanto es el buffer de memoria( nº de MB)");
	buffer=src.nextInt();
	src.nextLine();
	System.out.println("Interfaz de conexión:");
	interfaz=src.nextLine();
	
	
}
	void comprobarColor() {
		while(color!='v'&&color!='r'&&color!='a'&&color!='b'&&color!='n') {
			System.out.println("El color introducido es erroneo, teclea uno de los siguientes colores v, r, a, b o n");
			color=src.next().charAt(0);
		}
	}
	void datosImpresora() {
		System.out.println("/////////////////////////////////////////////////////////");
		System.out.println("// "+marca+"         "+ppm+" paginas/minuto 	   		 //");
		System.out.println("// peso:"+peso+"KG"+"tiene "+buffer+"MB de memoria			//");
		System.out.println("// se conecta por "+interfaz+"                			//");
		System.out.println("/////////////////////////////////////////////////////////");
		
	}
	void colorIf() {
		System.out.println("La impresora es de la marca "+marca);
		System.out.print("Es de color: ");
		if(color=='r') {
			System.out.println("rojo");
		}else{
			if(color=='v') {
				System.out.println("verde");
			}
			else {
				if(color=='a') {
					System.out.println("azul");
				}else {
					if(color=='b') {
						System.out.println("blanco");
					}else {
						System.out.println("negro");
					}
				}
			}
		}
		
	}
	void colorSwitch() {
		System.out.println("La impresora es de la marca "+marca);
		System.out.println("La impresora pesa "+peso+"KG");
		System.out.print("Es de color: ");
		switch(color) {
		case 'r':
			System.out.println("rojo");
		break;
		case 'v':
			System.out.println("verde");
		break;
		case 'a':
			System.out.println("azul");
		break;
		case 'b':
			System.out.println("blanco");
		break;
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Impresoras impres1=new Impresoras();
		impres1.comprobarColor();
		impres1.datosImpresora();
		impres1.colorIf();
		Impresoras impres2=new Impresoras();
		

	}

}
