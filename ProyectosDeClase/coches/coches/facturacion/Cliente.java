package coches.facturacion;

public class Cliente {
	String dni;
	String nombre;
	int telefono;
	char provincia;
	
	
	Cliente(){
		
	}
	Cliente( String dni, String nombre, int telefono, char provincia){
		this.dni=dni;
		this.nombre=nombre;
		this.telefono=telefono;
		this.provincia=provincia;
	}
	Cliente(String dni, String nombre){
		this.dni=dni;
		this.nombre=nombre;
	}
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public char getProvincia() {
		return provincia;
	}
	public void setProvincia(char provincia) {
		this.provincia = provincia;
	}
	

}
