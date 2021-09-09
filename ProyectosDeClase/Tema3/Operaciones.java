import java.util.Scanner;
public class Operaciones {
	Scanner src=new Scanner(System.in);
	int num1, num2; 
	Operaciones(){
		
	}
	
	void inicializar(){
		System.out.println("Teclea un numero:");
		num1=src.nextInt();
		System.out.println("Teclea otro numero:");
		num2=src.nextInt();
	}
	void sumar(){
		System.out.println("La suma de "+num1+" y "+num2+" es: "+(num1+num2));
	}
	void restar(){
		System.out.println("La resta de "+num1+" y "+num2+" es: "+(num1-num2));
	}
	void multiplicar(){
		System.out.println("La multiplicación de "+num1+" y "+num2+" es: "+(num1*num2));
	}
	void dividir(){
		System.out.println("La división de "+num1+" y "+num2+" es: "+(num1/num2));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operaciones oper1=new Operaciones();
		oper1.inicializar();
		oper1.sumar();
		oper1.restar();
		oper1.multiplicar();
		oper1.dividir();

	}

}
