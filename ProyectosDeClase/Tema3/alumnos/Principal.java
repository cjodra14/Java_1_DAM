package alumnos;


public class Principal {

	public static void main(String[] args) {
		Colegio cole1=new Colegio((short)1,"Ceinmark",666333555,"www.ceinmark.com");
		Colegio cole2=new Colegio((short)2,"lauaxeta",666777555,"www.lauaxeta.com");
		Alumno al1=new Alumno(1,"Juan",666777888,cole1);
		Alumno al2=new Alumno(2,"Andrea",666888999,cole1);
		Alumno al3=new Alumno(3,"Marta",666111222,cole2);
		Alumno al4=new Alumno(4,"Alex",666999111,cole2);
		Alumno al5=new Alumno(5,"Peru",666222111,cole1);
		al1.visualizar();
		al1.cambiarTelefono(666555666);
		al1.visualizar();
		al2.visualizar();
		al3.visualizar();
		al4.visualizar();
		al5.visualizar();
		
	}

}
