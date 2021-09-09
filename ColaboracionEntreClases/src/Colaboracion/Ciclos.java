package Colaboracion;

public class Ciclos {
	private String codigo;
	private String nombre;
	private int horas;
	
	Ciclos(){
		
	}
	Ciclos(String codigo, String nombre, int horas){
		this.codigo=codigo;
		this.nombre=nombre;
		this.horas=horas;
	}
	Ciclos(String codigo, String nombre){
		this.codigo=codigo;
		this.nombre=nombre;
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	
	
	void visualizarEstudios() {
		System.out.println("*****************Estudios*****************");
		System.out.println("Nombre: "+nombre);
		System.out.println("Código: "+codigo);
		System.out.println("Duración: "+horas+" horas");
	}

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ciclos web=new Ciclos("web","Desarrollo de aplicaciones web",2000);
		Ciclos dam=new Ciclos("dam","Desarrollo de aplicaciones multiplataforma",2000);
		web.visualizarEstudios();
		dam.visualizarEstudios();
	}*/

}
