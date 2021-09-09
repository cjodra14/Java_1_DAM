package futbol;

public abstract class SeleccionFutbol {
	protected int id;
	protected String nombre;
	protected String apellidos;
	protected int edad;
	
	SeleccionFutbol(){
		
	}
	
	public SeleccionFutbol(int id, String nombre, String apellidos, int edad) {
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}
	void viajar() {
		System.out.println(nombre+"Est� viajando");
	}
	void concentrarse() {
		System.out.println(nombre+"Est� en una concentracion");
	}
	public abstract void entrenamiento();
	
	void partidoFutbol() {
		System.out.println(nombre+"Est� en una concentracion");
	}
}


