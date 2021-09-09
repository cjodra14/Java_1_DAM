package ejer1;

import javax.swing.JFrame;

public class mainBotones extends miClaseGrafica{

    public static void main(String[] args) {
         miClaseGrafica grafica1=new miClaseGrafica();

            grafica1.setBounds(10,10,400,300);
            grafica1.colocarBoton1();
            grafica1.setVisible(true); 
            grafica1.setResizable(true);
            grafica1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        }


    }