
public class ConceptosTema1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//Conceptos basicos del tema 1
		System.out.print("Conceptos basicos del tema 1 \n");
		System.out.println();
		
		//Declarar e inicializar variables
		byte n1=3, rdoSuma;
		short n2=17;
		int n3=40, rdo, resultado, n=4;
		long n4=50L;
		float n5=1.7F, f=2.5F;
		double n6=11.6D;
		char n7='.';
		boolean n8=false;
		
		
		
		
//------------------------------------------------------------------------------------------------------------------	
	
		System.out.println("Operaciones aritmeticas:");
		rdo=n1+n2;
		System.out.println(rdo);
		//o 
		System.out.println("El resultado de sumar n1+n2 es: "+rdo);
		//o
		System.out.println("El resultado es "+(n1+n2));
		rdoSuma=(byte) (n1+n2);
		
		
		//En este lo priemro que se hace es el cast
		resultado=(int)f*n;
		System.out.println(resultado);
		
		
		//En este lo primero que hace es la multiplicacion
		resultado=(int)(f*n);
		System.out.println(resultado);
		
	}
}
