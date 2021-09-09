package animal;

import java.util.Scanner;
	

public class Animal {
	protected String nombre;
	protected int edad;
	protected Scanner src=new Scanner(System.in);
	Animal(){
		
	}
	Animal(String nombre,int edad){
		this.nombre=nombre;
		this.edad=edad;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	void hablar() {
		System.out.println("Mi nombre es "+nombre+" y tengo "+edad+" años");
	}
	void pedirDatos() {
		
		System.out.println("Introduce el nombre del animal:");
		nombre=src.nextLine();
		System.out.println("Introduce la edad del animal:");
		edad=src.nextInt();
		src.nextLine();
	}

	class Gato extends Animal{
		Gato(){
			super();
		}
		Gato(String nombre, int edad){
			super(nombre,edad);
		}
	}
	
class Pajaro extends Animal{
		protected String clima;
		Pajaro(){
			super();
		}
		Pajaro(String nombre, int edad,String clima){
			super(nombre,edad);
			this.clima=clima;
		}
		void hablar() {
		super.hablar();
		System.out.println("vive en "+clima);
		clima=src.nextLine();
		}
		void pedirDatos() {
			super.pedirDatos();
			System.out.println("A que clima pertenece:");
			clima=src.nextLine();
		}
		
	}

	class Loro extends Pajaro{
		String color;
	Loro(){
		super();
	}
	Loro(String nombre, int edad,String clima,String color){
		super(nombre,edad,clima);
		this.color=color;
	}
	void hablar() {
		super.hablar();
		System.out.println("es de color "+color);
		color=src.nextLine();
		}
		void pedirDatos() {
			super.pedirDatos();
			System.out.println("Es de color:");
			color=src.nextLine();
		}
}
	
	public static void main(String[] args) {
		Animal an1=new Animal();
		an1.pedirDatos();
		an1.pedirDatos();
		
	
	}

}
