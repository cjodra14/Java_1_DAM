package ejer1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Sumas extends JFrame implements ActionListener {
	JLabel labUno= new JLabel();
	JLabel labDos = new JLabel();
	JLabel resultado= new JLabel();
	JTextField tfUno = new JTextField();
	JTextField tfDos = new JTextField();
	JTextField tfRes = new JTextField();
	JButton btnSum = new JButton();
	JButton btnErase = new JButton();
	
	Sumas(){
		setLayout(null);
		setTitle("Sumar 2 números");
	}
	
	public void creacion() {
		
		labUno = new JLabel("Primer Numero:");
		labUno.setBounds(10,20,100,40);
		add(labUno);
		
		labDos = new JLabel("Segundo Numero:");
		labDos.setBounds(10,60,150,40);
		add(labDos);
		
		resultado = new JLabel("Resultado:");
		resultado.setBounds(300,40,150,40);
		add(resultado);
		
		
		tfUno = new JTextField();
		tfUno.setBounds(150,30,100,20);
		add(tfUno);
		tfDos = new JTextField();
		tfDos.setBounds(150,70,100,20);
		add(tfDos);
		tfRes = new JTextField();
		tfRes.setBounds(400,50,100,20);
		add(tfRes);
		
		btnSum= new JButton("Sumar");
		btnSum.setBounds(200,150,100,30);
		add(btnSum);
		
		btnErase= new JButton("Borrar");
		btnErase.setBounds(350,150,100,30);
		add(btnErase);
		
		
		btnErase.addActionListener(this);
		btnSum.addActionListener(this);		
	}

	
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource()==btnSum) {
			try {		
				tfRes.setText(String.valueOf((Integer.parseInt(tfUno.getText()))+(Integer.parseInt(tfDos.getText()))));
				setTitle(null);}
				catch (NumberFormatException e) {			
					setTitle("Teclea un Numero");
				}	
		}
		if(arg0.getSource()==btnErase) {
			tfRes.setText(null);
			tfUno.setText(null);
			tfDos.setText(null);
		}
			
	}
	
	public static void main(String []args) {
		Sumas ventana1=new Sumas();
		ventana1.setBounds(20,20,600,300);
        ventana1.setResizable(false);
        ventana1.creacion();
        ventana1.setVisible(true);
        ventana1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	}

}
