package pruebaarrays;
import java.util.Random;
import java.util.Scanner;

public class Ejer6Arrays {
	
    // crear un array de numeros aleatorios mas pequeños que el 100 y luego en
    // otro array mostrar los numeros mas pequeños que el 20 que no se hayan
    // generado en el array

	  Random rand = new Random();
	  Scanner src = new Scanner(System.in);
	  int longitud;
	 
	  int[] array;
	  Ejer6Arrays(){
		  System.out.println("Teclea la longitud deseada para el array");
			longitud=src.nextInt();
			
	  }
	  
	 
	  int numMax() {
		  int max;
		  System.out.println("Teclea el numero maximo:");
		  max=src.nextInt();
		  return max;
	  }
	  int numMin() {
		  int min;
		  System.out.println("Teclea el numero minimo:");
		  min=src.nextInt();
		  return min;
	  }
	  
	  
	  
	  void rellenar(int max) {
		  array=new int[longitud];
		  for(int i=0;i<array.length;i++) {
			  array[i]=max+i+1;
		  }
	  }
	  int numAleatorio(int minimo, int maximo) {
	    	int num=(int)(Math.random()*(minimo-maximo+1)+(maximo));
	    	return num;
	    } 
	  
	  boolean comprobacion(int max, int min) {
		  boolean comprobado;
		  if(max<min) {
			  int aux=max;
			  max=min;
			  min =aux;
		  }
		  if((max-min)>=(longitud-1)) {
			  comprobado=true;
			  
		  }else {
			  System.out.println("No se puede generar, la longitud es mayor a los numeros disponibles");
			  comprobado=false;
		  }
		  return comprobado;
		  
	  }
	  
	  void generar(boolean comprobado,int max, int min) {
		  if(comprobado==true) {
			  int numero_elementos=0;
			  boolean encontrado;
			  int aleatorio;
			  int alberto=0;
			  
			  
			  while(numero_elementos<longitud) {
				  
				  
				  aleatorio=numAleatorio(max,min);
				  encontrado=false;
				  
				  for(int i=0;i<array.length && !encontrado;i++) {
					  if(aleatorio==array[i]) { // cuando es 0 nos pone que ya existe el numero, ya que el valor null es 0
						  
						  encontrado=true;
					  }
//					  if( encontrado && aleatorio==0 && alberto<1) {
//						  encontrado=false;
//						  alberto++;
//					  }
				  }
				  if(encontrado) {
					  System.out.println("El numero "+aleatorio+" ya existe ");
				  }else {
					  array[numero_elementos]=aleatorio;
					  numero_elementos++;
					  System.out.println("Agregado numero: "+aleatorio);
				  }
			  }
			  
		  }
	  }
	  void visu(boolean comprobado) {
		  if(comprobado) {
		  System.out.println();
		  System.out.println("El array completo es:");
		  for(int i=0;i<array.length;i++) {
			  System.out.println(array[i]);
		  }}
		  
	  }
	  

	    public static void main(String[] args) {
	    	int max, min;
	    	boolean comprobado;
	    	Ejer6Arrays ob=new Ejer6Arrays();
	    	max=ob.numMax();
	    	min=ob.numMin();
	    	ob.rellenar(max);
	    	comprobado=ob.comprobacion(max, min);
	    	ob.generar(comprobado, max, min);
	    	ob.visu(comprobado);
	
	    }

	  
 
    

}
