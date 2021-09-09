
public class Ejercicios {
	//Ejercicios 1 y 2
		//Programa que visualiza datos del centro de Estudios: Ceinmark.	
		public static void main(String[] args) {
			System.out.println("Ciclo: Desarrollo de Aplicaciones Web");
			System.out.println("Modulo: Programacion");
			System.out.println("Centro: Ceinmark");
			System.out.println("Calle: Iturribide 22-24-26");
			System.out.println("Telef: 944157298");
			System.out.println( "Web: www.ceinmark.com");
			System.out.println();
			
			
		//También se puede escribir de la siguiente manera
		//System.out.println("Ciclo: Desarrollo de Aplicaciones Web /n Modulo: Programacion /n Centro: Ceinmark /n Calle: Iturribide 22-24-26 /n Telef: 944157298 /n Web: www.ceinmark.com");
			
		
	//Ejercicios 3
			byte n1=1;
			short n2=1000;
			int n3=25000;
			long n4=-3000000L;
			float n5=3.14f;
			double n6=-2.5468412d;
			boolean n7=true;
			char n=',';
			
	//Visualizacion de las variables separadas por comas, utilizando un char como coma.
			
		System.out.println("Valores de las variables "+n1+n+n2+n+n3+n+n4+n+n5+n+n6+n+n7);
		System.out.println();
		
	//Visualizacion de los datos en una columna
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		System.out.println(n5);
		System.out.println(n6);
		System.out.println(n7);
		System.out.println(n);
		System.out.println();
			
	//Declarar variable con numeros negativos e introducir valores superiores para prueba
		//byte n11=130; // Nos recomienda hacer casting que es lo siguiente --> byte n11=(byte) 130;o cambiar a int
		short n12=-32768;
		//int n13=-2147483650; //Indica que esta fuera de rango
		long n14=-4946512885646L;
		
		
		System.out.print(n12);
		System.out.println(n14);
		System.out.println();
		
		
		
	//Declarar varias variables en una sola linea
		int n20, n21, n22, n23;
		
		
		/*
		 * 
		 * Nos da error al visualizarlo porque no estan inicializadas
		System.out.println(n20+" "+n21+" "+n22+" "+n23);
		System.out.println();
		*/
		
	// Visualizar constantes
		final byte CONST1=2;
		final int CONST2=2000;
		final double CONST3=7.589d;
		
		
		
		System.out.println("Visualizar las constantes: "+CONST1+" , "+CONST2+ " , "+CONST3);
		System.out.println("");
		
		
		
	//Declarar e inicializar 

		int var1=12, var2=15;
		long var3=76649L, var4=-5624L;
		float var5=8.493f, var6=23f;
		char var7='a', var8='d';
		
		
		System.out.println("El valor de la primera variable es: "+var1);
		System.out.println("El valor de la segunda variable es: "+var2);
		System.out.println("El valor de la tercera variable es: "+var3+" y el valor de la cuarta es: "+var4);
		System.out.println("El valor de la cuarta variable es: "+var4+", el valor de la quinta es: "+var5);	
		System.out.println("El valor de la sexta variable es: "+var6+" y el valor de la septima es: "+var7);
		System.out.println();
		
		
		
	//Ejercicio 10
		int x=6, y=4;
		int resultado1, resultado2, resultado3;
		float resultado4;

		resultado1=x-y;
		resultado2=x*y;
		resultado3=x/y;

		System.out.println("x-y="+resultado1);
		System.out.println("x*y="+resultado2);
		System.out.println("x/y="+resultado3);
		
		resultado1=x%y;
		System.out.println("x%y="+resultado1);
		
		float a=12.5f, b=7f;
		resultado4=a/b;
		System.out.println("a/b="+resultado4);
		System.out.println();
		
		
		
		
	//Ejercicio 11
		double pesoKG=2d;
		final double OZ_AU=400d;
		final double OZ=32.5d, KG=1d;
		final double EUR=0.86d, USD=1d;
		
		double pesoOZ, precioOZ, precioOZ_EUR, precioTotal;
		
		pesoOZ=pesoKG*OZ;
		
		precioOZ_EUR=OZ_AU*EUR;
		precioTotal=precioOZ_EUR*pesoOZ;
		
		System.out.println("Precio del oro en EUR:"+precioTotal+"â‚¬");
		System.out.println("Precio onza en EUR"+precioOZ_EUR);
		System.out.println(precioTotal);
		System.out.println();
		
	//Ejercicio 12
		float vaso1=0.12f, vaso2=0.18f, vaso3=0.17f, totalLitros;
		totalLitros=vaso1+vaso2+vaso3;
		System.out.println("En total hay:"+totalLitros+"litros");
		System.out.println();
		
	//Ejercicio 13
		int pant=30, cami=11, totalPantCami;
		totalPantCami=(pant*2)+(cami);
		System.out.println("El total a pagar es:"+totalPantCami);
		System.out.println();
		
		
	//Ejercicio 14
		final int LADO=5;
		int area1, perimetro1;
		perimetro1=LADO*4;
		area1=LADO*LADO;
		
		System.out.println("El perimetro es:"+perimetro1+ " cm y el area es: "+area1+" cm^2");
		System.out.println();
		

	//Ejercicio 15
		final int BASE=10, ALT=6;
		int area2, perimetro2;
		perimetro2=2*BASE+2*ALT;
		area2=BASE*ALT;
		
		System.out.println("El perimetro es:"+perimetro2+ " cm y el area es: "+area2+" cm^2");
		System.out.println();
		
	//Ejercicio 16
		int ejer16_1=25, ejer16_2=5;
		final int EJER16_3=2;
		int ejer16Res1, ejer16Res2, ejer16Res3;
		
		ejer16Res1=ejer16_1%ejer16_2;
		//ejer16Res2=ejer16_1%"ah/jla"; da error de sintaxis
		ejer16Res3=ejer16_1%EJER16_3;
		System.out.println(ejer16Res1+"     "+ejer16Res3);
		System.out.println();
		
		
	//Ejercicio 17
		int op=15, opRes;
		op=++op;
		System.out.println(op);
		op=++op;
		System.out.println(op);
		op=++op;
		System.out.println(op);
		System.out.println();
		
	//Ejercicio 18
		opRes=--op;
		System.out.println(opRes);
		opRes=--opRes;
		System.out.println(opRes);
		opRes=--opRes;
		System.out.println(opRes);
		System.out.println();
		
		//Ejercicio 19
		
		System.out.println("resultados del ejercicio 19");
		System.out.println();
		int c=7, j=12;
		c+=j;
		System.out.println(c);
		c-=j;
		System.out.println(c);
		c*=j;
		System.out.println(c);
		c/=j;
		System.out.println(c);
		c%=j;
		System.out.println(c);
		System.out.println();
		
	//Ejercicio 20
		int valor1=15, valor2=7, valor3;
		System.out.println("El primer valor antes de cambiar es: "+valor1+" y el segundo es: "+valor2);
		valor3=valor1;
		valor1=valor2;
		valor2=valor3;
		System.out.println("El primer valor despues de cambiar es: "+valor1+" y el segundo es: "+valor2);
		System.out.println();
		
		
	//ejercicio21-22
		double prom1=7d, prom2=5d, prom3=9d, exFin=8d, trFin=10d, notaFin;
		//Funcion que calcula la nota  final, si se cmabian los valores de las variables anteriores, cambia la nota
		notaFin=((prom1+prom2+prom3)/3)*0.55+exFin*0.3+trFin*0.15;
		System.out.println("La nota final es: "+notaFin);
		System.out.println();
		
	//Ejercicio 23
		int seg=15, min, hora;
		hora=seg/3600;
		min=(seg-hora*3600)/60;
		seg=seg-(hora*3600+min*60);
		
		System.out.println(hora+":"+min+":"+seg);
		
		
		
	//Pruebas del printf
		
		final double PRECIO1=2.6d;
		
		System.out.print("El precio total a pagar es: ");
		System.out.printf("%4.2f",PRECIO1);
		
		
		
		
		
		
		
		
		}
}
