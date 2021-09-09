package ejer1;
 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.*;
 
 
public class Autenticacion extends JFrame implements ActionListener {
	JLabel userLabel, passLabel;
    JButton boton1;
    JTextField userTF;
    JTextField  passTF;
    
    String [] usuarios= {"admin","chris","andrea","andoni","iker"};
    String [] passes= {"admin","12345","abc123","123abc","pass123"};
 
    Autenticacion(){
        setLayout(null);        
    }
    
    void metodo () {
    	
        boton1= new JButton("Confirmar");
        boton1.setBounds(10,100,120,30);
        add(boton1);
        boton1.addActionListener(this);
        
        userLabel= new JLabel("Usuario:");
        userLabel.setBounds(10,20,120,30);
        add(userLabel);
        
        userTF = new JTextField();
        userTF.setBounds(90,22,175,20);
        add(userTF);
        
        passLabel = new JLabel("Constraseña:");
        passLabel.setBounds(10,60,120,30);
        add(passLabel);
        
        passTF = new JTextField();
        passTF.setBounds(95,62,170,20);
        add(passTF);
    }
    
    
    public void actionPerformed(ActionEvent arg0) {
        
        boolean logueado=false;
 
         for (int i = 0; i < usuarios.length  && logueado==false; i++){
             if(userTF.getText().equals(usuarios[i]) && passTF.getText().equals(passes[i])) {                
                     logueado=true;                     
                     setTitle("CORRECTO");
                 }else logueado=false;                                     
         }        
         if(logueado==false) setTitle("INCORRECTO");       
    } 
    
    
    public static void main(String[] args) {
        
        Autenticacion ventana=new Autenticacion();
         ventana.setBounds(20,20,300,200);
         ventana.setResizable(false);
         ventana.metodo();
         ventana.setVisible(true);
         ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);          
    }   
}
