
public class Ejer7 {
	float c, n1, n2;
	
	Ejer7(float numero1, float numero2){
		n1=numero1;
		n2=numero2;
				
	}
	void resta() {
		c=n1-n2;
	}
	void visu() {
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejer7 obj=new Ejer7(5.7F , 3.2F);
		obj.resta();
		obj.visu();
	}

}
