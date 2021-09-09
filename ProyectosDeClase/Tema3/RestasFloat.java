import java.util.Scanner;
public class RestasFloat {
	Scanner src=new Scanner(System.in);
	float c;
	
	void restar(float aa, float bb) {
		c=aa-bb;
	}
	void visu() {
		System.out.println(c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestasFloat obj=new RestasFloat();
		obj.restar(7.5F,3.14F);
		obj.visu();
		

	}

}
