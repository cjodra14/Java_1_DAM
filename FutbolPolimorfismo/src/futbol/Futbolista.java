package futbol;

public class Futbolista extends SeleccionFutbol{
	protected int dorsal;
	protected String demarcacion;
	
	public Futbolista(int id, String nombre, String apellidos, int edad,int dorsal, String demarcacion) {
		super(id, nombre, apellidos, edad);
		this.dorsal = dorsal;
		this.demarcacion = demarcacion;
	}

	public Futbolista() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void entrenamiento() {
		System.out.println(nombre+" est� entrenando");
		
	}
	void entrevista() {
		System.out.println(nombre+" d� una entrevista");
	}
	

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getDemarcacion() {
		return demarcacion;
	}

	public void setDemarcacion(String demarcacion) {
		this.demarcacion = demarcacion;
	}
	

}
