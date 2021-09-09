package ejer1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class NormasServicio extends JFrame implements ChangeListener, ActionListener {
	JLabel texto;
	JButton btn;
	JCheckBox cbAcuerdo;
	
	NormasServicio(){
		setLayout(null);
	}
	void posicionar() {
		texto= new JLabel("¿Está de acuerdo con las normas  del servicio?");
		texto.setBounds(10,10,300,25);
		add(texto);
		
		cbAcuerdo=new JCheckBox("Acepto");
		cbAcuerdo. setBounds(10,50,100,30);
		cbAcuerdo.addChangeListener(this);
		add(cbAcuerdo);
		
		btn=new JButton("Continuar");
		btn.setBounds(10,100,100,30);
		btn.addActionListener(this);
		btn.setEnabled(false);
		add(btn);
		
		
	}

	public void stateChanged(ChangeEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource()==cbAcuerdo) {
		if (cbAcuerdo.isSelected()==true) {
			btn.setEnabled(true);
			
		}
		else {
			btn.setEnabled(false);
			
		}
		}
				
	}	
	
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource()==btn) {
            System.exit(0);
            
        }

		
	}
	public static void main  (String[] args) {
		NormasServicio ventana= new NormasServicio();
		ventana.setBounds(10,10,300,200);
		ventana.setResizable(false);
		ventana.posicionar();
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		// TODO Auto-generated method stub

	}
	
}
