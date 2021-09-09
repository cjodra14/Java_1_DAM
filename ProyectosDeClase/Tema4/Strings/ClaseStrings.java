package Strings;

import java.util.Scanner;
public class ClaseStrings {
	Scanner teclado=new Scanner(System.in);
    String cad1;
    String cad2;

void teclear2String(){
	System.out.println("Teclea un nombre");
		cad1=teclado.nextLine();
	System.out.println("Teclea otro nombre");
	cad2=teclado.nextLine();
}
String setCad1(){		
	return cad1;
	
}
String setCad2() {
	return cad2;
}
void metodoEquals(){
String cadena1="Monja";
String cadena2="Jamon";
		
	if(cadena1.equals(cadena2)){
		System.out.println(cadena1+ "   es exactamente igual a    "+ cadena2);
	}
	else{
		System.out.println(cadena1+ "  no es exactamente igual a  "+ cadena2);
	}

	
}
void metodoEqualsIgnore(String cadena2){
		if(cad1.equalsIgnoreCase(cadena2)) {
			System.out.println(cad1+ "   es exactamente igual a    "+ cadena2);
		}
		else{
			System.out.println(cad1+ "  no es exactamente igual a  "+ cadena2);
		}
		 
}
void metodoCompareTo(String cadena2){
	int v;
	v=cad1.compareTo(cadena2);
	
	System.out.println("metodo compare: "+v);
		
}        
		
		
void metodoCharAt(){
		System.out.println(cad1.charAt(0)+""+cad1.charAt(1));
}
void metodoLength(){
	int largo;
	largo=cad1.length();
	System.out.println(largo);
	
}
void metodoSubstring(){
	System.out.println(cad1.substring(3));
	
}

void metodoIndexOf(){
	String index="Este es el indice de ejemplo";
	System.out.println("Indice del caracter 'l'"+index.indexOf('l'));
}
void metodoUpperCase(){
	System.out.println("Convierte el primero nombre a todo mayuscula: "+cad1.toUpperCase());
}
	

void metodoLowerCase(){
	System.out.println("Convierte el segundo nombre a todo minuscula: "+cad2.toLowerCase());
}



	public static void main(String[] args) {
		String cad1;
		String cad2;
		
		ClaseStrings s=new ClaseStrings();
		s.teclear2String();
		cad1=s.setCad1();
		cad2=s.setCad2();
		s.metodoEquals();
		s.metodoEqualsIgnore(cad2);
		s.metodoCompareTo(cad2);
		
		s.metodoCharAt();
		s.metodoLength();
		s.metodoSubstring();
		s.metodoIndexOf();
		s.metodoUpperCase();
		s.metodoLowerCase();	
		}
		

	}
