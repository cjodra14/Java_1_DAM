package ejer1;
 
import javax.swing.*;
//import java.awt.event.*;
 
public class EjerInterfazGrafica extends JFrame {
    public EjerInterfazGrafica() {
        setLayout(null);
        JLabel tit =new JLabel("Interfaz Grafica");
        JLabel n= new JLabel("Nombre");
        JLabel e= new JLabel("Entregado");
        JLabel prov= new JLabel("Provincia");
        
        JTextField nBox=new JTextField();
        JCheckBox eCheckBox=new JCheckBox();
        JComboBox pComboBox=new JComboBox();
        JButton boton =new JButton("Pulsar");
        
    }
    
    public void posicionar() {
        JLabel tit =new JLabel("Interfaz Grafica");
        tit.setBounds(200,10,150,10);
        add(tit);
        
        JLabel n= new JLabel("Nombre:");
        n.setBounds(10,50,150,10);
        add(n);
        
        JLabel e= new JLabel("Entregado:");
        e.setBounds(10,80,150,10);
        add(e);
        
        JLabel prov= new JLabel("Provincia:");
        prov.setBounds(10,110,150,10);
        add(prov);
        
        JTextField nBox=new JTextField();
        nBox.setBounds(80,45,350,20);
        add(nBox);
        
        JCheckBox eCheckBox=new JCheckBox();
        eCheckBox.setBounds(80,77,150,15);
        add(eCheckBox);
        
        JComboBox pComboBox=new JComboBox();
        pComboBox.setBounds(80,107,150,20);
        add(pComboBox);
        
        JButton boton =new JButton("Pulsar");
        boton.setBounds(170,150,150,40);
        add(boton);
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        EjerInterfazGrafica ejer3=new EjerInterfazGrafica();
        ejer3.setTitle("Ejercicio Interfaz Gráfica");
        ejer3.posicionar();
        ejer3.setBounds(10,10,500,250); //Ubicamos y damos tamaño a la ventana: columna, fila, ancho, alto
        ejer3.setVisible(true); // Se hace visible el Jframe
        ejer3.setResizable(true);/* el operador no puede modificar el tamaño de la ventana*/
       // grafica1.listado();
         
        
        ejer3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
 
    }
 
}