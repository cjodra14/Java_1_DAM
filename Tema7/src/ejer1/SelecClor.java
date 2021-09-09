package ejer1;

import java.awt.Color;
import java.awt.event.*;

import javax.swing.*;

public class SelecClor extends JFrame implements ActionListener {
	JLabel labelR;
	JLabel labelG;
	JLabel labelB;
	JComboBox comboR;
	JComboBox comboG;
	JComboBox comboB;
	JButton btnColor;
	
	String [] num=new String[256];	

	SelecClor(){
		setLayout(null);
		for(int i=0;i<num.length;i++) {
			num[i]=String.valueOf(i);
		}		
	}
	
	void posicionar() {
		
		
		labelR=new JLabel("Rojo");
		labelR.setBounds(10,10,75,30);
		add(labelR);
		
		labelG=new JLabel("Verde");
		labelG.setBounds(10,50,75,30);
		add(labelG);
		
		labelB=new JLabel("Azul");
		labelB.setBounds(10,80,75,30);
		add(labelB);
		
		
		comboR=new JComboBox();
		comboR.setBounds(80,10,75,20);
		add(comboR);
		
		comboG=new JComboBox();
		comboG.setBounds(80,50,75,20);
		add(comboG);
		
		comboB=new JComboBox();
		comboB.setBounds(80,90,75,20);
		add(comboB);
		
		btnColor=new JButton("Fijar Color");
		btnColor.setBounds(20,130,150,25);
		add(btnColor);
		btnColor.addActionListener(this);
		
		llenarCombos();
		
	}
	void llenarCombos() {
		int cont=0;
		while (cont<256) {
			comboR.addItem(cont);
			comboG.addItem(cont);
			comboB.addItem(cont);
			cont++;
		}
	}
	Color recogerColores() {
		int r,g,b;
		r=(int)comboR.getSelectedItem();
		g=(int)comboG.getSelectedItem();
		b=(int)comboB.getSelectedItem();
		System.out.println(r+" "+g+" "+b);
		Color col1=new Color(r,g,b);
		return col1;
	}
	
	public void actionPerformed(ActionEvent arg0) {			
		Color col1;
		if(arg0.getSource()==btnColor) {
		col1=recogerColores();
		btnColor.setBackground(col1);
		}
		
		
	}


	public static void main(String[] args) {
		SelecClor ventana = new SelecClor();
		ventana.setBounds(10,10,300,200);
		ventana.posicionar();
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
		

	}

	
	

}
