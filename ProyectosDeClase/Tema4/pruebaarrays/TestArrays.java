package pruebaarrays;
import java.util.Scanner;

public class TestArrays {
	final int NUMARR=10;
	int[]n=new int[NUMARR];
	//int a,b,c;
	Scanner src=new Scanner(System.in);
	TestArrays(){
		
	}
	void teclear() {
		/*System.out.println("teclea un numero:");
		a=src.nextInt();
		System.out.println("teclea otro numero:");
		b=src.nextInt();
		System.out.println("teclea otro numero:");
		c=src.nextInt();*/
		for(int i=0;i<NUMARR;i++) {
		System.out.println("teclea un numero");
		n[i]=src.nextInt();
		}
	}
	
	void visualizar() {
		/*System.out.println(a);
		System.out.println(b);
		System.out.println(c);*/
		for(int x=0;x<NUMARR;x++) {
			System.out.println(n[x]);
		}
	}

	public static void main(String[] args) {
		TestArrays obj1=new TestArrays();
		obj1.teclear();
		obj1.visualizar();
		
		

	}

}
