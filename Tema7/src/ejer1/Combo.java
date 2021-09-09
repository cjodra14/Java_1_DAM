package ejer1;

import java.awt.event.*;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.*;

public class Combo  extends JFrame implements ActionListener{
	private JComboBox combo1;
	Combo(){
		setLayout(null);
	}
	
	void posicionar() {
		/*ArrayList<String> pueblos= new ArrayList<String>();
		pueblos.add("Bilbo");
		pueblos.add("Barakaldo");
		pueblos.add("Santurtzi");
		pueblos.add("Zamudio");
		Iterator<String> it=pueblos.iterator();
		while(it.hasNext()) {
			String pueblo=it.next();
			combo1.addItem(pueblo);
		}*/
		
		String [] cadena= {"Bilbo","Barakaldo", "Santurtzi","Zamudio"};
		combo1=new JComboBox(cadena);
		combo1.setBounds(10,10,150,30);
		add(combo1);
		
		
		
		/*combo1.addItem("Bilbo");
		combo1.addItem("Barakaldo");
		combo1.addItem("Santurtzi");
		combo1.addItem("Zamudio");*/
		combo1.addActionListener(this);
		
	}
	

	
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String comprobar;
		comprobar=(String)combo1.getSelectedItem();		
		setTitle(comprobar);
	
	}
	
	public static void main(String[] args) {
		Combo ventana=new Combo();
		ventana.setBounds(10,10,600,400);
		ventana.posicionar();
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
