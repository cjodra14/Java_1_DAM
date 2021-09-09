package eventos;

//Realiza el programa con menos líneas de código
import java.awt.*;
import static java.awt.Font.PLAIN;
import java.awt.event.*;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.border.LineBorder;


public class Eventos extends JFrame implements ActionListener, KeyListener, MouseListener {

	JLabel display;
	JButton [] boton=new JButton[4];
	String []txtBotones=new String[4];	
  
	public Eventos(){ }
  
	private void initPantalla(){      
		setTitle("Eventos");
		setSize(240,375);
		setResizable(false);
		setLayout(null);
		getContentPane().setBackground(Color.BLACK);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);      
	}
  
	private void initDisplay(){      
		//Propiedades y estilos del JLabel
		display = new JLabel("");
		display.setBounds(15, 15, 215, 60);
		display.setOpaque(true);
		display.setBackground(Color.BLACK);
		display.setForeground(Color.GREEN);
		display.setBorder(new LineBorder(Color.DARK_GRAY));
		display.setFont(new Font("MONOSPACED",PLAIN,24));
		display.setHorizontalAlignment(SwingConstants.RIGHT);
		display.setFocusable(true);
		add(display);      
		//Eventos de entrada de teclado
		display.addKeyListener(this);      
	}
  
	//Propiedades y estilos de los JButton
	private void initBotones(){
		int f=90;
		for(int i = 0; i < txtBotones.length; i++) {
			if (i<txtBotones.length-1) {
				txtBotones[i]="Pulsa o teclea"+(i+1);
			}else {
				txtBotones[i]="Limpiar Display";
			}
		}
		for (int i = 0; i < boton.length; i++) {						
			boton[i]=new JButton(txtBotones[i]);
			boton[i].setBounds(15,f,215,50);
			f=f+65;
			boton[i].setFont(new Font("MONOSPACED",PLAIN,16));
			boton[i].setOpaque(true);
			boton[i].setFocusPainted(false);
			boton[i].setBackground(Color.DARK_GRAY);
			boton[i].setBorder(new LineBorder(Color.DARK_GRAY));
			boton[i].setForeground(Color.WHITE);
			add(boton[i]);
			boton[i].addActionListener(this);
			boton[i].addMouseListener(this);
		} 
	}
   
	public static void main(String[] args) {
		Eventos obj=new Eventos();
		obj.initDisplay();
		obj.initBotones();
		obj.initPantalla();		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		boolean fin=false;
		for (int i = 0; i < boton.length && !fin; i++) {
			if (arg0.getSource()==boton[i]&&i<boton.length-1) {
				display.setText(display.getText() + (i+1));				
				fin=true;				
			}else if (arg0.getSource()==boton[i]) {
				display.setText("");				
				fin=true;
			}
		}
		display.requestFocus();//devuelvo foco a display para que funcione el KeyListener
	/*int x=0;
	JButton btn=(JButton)arg0.getSource();
	for (; x <4&& !btn.getActionCommand().equals(boton[x]); x++);
	if(x==3)display.setText("");
	else display.setText(display.getText()+(x+1));
	display.requestFocus();
	*/
	
	}
	
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		String ch = String.valueOf(arg0.getKeyChar());
		if ("1".equals(ch) || "2".equals(ch) || "3".equals(ch)){
			display.setText(display.getText() + ch);  
		}
		if ("c".equals(ch)){
			display.setText("");
		}
	}
	
	@Override
	public void keyReleased(KeyEvent arg0) {}
	
	@Override
	public void keyTyped(KeyEvent arg0) {}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {}
	
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		JButton btn= (JButton)arg0.getSource();
				btn.setBackground(Color.GREEN);
				btn.setBorder(new LineBorder(Color.GREEN));
				btn.setForeground(Color.DARK_GRAY);			
	}
	
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		JButton btn= (JButton)arg0.getSource();
				btn.setBackground(Color.DARK_GRAY);
				btn.setBorder(new LineBorder(Color.DARK_GRAY));
				btn.setForeground(Color.WHITE);				
	}
	
	@Override
	public void mousePressed(MouseEvent arg0) {	}
	
	@Override
	public void mouseReleased(MouseEvent arg0) {} 
}
