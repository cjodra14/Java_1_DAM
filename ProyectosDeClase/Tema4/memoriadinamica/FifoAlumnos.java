package memoriadinamica;


public class FifoAlumnos {
	class Alumno{
		int numAlumno;
		String nombre;
		String apel1;
		String apel2;
		char prov;
		Alumno sig;
		//Alumno sigG;
		//Alumno sigB;
		
	}
	class Indice{
		Alumno a;
		Indice b;
	}
	Alumno raizT, antT, raizB, antB, raizG, antG ;
	public FifoAlumnos() {
		raizT=null; //a quien le toca
		antT=null;// quien es el ultimo de la lista
		raizB=null;
		antB=null;
		raizG=null;
		antG=null;
		
	}
	
	void insertarColaGeneral(int numero, String nom, String apellido1, String apellido2, char prov) {
		Alumno nuevoAlumno=new Alumno();
		nuevoAlumno.numAlumno=numero;
		nuevoAlumno.nombre=nom;
		nuevoAlumno.apel1=apellido1;
		nuevoAlumno.apel2=apellido2;
		nuevoAlumno.prov=prov;
		nuevoAlumno.sig=null;
		if(raizT==null) {
			raizT=nuevoAlumno;
			antT=nuevoAlumno;
		}else {
			antT.sig=nuevoAlumno;
			antT=nuevoAlumno;
		}
		insertarColaBG(numero, nom, apellido1, apellido2, prov);
	}
	void insertarColaBG(int numero, String nom, String apellido1, String apellido2, char prov) {
		
		if(prov=='b'){Alumno nuevoAlumnoB=new Alumno();
		nuevoAlumnoB.numAlumno=numero;
		nuevoAlumnoB.nombre=nom;
		nuevoAlumnoB.apel1=apellido1;
		nuevoAlumnoB.apel2=apellido2;
		nuevoAlumnoB.prov=prov;
		nuevoAlumnoB.sigB=null;
		if(raizB==null) {
			raizB=nuevoAlumnoB;
			antB=nuevoAlumnoB;
		}else {
			antB.sigB=nuevoAlumnoB;
			antB=nuevoAlumnoB;
		}}else if(prov=='g') {
			Alumno nuevoAlumnoG=new Alumno();
			nuevoAlumnoG.numAlumno=numero;
			nuevoAlumnoG.nombre=nom;
			nuevoAlumnoG.apel1=apellido1;
			nuevoAlumnoG.apel2=apellido2;
			nuevoAlumnoG.prov=prov;
			nuevoAlumnoG.sigG=null;
			if(raizG==null) {
				raizG=nuevoAlumnoG;
				antG=nuevoAlumnoG;
			}else {
				antG.sigG=nuevoAlumnoG;
				antG=nuevoAlumnoG;}
		}
	}
	
	void visualizarGeneral(){
		Alumno wraizT=raizT;
	while(wraizT!=null){
		System.out.println("Alumno nº: "+wraizT.numAlumno+", Nombre y apellidos: "+wraizT.nombre+" "+wraizT.apel1+" "+wraizT.apel2+", provincia: "+wraizT.prov);
		wraizT=wraizT.sig;
	}
	}
	void visualizarBizkaia(){
		Alumno wraizB=raizB;
	while(wraizB!=null){
		System.out.println("Alumno nº: "+wraizB.numAlumno+", Nombre y apellidos: "+wraizB.nombre+" "+wraizB.apel1+" "+wraizB.apel2+", provincia: "+wraizB.prov);
		wraizB=wraizB.sigB;}
		
	}
	void visualizarGipuzkoa(){
		Alumno wraizG=raizG;
	while(wraizG!=null){
		System.out.println("Alumno nº: "+wraizG.numAlumno+", Nombre y apellidos: "+wraizG.nombre+" "+wraizG.apel1+" "+wraizG.apel2+", provincia: "+wraizG.prov);
		wraizG=wraizG.sigG;
		
	}
	}
	void extraer(){
		if (raizT.prov=='b') {
			raizB=raizB.sigB;
		}else if(raizT.prov=='g') {
			raizG=raizG.sigG;
		}
		raizT=raizT.sig;
		
			
		}

	public static void main(String[] args) {
		FifoAlumnos cola1=new FifoAlumnos();
		cola1.insertarColaGeneral(01, "Christian", "Jodra", "Lopez", 'b');
		cola1.insertarColaGeneral(02, "Andrea", "Bombin", "Rebollo", 'b' );
		cola1.insertarColaGeneral(03, "Andoni", "Renart", "Vado" , 'g');
		cola1.insertarColaGeneral(04, "Unai", "Lopez", "Txopi", 'g');
		cola1.insertarColaGeneral(05, "Patricia", "Carballo", "Gomez", 'b');
		cola1.insertarColaGeneral(06, "Iker", "Manso", "Osma", 'g');
		cola1.visualizarGeneral();
		System.out.println();
		cola1.visualizarBizkaia();
		System.out.println();
		cola1.visualizarGipuzkoa();
		cola1.extraer();
		System.out.println();
		cola1.visualizarGeneral();
		System.out.println();
		cola1.visualizarBizkaia();
		System.out.println();
		cola1.visualizarGipuzkoa();
		

	}

}
