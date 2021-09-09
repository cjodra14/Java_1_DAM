package notas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class InterfazGrafica extends JFrame implements ActionListener{
	private JLabel lblNombre;
	private JTextField tfNombre;
	private JLabel lblAsignaturasNotas;
	private JLabel [] lblNotas=new JLabel [4];
	private JTextField [] tfNotas=new JTextField [4];
	private JButton btnPulsar;
	private Intermedia comprobacion= new Intermedia();
	
	
	
	InterfazGrafica(){
		setLayout(null);
		dibujarNombre();
		dibujarAsigNotas();
		dibujarBoton();
	}
	public void dibujarNombre(){
		lblNombre = new JLabel("NOMBRE:");
		lblNombre.setBounds(15, 30, 60, 25);
		add(lblNombre);
		
		tfNombre = new JTextField();
		tfNombre.setBounds(150, 30, 200, 25);
		add(tfNombre);
		tfNombre.addActionListener(this);
		
		lblAsignaturasNotas = new JLabel("A S I G N A T U R A S   Y   N O T A S");
		lblAsignaturasNotas.setBounds(75, 75, 200, 25);
		add(lblAsignaturasNotas);
		
	}
	
	public void dibujarAsigNotas() {
		int y=150;
		lblNotas[0]=new JLabel("Programación");
		lblNotas[1]=new JLabel("Bases de Datos");
		lblNotas[2]=new JLabel("Entornos");
		lblNotas[3]=new JLabel("Form. y Or. Laboral");
	
		for(int i=0;i<lblNotas.length;i++) {
			tfNotas [i]=new JTextField();
			lblNotas[i].setBounds(15,y,150,30);
			tfNotas[i].setBounds(250,y,50,30);
			tfNotas[i].setHorizontalAlignment(JTextField.RIGHT);
			add(lblNotas[i]);
			add(tfNotas[i]);
			y=y+40;
			tfNotas[i].addActionListener(this);
		}
	}
	
	public void dibujarBoton() {
		btnPulsar=new JButton("PULSA");
		btnPulsar.setBounds(175,375,125,35);
		add(btnPulsar);
		btnPulsar.addActionListener(this);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfazGrafica ig = new InterfazGrafica();
		ig.setBounds(15,15,500,500);
		ig.setVisible(true);
		ig.setResizable(false);
		ig.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource()==tfNombre) {
			tfNombre.transferFocus();
		}
		for(int i=0;i<tfNotas.length;i++) {
		if(arg0.getSource()==tfNotas[i]) {
			tfNotas[i].transferFocus();
		}
			}
		if(arg0.getSource()==btnPulsar){
			String titulo;
			String [] notas= new String[4];
			for(int i=0;i<notas.length;i++) {
				notas[i]=tfNotas[i].getText();
			}
			titulo=comprobacion.compobarNotas(tfNombre.getText(), notas);
			setTitle(titulo);
		}
		
		
	}

}
