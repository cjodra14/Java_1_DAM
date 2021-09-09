package ejer1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.util.Scanner;

public class Busqueda extends JFrame implements ActionListener{
	JLabel lb1,lb2,lbtxt,lbpos;
	JTextField tf1,tftxt,tfpos;
	JButton btn, btntxt;
	JTextArea ta1;
	JScrollPane scrollpane1;
	Scanner src;
	
	
	Busqueda(){
		setLayout(null);
	}
	
	void posicionar() { ta1=new JTextArea("");
		 ta1.setLineWrap(true);   
		   ta1.setBounds(10,50,400,300);		   
		   add(ta1);

	        
	     lb1= new JLabel("Introduce el texto completo:");
	     lb1.setBounds(10,20,200,30);
	     add(lb1);
	     
	     lb2= new JLabel("Introduce la palabra a buscar:");
	     lb2.setBounds(500,50,200,30);
	     add(lb2);
	     
	     tf1= new JTextField();
	     tf1.setBounds(500,100,200,30);
	     add(tf1);
	     
	     btn=new JButton("Buscar");
	     btn.setBounds(550,180,100,30);
	     add(btn);
	     btn.addActionListener(this);
	     
	     btntxt=new JButton("Añadir texto");
	     btntxt.setBounds(670,340,150,30);
	     add(btntxt);
	     btntxt.addActionListener(this);
	     
	     lbtxt= new JLabel("Introduce la palabra a añadir");
	     lbtxt.setBounds(520,250,200,30);
	     add(lbtxt);
	     
	     tftxt= new JTextField();
	     tftxt.setBounds(520,290,200,30);
	     add(tftxt);
	     
	     lbpos= new JLabel("Posición del texto:");
	     lbpos.setBounds(790,250,200,30);
	     add(lbpos);
	     
	     tfpos= new JTextField();
	     tfpos.setBounds(790,290,200,30);
	     add(tfpos);
	     
	     llenarTA();
	     

	}
	
	void llenarTA() {
		try {
		FileReader writer = new FileReader("test_texto.txt");
        BufferedReader br = new BufferedReader( writer );
        ta1.read(br, null);
        br.close();
		}
		catch(Exception e) {
			System.out.println("No ha funcionado");			
		}
	}

	public static void main(String[] args) {
		Busqueda ventana = new Busqueda();
		ventana.setBounds(10,10,1080,800);
		ventana.setResizable(true);
		ventana.posicionar();
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
		

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource()==btn) {
			if(ta1.getText().indexOf(tf1.getText())>-1) {
				setTitle("El texto contiene la palabra");
			}else {
				setTitle("Palabra no encontrada");
			}
		}
		if(arg0.getSource()==btntxt){
			try {
			ta1.replaceRange(" "+tftxt.getText()+" ", Integer.parseInt(tfpos.getText()), (Integer.parseInt(tfpos.getText())+tfpos.getText().length()));	
			}catch(Exception e) {
				setTitle("Escribe un texto");
			}
		}
		
	}

}
