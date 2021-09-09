package coches.facturacion;

public class Vendedor {
	String dni;
	String nombre;
	byte categoria;
	float sueldoBase;
	
	Vendedor(){
		
	}
	Vendedor(String dni, String nom, byte cat, float sueldo){
		this.dni=dni;
		nombre=nom;
		categoria=cat;
		sueldoBase=sueldo;
	}
	Vendedor(String dni, String nom){
		this.dni=dni;
		nombre=nom;
	}
	Vendedor(String dni,float sueldo){
		this.dni=dni;
		sueldoBase=sueldo;
	}
	
	void calculoSueldo() {
		float sueldoFinal;
		if(categoria==1) {
			sueldoFinal=sueldoBase*1.02F;
		}else {
			sueldoFinal=sueldoBase*1.05F;
		}
		System.out.println(sueldoFinal);
		
	}
	void visualizar() {
		System.out.print("El empleado "+dni+" tiene un sueldo de: ");
		calculoSueldo();
	}
	String getNombre() {
		return nombre;
	}
	String setNombre(String nom) {
		nombre=nom;
		return nombre;
	}
	public static void main(String[] args) {
		float sueldo;
	}
}
