package packprimero;	
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
	@SuppressWarnings("serial")
	public class Bola5 extends JPanel {
		Bola5(int x){
			this.x=x;
		}
		public Bola5(){
		}
		
		int v=1;
		int x = 0;
		public int getX() {
			return x;
		}
		public void setX(int x) {
			this.x = x;
		}

		int y = 0;
		Color c=(Color.PINK);
		

		 public Color getC() {
			return c;
		}
		public void setC(Color c) {
			this.c = c;
		}
		public void moverBola() {
			x++;
			y++;
		}
		public void izqBola() {
			
			x=x+v;
			y=y+v;
			if(x==250)v=-1;
			if(x==0)v=1;
			
		}
		 void centroBola() {
			 y=y+v;
			 if(y==250)v=-1;
			 if(y==0)v=1;
		 }
		 void drchBola() {
			 x=x+v;
			 y=y+v;
			 if(x==0)v=-1;
			 if(x==250)v=1;
		 }

		@Override
		public void paint(Graphics g) {
			super.paint(g); 
			Graphics2D g2d = (Graphics2D) g;
			g2d.setColor(c);			
			g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);//suaviza los bordes de la bola
			g2d.fillOval(x, y, 30, 30);
			
		}
	}

