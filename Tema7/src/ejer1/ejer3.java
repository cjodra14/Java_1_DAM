package ejer1;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.ImageIcon;
import javax.swing.JFrame; //La clase JFrame encapsula el concepto de una ventana
import javax.swing.JLabel; //La clase JLabel  tiene por objetivo mostrar un texto dentro de un JFrame.
import java.util.Scanner;

public class ejer3 extends JFrame{ /*Para que la clase muestre  una ventana debe
                                                heredar de la clase JFrame:*/	
    private JLabel label1;  //Definimos  un objeto de la clase JLabel:
    private JLabel label2;
    private JLabel label3;
    
    
    public ejer3() {
    	int x=50;
    	int y=30;
    	Scanner src=new Scanner(System.in);
    	char salir='s';
    	
    	JLabel [] nombres = new JLabel[3];
    	String[] empresas = {"El corte Ingles", "Deloitte", "Ceinmark"};
    	
        setLayout(null); /*método heredado de la clase JFrame con el parámetro null,
                           significa que utilizaremos posicionamiento absoluto    
                           para los controles visuales dentros del JFrame.*/
        for (int i = 0; i < nombres.length; i++) {
			nombres[i]= new JLabel(empresas[i]);
			nombres[i].setBounds(10,50+x,100,30);
			nombres[i].add(nombres[i]);
			x=x+x;
			y=y+y;
		}
        /*
        label1=new JLabel("Hola Mundo."); //crear el objeto de la clase JLabel con el texto a mostrar                                          
        label1.setBounds(10,20,100,40); //Ubicamos y damos tamaño(píxeles) al texto: columna, fila, ancho, alto
        add(label1); //metodo heredado de  JFrame que  añade el control JLabel al control JFrame.
        
        
        label2=new JLabel("Deloitte");
        label2.setBounds(10,90,150,60);
        add(label2);
        
        label3=new JLabel("Ceinmark");
        label3.setBounds(10,150,200,90);
        add(label3);*/
        
        
//JFrame contiene una barra de menu y un Content Pane (panel) accesible a través del método getContentPane()
//Para añadir nuestra etiqueta a JFrame habría que escribir: getContentPane().add(label1), es suficiente con //add(label1)
//getContentPane().setBackground(Color.blue);
    }    
    
    public void listado() {
    	
    	
		//ArrayList<JLabel> nombres = new ArrayList<JLabel>();
    	
    	/*
		ArrayList<Empresas> empresas = new ArrayList<Empresas>();
		
		do {
		Empresas empresa=new Empresas();
		System.out.println("Escribe el nombre de la empresa:");
		empresa.nombre=src.nextLine();
		System.out.println("Si quieres salir, pulsa la s, si no cualquier otra tecla");
		salir=src.next().charAt(0);
		empresas.add(empresa);
		}while(salir!='s');*/
				
		
		
		
		/*
		Iterator<JLabel> it= nombres.iterator();
		while(it.hasNext() ){
			System.out.println(it.next());
		}*/
		
		
	}
    public static void main(String[] ar) {
        ejer3 grafica1=new ejer3();
        
        grafica1.setBounds(10,10,500,500); //Ubicamos y damos tamaño a la ventana: columna, fila, ancho, alto
        grafica1.setVisible(true); // Se hace visible el Jframe
        grafica1.setResizable(true);/* el operador no puede modificar el tamaño de la ventana*/
       // grafica1.listado();
         grafica1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //para que cuando cerremos la ventana no siga ejecutandose el          
                                                                    //programa    
    }
}