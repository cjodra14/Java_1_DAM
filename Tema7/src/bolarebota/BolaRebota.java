package bolarebota;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import packprimero.Bola5;
public class BolaRebota extends JFrame implements ActionListener{
	
	JButton btnPlay;
	JButton btnPause;
	Bola5 bola1=new Bola5();
	
		BolaRebota(){
			setLayout(null);
			btnPlay=new JButton(">");
			btnPause=new JButton("||");
			btnPlay.setBounds(10,10,50,50);
			btnPlay.setVisible(true);
			add(btnPlay);
		
		add(bola1);
		}
		void repetir() {
		for(;;) { //colocar un bucle infinito for(;;) es lo mismo while(true)
			bola1.izqBola();
			bola1.repaint();
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}	
		}
		public static void main(String[] args)  {			
					BolaRebota obj = new BolaRebota();
					obj.setBounds(0,0,300,300);
					obj.setVisible(true);
	                obj.setResizable(true);				
	                obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					obj.repetir();
					
			}
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
		}		
}