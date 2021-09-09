import java.util.Scanner;
public class EjerNm4 {
	Scanner src=new Scanner(System.in);
	int n,m,res=1;
	EjerNm4(){
		System.out.println("Introduce el Numero N");
		n=src.nextInt();
		System.out.println("Introduce el numero M");
		m=src.nextInt();
	}
	void potencia(){
		for(int i=0;m>i;i++) {
			res=res*n;
		}
		visualizar();
		
	}
	
	void visualizar() {
		System.out.println("El numero "+n+" a la potencia de "+m+" da: "+res);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EjerNm4 ej1=new EjerNm4();
		ej1.potencia();

	}

}