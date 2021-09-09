package ejer1;

import java.awt.event.ActionEvent;//
import java.awt.event.ActionListener;//Para programar un boton
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;//importa la manera de meter ventanas
public class miClaseGrafica extends JFrame implements ActionListener, MouseListener{//extends JFrame cuando la salida sea a ventanas
	
	
	public miClaseGrafica() {
		setLayout(null);//Donde se coloca los botones(Posicion)
		
	}
	
	void colocarBoton1() {
		boton1.setBounds(100,20,140,90); //Ubicamos y damos tamaño(píxeles) al texto: columna, fila, ancho, alto
	  
	     add(boton1);
	     boton1.addActionListener(this);//Al hacer clic en el boton el programa VA al metodo  ActionPerformed(ActionEvent)
	}
	
	JButton boton1=new JButton("Juego");
	JButton boton2=new JButton("Pulsar");
	void colocarBoton2() {
		boton2.setBounds ((int)(Math.random()*700),(int)(Math.random()*500),100,150);
	     add(boton2);
	     boton2.addMouseListener(this);
	     
	     
	     boton2.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent  e) {// Son clases abstractas, RECIBE UN OBJETO DE ACTIONER, Trabaja en las subclases, despues del implement lo que viene siempre es un interface,
		if(e.getSource()==boton1) {
		borrar();
		colocarBoton2();
		}
		else {
			boton2.setBounds((int)(Math.random()*700),(int)(Math.random()*500),100,150);
			
		}
		
	}

	void borrar() {
		getContentPane().removeAll();
		getContentPane().repaint();
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		boton2.setBounds((int)(Math.random()*700),(int)(Math.random()*500),100,150);
		
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	


}