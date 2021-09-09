import java.util.Scanner;
public class MayorMenor {
	int n1,n2,n3;
	Scanner src=new Scanner(System.in);
	
	MayorMenor(){
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
	void calcularMayor() {
		if(n1>n2 &&n1>n3) {
			System.out.println(n1+" es el numero mas alto");
		}else if(n3>n2) {
			System.out.println(n3+" es el numero mas alto");
		}else {
			System.out.println(n2+" es el numero mas alto");
		}
	}
	void calcularMenor() {
		if(n1<n2&&n1<n3) {
			System.out.println(n1+" es el numero mas bajo");
		}else if(n3<n2) {
			System.out.println(n3+" es el numero mas bajo");
		}else {
			System.out.println(n2+" es el numero mas bajo");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MayorMenor call=new MayorMenor();
		call.calcularMayor();
		call.calcularMenor();

	}

}
