package figuras;

public class Principal {
	 public static void main(String[] args) {  
	Figura figura1 = (Figura) new Circulo();
	figura1.area();
	figura1.perimetro();
	figura1 =(Figura) new Cuadrado();
	figura1.area();
	figura1.perimetro();
	    }
	}
