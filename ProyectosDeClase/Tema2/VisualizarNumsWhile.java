
public class VisualizarNumsWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaramos las variables
		byte cont=20;

		while(20<=cont&&50>=cont) { // comprueba si estamos entre 20 y 50
			if(cont<50) {
			System.out.print(cont+","); // visualiza cont con , si es menor que 50
			cont++;	//suma uno al contador
			}else {
				System.out.print(cont); // si es 50 entra aqui para visualizarlo si coma
				cont++; // suma uno para que no entre de nuevo en el while
			}
			
		}
			
	}

}
