
public class Ejercicio12 {	float c, n1, n2;

Ejercicio12(float numero1, float numero2){
	n1=numero1;
	n2=numero2;
			
}
void resta() {
	c=n1-n2;
	visu();
}
void visu() {
	System.out.println(c);
}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	Ejercicio12 obj=new Ejercicio12(5.7F , 3.2F);
	obj.resta();

}

}