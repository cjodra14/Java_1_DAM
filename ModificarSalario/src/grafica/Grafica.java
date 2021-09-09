package grafica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import conexion.Conexion;

public class Grafica extends JFrame implements ActionListener {
	JLabel lblDNI;
	JLabel lblSalario;
	JTextField tfDNI;
	JTextField tfSalario;
	JButton btnEnviar;
	Conexion conn = new Conexion("tema1","tema1");
	
	public Grafica(){
		setLayout(null);
		dibujar();
	}
	
	void dibujar() {
		setBounds(200,200,500,250);
		setTitle("MODIFICACION DE SALARIOS");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		dibujarObjetos();
		setVisible(true);
	}
	
	void dibujarObjetos() {
		lblDNI=new JLabel("Introduce el DNI:");
		lblSalario=new JLabel("Introduce salario:");
		tfDNI=new JTextField();
		tfSalario=new JTextField();
		btnEnviar=new JButton("Enviar");
		
		
		lblDNI.setBounds(5,10,125,25);
		lblSalario.setBounds(5,45,125,25);
		tfDNI.setBounds(150,10,125,25);
		tfSalario.setBounds(150,45,125,25);
		btnEnviar.setBounds(190,90,75,25);
		
		
		add(lblDNI);
		add(lblSalario);
		add(tfDNI);
		add(tfSalario);
		add(btnEnviar);
		
		tfDNI.addActionListener(this);
		tfSalario.addActionListener(this);
		btnEnviar.addActionListener(this);
		
	}
	
	
	public String getSentencia(String Dni, Float salario) {
		
		String sentencia="";
		
		sentencia="UPDATE empleados SET salario="+salario+" WHERE dni='"+Dni+"'";
		return sentencia;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getSource()==tfDNI) {
			tfDNI.transferFocus();
		}else if (arg0.getSource()==tfSalario) {
			tfSalario.transferFocus();
		}else if(arg0.getSource()==btnEnviar) {
			conn.cargarDriver();
			conn.conectar();
			conn.actualizarDatos(getSentencia(tfDNI.getText(),Float.parseFloat(tfSalario.getText())));
			conn.cerrarConexion();
		}
		
		
	}
	
	

}
