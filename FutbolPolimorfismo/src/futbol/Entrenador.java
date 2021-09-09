package futbol;

public class Entrenador extends SeleccionFutbol {
	protected int idFederacion;
	public Entrenador() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Entrenador(int id, String nombre, String apellidos, int edad, int idFederacion) {
		super(id, nombre, apellidos, edad);
		this.idFederacion=idFederacion;
		// TODO Auto-generated constructor stub
	}

	public int getIdFederacion() {
		return idFederacion;
	}

	public void setIdFederacion(int idFederacion) {
		this.idFederacion = idFederacion;
	}

	@Override
	public void entrenamiento() {
		System.out.println(nombre+" dirige un entrenamiento");
		
	}
	void planificarEntrenamiento() {
		System.out.println(nombre+" planifica un entrenamiento");
	}

}
