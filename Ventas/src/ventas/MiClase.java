package ventas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.event.*;

public class MiClase extends JFrame implements ChangeListener {
	
	
	private JRadioButton r1,r2,r3;
	private ButtonGroup bg;
	
	MiClase(){
		setLayout(null);
	}
	
	void posicionar() {
		bg=new ButtonGroup();
		
		r1=new JRadioButton("Color Rojo");
		r1.setBounds(10,20,200,32);
		r1.addChangeListener(this);
		add(r1);
		bg.add(r1);
		
		r2=new JRadioButton("Color Azul");
		r2.setBounds(10,80,200,32);
		r2.addChangeListener(this);
		add(r2);
		bg.add(r2);
		
		r3=new JRadioButton("Color Verde");
		r3.setBounds(10,140,200,32);
		r3.addChangeListener(this);
		add(r3);
		bg.add(r3);

	}
	
	void metodo(){
		setLayout(new GridLayout(4, 3));	//4 filas 3 columnas
		for(int i = 1; i <= 9; i++) {
		add(new JButton(""+i));
		}
		add(new JButton("" + 0));
		add(new JButton("Start"));
		add(new JButton("Stop"));
		
	}
	void metodo2() {
		setLayout(new BorderLayout());
        add(new JButton("botón 1"), BorderLayout.EAST);
       // add(new JButton("botón 1"), "East");
	add(new JButton("botón 2"), BorderLayout.SOUTH);
	add(new JButton( "botón 3"), BorderLayout.WEST);
	add(new JButton(" botón 4 "), BorderLayout.NORTH);
	add(new JButton(" botón 5"), BorderLayout.CENTER);

	}
	 void unPanel(){
		 JPanel p1 = new JPanel();
		 setLayout(new BorderLayout());
		 p1.setLayout(new GridLayout(4, 3));
		 // Add buttons to the panel
		 for(int i = 1; i <= 9; i++) {
		 p1.add(new JButton("" + i));
		 }
		 p1.add(new JButton("" + 0));
		 p1.add(new JButton("Start"));
		 p1.add(new JButton("Stop"));
		 add(p1,BorderLayout.EAST);
		 }


	
	public static void main(String[] args) {
		MiClase ventana = new MiClase();
		ventana.setBounds(10,10,300,300);
		ventana.setResizable(true);
		//ventana.posicionar();
		//ventana.metodo2();
		ventana.unPanel();
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	@Override
	public void stateChanged(ChangeEvent arg0) {
		if(r1.isSelected()){
			getContentPane().setBackground(Color.RED);
			r1.setBackground(Color.RED);
			r2.setBackground(null);
			r3.setBackground(null);
		}
		if(r2.isSelected()){
			getContentPane().setBackground(Color.BLUE);
			r2.setBackground(Color.BLUE);
			r1.setBackground(null);
			r3.setBackground(null);
		}
		if(r3.isSelected()){
			getContentPane().setBackground(Color.GREEN);
			r3.setBackground(Color.GREEN);
			r1.setBackground(null);
			r2.setBackground(null);
		}
		
	}

}
