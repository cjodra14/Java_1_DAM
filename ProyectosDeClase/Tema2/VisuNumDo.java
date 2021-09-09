
public class VisuNumDo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte cont=20;
		
		do {							//Nos visualiza el umero guardado en cont y le suma uno
			System.out.print(cont+",");
			cont++;
		}
		while(20<=cont&&50>cont); // Mientras que esté entre 20 y 50 se ejecuta 
		System.out.println(cont);// muestra el numero 50
	}
	

}
