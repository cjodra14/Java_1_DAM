
public class TiposDeDatos {
	public static void main(String[] args) {
		
		
		//--------------------------------------------------------------------------------------------
				
				
				//Declarar las variables de los datos
				
				//Solo declarar una variable
				byte edades;
				
				//Declarar e incializar byte
				byte edad=4;
				final byte EDAD_PERSONAS=4; //<-- este es una constante
				//declara numero mediano 
				short numeroMediano=-25000;
				
				//declarar numero entero 
				int numeroEntero=250000;
				
				//declarar numero entero largo
				long numeroEnteroLargo=-3000000000L; //Obligatorio poner la "L" al final 
				
				//declarar un numero con coma flotante simple
				float numeroComaSimple=3.14f; //Obligatorio poner la f
				
				//declarar un numero con coma flotante de precisión doble
				double numeroComaDoble=2.154812354985618d; 
				
				//declaracion de un boolean 
				boolean pagar=true; 
				
				//declarar un char
				char variableChar='?';
				
				//declarar string 
				
				String pagado1="si";
				String pagado2="no";
				
				
				//declarar constante
				final float PI=3.14f;
				
				//Ejemplo de casting
				byte v5=5;
				float v1=3.6f, v2=5.5f;
				v5=(byte) (v1+v2); //necesario hacer cast, antes estaba escrito cast v5=v1+v2; pero esto pierde informacion
				
				float g5=5;
				float g1=3.6f, g2=5.5f;
				g5=(int)g1+(int)g2;		
				
		//-------------------------------------------------------------------------------------------------------		
				
				
				//tip para escribir menos usar las comas
				int n1=8, n2=9, n3=20;
				int resultado;
				
				
				
		//------------------------------------------------------------------------------------------------
				
				//Impresión de los datos a la consola del byte
				System.out.println("edad"); // <--Aqui era para probar entre utilizar comillas o no
				
				System.out.println("La edad es: " +  edad + " años");
				
				//Impresion de los datos del short
				System.out.println("Numero mediano: " + numeroMediano);
				
				//Impresion de dato int
				System.out.println("Numero entero: " + numeroEntero);
				
				//impresion de dato long
				System.out.println("Numero entero largo. " + numeroEnteroLargo);
				
				//impresion de dato float
				System.out.println("Numero coma flotante simple " + numeroComaSimple);
				
				//impresion de dato double
				System.out.println("Numero coma flotante doble " + numeroComaDoble);
					
				//Impresion del boolean
				System.out.println("Esta la cuenta pagada:"+ pagar);
				
				//Impresion del boolean + el char
				System.out.println("Esta la cuenta pagada"+variableChar+" "+ pagado1);
				
				//suma de dos int
				resultado=n1+n2;
				System.out.println("El resultado es: "+resultado);
				
				resultado=n1-n2;
				System.out.println("El resultado es: "+resultado);
				
				resultado=n1*n2;
				System.out.println("El resultado es: "+resultado);
				
				resultado=n1/n2;
				System.out.println("El resultado es: "+resultado);
				
				resultado=n1%n2;
				System.out.println("El resultado es: "+resultado);
				

				
				
		//-------------------------------------------------------------------------------------------------

				
				
				
				
				
		//-------------------------------------------------------------------------------------------------
				
				
				edad=20;
				System.out.println(edad);
				//pi=3.15f; no se puede cambiar una constante
				
				
				System.out.println(v5);
				System.out.println(g5);
				
				
				

				
				
				
				
				
				
				
				
				
				
				
				

			}


}
