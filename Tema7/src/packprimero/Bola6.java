package packprimero;
import javax.swing.JFrame;
public class Bola6 extends JFrame{
	Bola5 bola1=new Bola5();
	Bola5 bola2=new Bola5(100);
	Bola5 bola3=new Bola5(250);
	Bola6(){
	add(bola2);
	add(bola3);
	}
	void repetir() {
	while(true){ //colocar un bucle infinito for(;;) es lo mismo while(true)
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
				Bola6 obj = new Bola6();				
				obj.setBounds(0,0,300,300);
				obj.setVisible(true);
                obj.setResizable(true);				
                obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				obj.repetir();
				
		}		}
