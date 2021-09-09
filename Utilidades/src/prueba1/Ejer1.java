package prueba1;
public class Ejer1{
String[] alumnos={"Marta","José","Fátima","Ane"};
void visualizar()throws Exception{ // El método visualizar lanza una excepción

	for(int x=0;x<=4;x++){	
		System.out.println(alumnos[x]);
	}
}

void calcular() throws Exception {	
		visualizar();
	
}

public static void main(String[] args) {
	Ejer1 obj=new Ejer1();	
		try {
			obj.calcular();
		} catch (Exception e) {
			System.out.println("no hay más alumnos");
		}	

}

}









