package Colaboracion;

public class Estudiantes {
	String dni;
	String nombre;
	String apellido1;
	String apellido2;
	String fechaDeNacimiento;
	float peso;
	float estatura;
	char genero;
	String direccion;
	Ciclos estudios;
	
	Estudiantes(){
		
	}
	Estudiantes(String dni,String nombre,String apellido1, String apellido2,String fechaDeNacimiento,float peso,float estatura,char genero,String direccion,Ciclos estudios){
		this.dni=dni;
		this.nombre=nombre;
		this.apellido1=apellido1;
		this.apellido2=apellido2;
		this.fechaDeNacimiento=fechaDeNacimiento;
		this.peso=peso;
		this.estatura=estatura;
		this.genero=genero;
		this.direccion=direccion;
		this.estudios=estudios;
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
	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	public String getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	public void setFechaDeNacimiento(String fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getEstatura() {
		return estatura;
	}
	public void setEstatura(float estatura) {
		this.estatura = estatura;
	}
	public char getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	public Ciclos getEstudios() {
		return estudios;
	}
	public void setEstudios(Ciclos estudios) {
		this.estudios = estudios;
	}
	void visualizarEstudiantes() {
		System.out.println("*******Estudiante*******");
		System.out.println("Nombre completo: "+nombre+" "+apellido1+" "+apellido2);
		System.out.println("Fecha de nacimiento: "+fechaDeNacimiento);
		System.out.println("Peso: "+peso+"kg");
		System.out.println("Estatura: "+estatura+"m");
		System.out.println("Genero: "+genero);
		System.out.println("Dirección: "+direccion);
		System.out.println("Estudios que realiza: "+(estudios.getNombre()));
		System.out.println("Duración de los estudios: "+(estudios.getHoras()));
		
	}
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub

	}*/

}
