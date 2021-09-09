package ejer1;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.ImageIcon;
import javax.swing.JFrame; //La clase JFrame encapsula el concepto de una ventana
import javax.swing.JLabel; //La clase JLabel  tiene por objetivo mostrar un texto dentro de un JFrame.
import java.util.Scanner;

public class ArrayEmpresas extends JFrame{

	public ArrayEmpresas() {
		int x=50;
    	Scanner src=new Scanner(System.in);
    	char salir='s';
    	
    	JLabel [] nombres = new JLabel[3];
    	String[] empresas = {"El corte Ingles", "Deloitte", "Ceinmark"};
    	
        setLayout(null); /*método heredado de la clase JFrame con el parámetro null,
                           significa que utilizaremos posicionamiento absoluto    
                           para los controles visuales dentros del JFrame.*/
        for (int i = 0; i < nombres.length; i++) {
			nombres[i]= new JLabel(empresas[i]);
			nombres[i].setBounds(10,x,100,30);
			add(nombres[i]);
			x=x+50;
			
		}
	}
	 public static void main(String[] ar) {
	        ArrayEmpresas grafica1=new ArrayEmpresas();
	        
	        grafica1.setBounds(10,10,250,250); //Ubicamos y damos tamaño a la ventana: columna, fila, ancho, alto
	        grafica1.setVisible(true); // Se hace visible el Jframe
	        grafica1.setResizable(true);/* el operador no puede modificar el tamaño de la ventana*/
	       
	         grafica1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //para que cuando cerremos la ventana no siga ejecutandose el          
	                                                                    //programa    
	    }
	
}
