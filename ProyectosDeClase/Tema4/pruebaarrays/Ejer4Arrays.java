package pruebaarrays;
import 	java.lang.Math;

public class Ejer4Arrays {
	final int NUMARRAY=500;
	double[]i=new double[NUMARRAY];
	
	Ejer4Arrays() {
		
	}
	
	//metodo que coloca numeros aleatoriamente del 0 al 100  
	void rellenar() {
		for(int n=0;n<i.length;n++) {
			i[n]=((Math.random())*101);
		}
	}
	void visu() {
		for(int n=0;n<i.length;n++) {
			System.out.println((int)(i[n]));
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejer4Arrays ob=new Ejer4Arrays();
		ob.rellenar();
		ob.visu();

	}

}
