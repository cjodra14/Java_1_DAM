
public class Ejer9 {
	int c;
	void resta(int a, int b) {
		c=a-b;
	}
	void visu() {
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=10, n2=2;
		
		Ejer9 obj=new Ejer9();
		obj.resta(n1,n2);
		obj.visu();
	}

}
