package notas;

public class Intermedia {
	Intermedia(){
		
	}
	private String nombre;
	private String [] asignaturas = {"Programación","Bases de Datos","Entornos","Form. y Or. Laboral"};
	private int [] notas = new int [4];
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String[] getAsignaturas() {
		return asignaturas;
	}
	public void setAsignaturas(String[] asignaturas) {
		this.asignaturas = asignaturas;
	}
	public int[] getNotas() {
		return notas;
	}
	public void setNotas(int[] notas) {
		this.notas = notas;
	}
	
	
	
	public String  compobarNotas(String nombre, String [] notasComprobar) {
		Salida salida=new Salida();
		boolean notaVacia=false;
		String titulo="";
		if(nombre.equals("")) {
			titulo="Introduce el nombre";
		}else {
		for(int i=0;i<notasComprobar.length && !notaVacia;i++) {
			if(notasComprobar[i].equals("")) {
				notaVacia=true;
				titulo="Introduce todas las notas";
			}else if(i==3){
				this.nombre=nombre;
				for(int y=0;y<notasComprobar.length;y++) {
					notas[y]=Integer.parseInt(notasComprobar[y]);
				}
				salida.salidaDatos(this.nombre, asignaturas, notas);
				titulo="";
			}
			
			
			
		}}
		return titulo;
	}
	
	
}
