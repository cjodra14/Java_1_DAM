
public class Ejercicio10Metodos {
	short n1=15, n2=7, n3;
	
	short restar() {
		n3=(short) (n1-n2);
		return n3;
	}
	void visu() {
		System.out.println(n3);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejercicio10Metodos obj=new Ejercicio10Metodos();
		obj.restar();
		obj.visu();
	
	}

}
