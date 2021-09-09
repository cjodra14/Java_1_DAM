import java.util.Scanner;
public class RestaDouble {
	Scanner src=new Scanner(System.in);
	double n1, n2, acum;
	
	RestaDouble(){
		System.out.println("Teclea el primer numero");
		n1=src.nextDouble();
		System.out.println("teclea el segundo numero");
		n2=src.nextDouble();
	}
	void restar() {
		acum=(double) (n1-n2);
	}
	void visualizar() {
		System.out.println(acum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestaDouble obj1=new RestaDouble();
		obj1.restar();
		obj1.visualizar();

	}

}
