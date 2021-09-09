package alumnos;

public class Colegio {
	int tel;
	short codigo;
	String web;
	String nombre;
	
	Colegio(short cod, String nom, int tel, String web){
		codigo=cod;
		nombre=nom;
		this.tel=tel;
		this.web=web;
	}
	
	void altaTelefono(int tel) {
		this.tel=tel;
		System.out.println("El telefono es "+this.tel);
	}
	String getNombre() {
		
		return nombre;
	}
	int getTelefono() {
		
		return tel;
	}
	

}
