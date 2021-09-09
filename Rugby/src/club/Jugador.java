package club;

public class Jugador {
	private long numLicencia;
	private String apellidos;
	private String nombre;
	private String posicion;
	private float estatura;
	private float peso;
	private String nacionalidad;
	private Club cl;
	
	public static int contAltos = 0;
	public static int medMele = 0;
	public static int pesoMas = 0;
	
	
	
	public long getNumLicencia() {
		return numLicencia;
	}
	public void setNumLicencia(long numLicencia) {
		this.numLicencia = numLicencia;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	public float getEstatura() {
		return estatura;
	}
	public void setEstatura(float estatura) {
		this.estatura = estatura;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public Club getCl() {
		return cl;
	}
	public void setCl(Club cl) {
		this.cl = cl;
	}
	
	Jugador(){
		
	}
	public Jugador(long numLicencia, String apellidos, String nombre, String posicion, float estatura, float peso,
		String nacionalidad, Club cl) {		
		this.numLicencia = numLicencia;
		this.apellidos = apellidos;
		this.nombre = nombre;
		this.posicion = posicion;
		this.estatura = estatura;
		this.peso = peso;
		this.nacionalidad = nacionalidad;
		this.cl = cl;
		
		sumEstaticos(estatura,posicion,peso);
	}
	
	public void visualizar() {
		System.out.println(nombre+" "+apellidos+" juega en el club "+cl.getNombre());
		
	}
	
	public static void sumEstaticos(float estatura, String posicion, float peso) {	
		if (estatura>=1.7) {
			contAltos++;
		}
		if (posicion.equals("Medio melé")) {
			medMele++;
		}
		if (peso>=70f) {
			pesoMas++;
		}					
	}
	
	

}
