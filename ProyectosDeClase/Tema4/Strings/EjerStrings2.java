package Strings;
import java.util.Scanner;

import com.sun.tools.javac.util.StringUtils;
public class EjerStrings2 {
	Scanner src=new Scanner(System.in);
	String cadena1;
	
	EjerStrings2(){
		System.out.println("Teclea un texto para el String:");
		cadena1=src.nextLine();
		
	}
	
	void primMitad() {
		int n;
		n=(cadena1.length())/2;
		System.out.println(cadena1.substring(0,n));
	}
	void ultimoCaracter() {
		int n;
		n=cadena1.length();
		System.out.println("El ultimo caracter de "+cadena1+" es: "+cadena1.substring(n-1));
	}
	
	void cadenaInversa() {
		int n;
		n=cadena1.length();
		while(n-1>-1) {
			System.out.print(cadena1.charAt(n-1));
			n--;
		}
		System.out.println();
	}
	
	void guiones() {
		
		for(int cont=0;cont<cadena1.length();cont++) {
			System.out.print(cadena1.charAt(cont));
			if(cont<cadena1.length()-1){System.out.print("-");}
		}
		
		System.out.println();
		
	}
	
	void contarVocales() {
		int cont=0;
		char aux;
		for(int contador=0;contador<cadena1.length();contador++) {
			aux=cadena1.charAt(contador);
			switch(aux) {
			case 'a':
				cont++;
			break;
			case 'e':
				cont++;
			break;
			case 'i':
				cont++;
			break;
			case 'o':
				cont++;
			break;
			case 'u':
				cont++;
			break;
			}
			
		}
		System.out.println("En total hay "+cont+" vocales y "+(cadena1.length()-cont)+" consonantes");
	}
	
	void capicua() {
		 String x = cadena1;
		    int s = x.length();
		    int z = s / 2;
		    char k;
		    char m;
		    int p=0;
		    boolean comprueba=true;
		    

		        for (int j = (s - 1); j>z && p<z ; j--) {

		            k = x.charAt(p);
		            m = x.charAt(j);

		      System.out.println(k+" "+m );   

		            if (k==m) {
		                System.out.println("Bien.");
		                
		            }else {
		            	comprueba=false;
		            }
		          p++;

		        }
		        if(comprueba==false) {
		        	System.out.println("No es capicua");
		        }
		        }
	
	public static void main(String[] args) {
		EjerStrings2 ob1=new EjerStrings2();
		ob1.primMitad();
		ob1.ultimoCaracter();
		ob1.cadenaInversa();
		ob1.guiones();
		ob1.contarVocales();
		ob1.capicua();
		
		
	}
	
	
	

}
