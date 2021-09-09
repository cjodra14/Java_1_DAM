
public class Ejercicio14 {
	float multiplicar(float n1, float n2, float n3) {
		n3=n1*n2;
		
		return n3;	
	}
	float dividir(float d1, float d2, float d3) {
		
		d3=d1/d2;
		return d3;
	}
	 void visu(float n, float d) {
		System.out.println("El resultado de la multiplicacion es "+n);
		System.out.println("El resultado de la division es "+d);
	}

	public static void main(String[] args) {
		float n, d;
		Ejercicio14 obj=new Ejercicio14();
		n=obj.multiplicar(3F,5F,0F);
		d=obj.dividir(15F,3F,0F);
		obj.visu(n,d);

	}

}
