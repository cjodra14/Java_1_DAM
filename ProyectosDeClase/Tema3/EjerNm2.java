import java.util.Scanner;
public class EjerNm2 {
	Scanner src=new Scanner(System.in);
	int n,m,res=1;
	EjerNm2(){
		System.out.println("Calculo de Nm");
		
	}
	void potencia(int n, int m, int res){
		for(int i=0;m>i;i++) {
			res=res*n;
		}
		System.out.println("El numero "+n+" a la potencia de "+m+" da: "+res);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EjerNm2 ej1=new EjerNm2();
		ej1.potencia(2,8,1);

	}

}