package maquina;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.text.DecimalFormat;
import java.util.Locale;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class Principal extends JFrame {
	String [] titulo= {"BEBIDAS","PRECIO","PAGO"};
	float cambio;
	

	private JPanel contentPane;
	private JLabel lblBebidas;
	private JLabel lblPrecio;
	private JLabel lblPago;
	private JTextField tfVueltas;
	private JTextField tfPrecio;
	private JRadioButton rdbtnAgua;
	private JRadioButton rdbtnChocolate;
	private JRadioButton rdbtnCafe;
	private ButtonGroup bg;
	private JComboBox comboCentimos;
	private JComboBox comboEuros;
	private JLabel lblVueltas;
	private JLabel lblEuros;
	private JLabel lblCentimos;
	private JButton btnExtraer;
	
	public Principal() {		
	}
	
	void colocar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 314);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblBebidas = new JLabel(titulo[0]);
		lblBebidas.setBounds(46, 11, 61, 22);
		contentPane.add(lblBebidas);
		
		lblPrecio = new JLabel(titulo[1]);
		lblPrecio.setBounds(185, 11, 53, 22);
		contentPane.add(lblPrecio);
		
		lblPago = new JLabel(titulo[2]);
		lblPago.setBounds(351, 11, 53, 22);
		contentPane.add(lblPago);
		
		tfPrecio = new JTextField();
		tfPrecio.setBounds(163, 36, 86, 136);
		contentPane.add(tfPrecio);
		tfPrecio.setColumns(10);
		
		tfVueltas = new JTextField();
		tfVueltas.setBounds(338, 141, 86, 31);
		contentPane.add(tfVueltas);
		tfVueltas.setColumns(10);
		
		comboEuros = new JComboBox();
		comboEuros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cambio=cambio+(float)((int)comboEuros.getSelectedItem());
				tfVueltas.setText(String.valueOf(cambio));
			}
		});
		comboEuros.setBounds(338, 60, 86, 22);
		contentPane.add(comboEuros);
		for(int i=0;i<6;i++) {						
			comboEuros.addItem(i);
		}
		
		comboCentimos = new JComboBox();
		comboCentimos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cambio=cambio+Float.parseFloat((String) comboCentimos.getSelectedItem());			
				tfVueltas.setText(String.format(Locale.US,"%.2f", cambio));//String.valueOf(cambio)
			}
		});
		comboCentimos.setBounds(338, 93, 86, 22);
		contentPane.add(comboCentimos);
		for(float i=0f;i<1f;i=i+0.05f) {
			comboCentimos.addItem(String.format(Locale.US,"%.2f", i));
		}
		
		lblEuros = new JLabel("Euros");
		lblEuros.setBounds(273, 64, 46, 14);
		contentPane.add(lblEuros);
		
		lblCentimos = new JLabel("Centimos");
		lblCentimos.setBounds(273, 97, 46, 14);
		contentPane.add(lblCentimos);
		
		lblVueltas = new JLabel("Vueltas");
		lblVueltas.setBounds(273, 149, 46, 14);
		contentPane.add(lblVueltas);
		
		rdbtnAgua = new JRadioButton("Agua");
		rdbtnAgua.setBounds(27, 67, 109, 23);
		rdbtnAgua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if(rdbtnAgua.isSelected()){
					tfPrecio.setText("1.00");
				}else {
					tfPrecio.setText(null);
				}
			}			
		});
		contentPane.add(rdbtnAgua);
		
		rdbtnChocolate = new JRadioButton("Chocolate");
		rdbtnChocolate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtnChocolate.isSelected()){
					tfPrecio.setText("0.40");
				}else {
					tfPrecio.setText(null);
				}
			}
		});
		
		rdbtnChocolate.setBounds(27, 93, 109, 23);
		contentPane.add(rdbtnChocolate);
		
		rdbtnCafe = new JRadioButton("Cafe");
		rdbtnCafe.setBounds(27, 119, 109, 23);
		rdbtnCafe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if(rdbtnCafe.isSelected()){
					tfPrecio.setText("0.50");
				}else {
					tfPrecio.setText(null);
				}
			}			
		});
		contentPane.add(rdbtnCafe);
		
		bg=new ButtonGroup();
		bg.add(rdbtnAgua);
		bg.add(rdbtnCafe);
		bg.add(rdbtnChocolate);
		
		btnExtraer = new JButton("Extraer");
		btnExtraer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(cambio>=Float.parseFloat(tfPrecio.getText())) {
					setTitle("Extrayendo");
					System.out.println(cambio+"          "+Float.parseFloat(tfPrecio.getText()));
					cambio=cambio-Float.parseFloat(tfPrecio.getText());
					tfVueltas.setText(String.format(Locale.US,"%.2f", cambio));
				}else {
					setTitle("Saldo insuficiente");
					System.out.println(cambio+"          "+Float.parseFloat(tfPrecio.getText()));
				}
			}
		});
		btnExtraer.setBounds(111, 197, 226, 39);
		contentPane.add(btnExtraer);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.colocar();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
