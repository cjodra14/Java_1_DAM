import java.util.Scanner;
public class EjerNm3 {
	Scanner src=new Scanner(System.in);
	int n,m,res=1;
	EjerNm3(){
		System.out.println("Introduce el Numero N");
		n=src.nextInt();
		System.out.println("Introduce el numero M");
		m=src.nextInt();
	}
	void potencia(){
		for(int i=0;m>i;i++) {
			res=res*n;
		}
		
	}
	
	void visualizar() {
		System.out.println("El numero "+n+" a la potencia de "+m+" da: "+res);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EjerNm3 ej1=new EjerNm3();
		ej1.potencia();
		ej1.visualizar();

	}

}