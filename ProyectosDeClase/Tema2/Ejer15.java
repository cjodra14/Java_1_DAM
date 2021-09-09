import java.util.Scanner;
public class Ejer15 {

	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		 final int PRIMERO=1, SEGUNDO=2, TERCERO=3, CUARTO=4, QUINTO=5;
			
			for(int i=1;i<=10;i++) {
				System.out.println(PRIMERO+"x"+i+"="+PRIMERO*i+"	"+SEGUNDO+"x"+i+"="+SEGUNDO*i+"	"+TERCERO+"x"+i+"="+TERCERO*i+"	"+CUARTO+"x"+i+"="+CUARTO*i+"	"+QUINTO+"x"+i+"="+QUINTO*i);
			}
	}
}
