package ejercontrasenia;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import packprimero.Bola6;


public class PanelContrasenia extends JFrame implements ActionListener, KeyListener{
	JLabel lblUsuario=new JLabel();
	JLabel lblPass=new JLabel();
	JTextField tfUser=new JTextField();
	JPasswordField passField= new JPasswordField();
	JButton btnComprobar = new JButton();
	String [] usuarios = {"algo","pass", "prueba", "otro"};
	String [] constrasenias = {"algo","pass", "prueba", "otro"};
	
	
	
	void dibujar() {
		
		lblUsuario=new JLabel("Usuario");
		lblUsuario.setBounds(10,20,100,40);
		
		lblPass=new JLabel("Contraseña");
		lblPass.setBounds(10,60,150,40);
		
		tfUser=new JTextField();
		tfUser.setBounds(150,30,100,20);
		
		passField= new JPasswordField();
		passField.setBounds(150,70,100,20);
		
		btnComprobar= new JButton("Confirmar");
		btnComprobar.setBounds(200,150,100,30);
		
		
		add(lblUsuario);
		add(lblPass);
		add(tfUser);
		add(passField);
		add(btnComprobar);
		
		tfUser.addActionListener(this);
		passField.addActionListener(this);
		btnComprobar.addActionListener(this);
		
		tfUser.addKeyListener(this);
		passField.addKeyListener(this);
		btnComprobar.addKeyListener(this);
		
	}
	
	void comprobarPass() {
		String passComprobar="";
		char[] auxiliar=passField.getPassword();
		boolean passCorrecta=false;
		for (int i = 0; i < auxiliar.length; i++) {
			passComprobar=passComprobar+auxiliar[i];
		}
		System.out.println(tfUser.getText());
		System.out.println(passComprobar);
		
		for (int i = 0; i < constrasenias.length && passCorrecta==false; i++) {
			if (tfUser.getText().equals(usuarios[i]) && passComprobar.equals(constrasenias[i])) {
				setTitle("Correcto");
				passCorrecta=true;
				}else {
				setTitle("Incorrecto");
			}
		}		
	}
	
	

	public static void main(String[] args) {
		PanelContrasenia obj = new PanelContrasenia();
		obj.setLayout(null);
		obj.setBounds(20,20,400,250);
		obj.dibujar();
		obj.setVisible(true);
        obj.setResizable(true);        
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getSource()==btnComprobar) {
			comprobarPass();
		}
		
	}


	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getSource()==tfUser && arg0.getKeyCode()==KeyEvent.VK_ENTER) {
			tfUser.transferFocus();
		}
		if (arg0.getSource()==passField && arg0.getKeyCode()==KeyEvent.VK_ENTER) {
			passField.transferFocus();
		}
		if((arg0.getSource()==btnComprobar && arg0.getKeyCode()==KeyEvent.VK_ENTER)) {
			comprobarPass();
		}
	}


	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
