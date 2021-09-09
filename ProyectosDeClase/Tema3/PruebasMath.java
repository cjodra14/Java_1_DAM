
public class PruebasMath {
	int rdo;
	double intento;
	void metodo() {
		System.out.println("El valor absoluto de -8 es: "+Math.abs(-8));
		/*
		 * rdo=Math.abs(-8);
			System.out.println("El valor absoluto de -8 es: "); 
		*/
		System.out.println("La raiz cuadrada de 9 es: "+Math.sqrt(9));
		System.out.println("El valor de la constante Pi es: "+Math.PI);
		System.out.println("El valor de 7 elevado a 3 es:"+Math.pow(7,3));
		System.out.println((int)(Math.random()*6));
	}
	
	
	

	public static void main(String[] args) {
		PruebasMath obj=new PruebasMath();
		obj.metodo();
		
		
		

	}

}
