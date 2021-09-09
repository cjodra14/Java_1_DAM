import java.util.Scanner;
public class MayorMenor4 {
	int n1,n2,n3;
	Scanner src=new Scanner(System.in);
	
	MayorMenor4(){
		System.out.println("Teclea un numero");
		n1=src.nextInt();
		do {
		System.out.println("Teclea un segundo numero");
		n2=src.nextInt();
		}while(n2==n1);
		do {
			System.out.println("Teclea un ultimo numero");
			n3=src.nextInt();
		}while(n3==n1&&n3==n1);
				
		
	}
	int calcularMayor(int mayor) {
		if(n1>n2 &&n1>n3) {
			mayor=n1;
		}else if(n3>n2) {
			mayor=n3;
		}else {
			mayor=n2;
		}
		return mayor;
	}
	int calcularMenor(int menor) {
		if(n1<n2&&n1<n3) {
			menor=n1;
		}else if(n3<n2) {
			menor=n3;
		}else {
			menor=n2;
		}
		return menor;
	}
	void visu(int mayor, int menor) {
		System.out.println("el numero mayor es "+mayor);
		System.out.println("el numero menor es "+menor);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mayor, menor;
		MayorMenor4 call=new MayorMenor4();
		mayor=call.calcularMayor(0);
		menor=call.calcularMenor(0);
		call.visu(mayor, menor);

	}

}
