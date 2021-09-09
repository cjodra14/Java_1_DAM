import java.util.Scanner;
public class EjerNm1 {
	Scanner src=new Scanner(System.in);
	int n,m,res=1;
	EjerNm1(){
		System.out.println("Introduce el Numero N");
		n=src.nextInt();
		System.out.println("Introduce el numero M");
		m=src.nextInt();
	}
	void potencia(){
		for(int i=0;m>i;i++) {
			res=res*n;
		}
		System.out.println("El numero "+n+" a la potencia de "+m+" da: "+res);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EjerNm1 ej1=new EjerNm1();
		ej1.potencia();

	}

}
