public class Ejer8 {
	float c, n1, n2;
	
	Ejer8(float n1, float n2){
		this.n1=n1;
		this.n2=n2;
				
	}
	void resta() {
		c=n1-n2;
	}
	void visu() {
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejer8 obj=new Ejer8(5.7F , 3.2F);
		obj.resta();
		obj.visu();
	}

}
