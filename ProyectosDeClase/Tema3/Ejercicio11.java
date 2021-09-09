
public class Ejercicio11 {
	short n1=15, n2=7, n3;
	
	short restar() {
		n3=(short) (n1-n2);
		return n3;
		
	}
	void visu(short n) {
		System.out.println(n);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short n;
		Ejercicio11 obj=new Ejercicio11();
		n=obj.restar();
		obj.visu(n);
	
	}

}