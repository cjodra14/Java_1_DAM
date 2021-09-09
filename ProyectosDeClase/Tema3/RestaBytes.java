import java.util.Scanner;
public class RestaBytes {
	Scanner src=new Scanner(System.in);
	byte n1, n2, acum;
	
	void setDatos() {
		System.out.println("Teclea el primer numero");
		n1=src.nextByte();
		System.out.println("teclea el segundo numero");
		n2=src.nextByte();
		
	}
	void restar() {
		acum=(byte) (n1-n2);
	}
	void visualizar() {
		System.out.println(acum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestaBytes obj1=new RestaBytes();
		obj1.setDatos();
		obj1.restar();
		obj1.visualizar();
		
		

	}

}
