package Colaboracion;

public class Inicios {

	public static void main(String[] args) {
		//Ciclos web=new Ciclos("web","Desarrollo de aplicaciones web",2000);
		Ciclos dam=new Ciclos("dam","Desarrollo de aplicaciones multiplataforma",2000);
		Ciclos cap=new Ciclos("cap","Formación del profesorado",1500);
		Estudiantes est1=new Estudiantes("123A","Andrea","Bombin","Rebollo","13/03/1998",61.2F,1.63F,'F',"Hermanos Larrarte",cap);
		Estudiantes est2=new Estudiantes("112C","Christian","Jodra","Lopez","21/06/1998",59.7F,1.67F,'M',"Texidor",dam);
		est1.visualizarEstudiantes();
		est2.visualizarEstudiantes();

	}

}
