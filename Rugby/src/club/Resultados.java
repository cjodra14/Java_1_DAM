package club;

public class Resultados {
	private byte codPartido;
	private Jugador jugador;
	private byte tiempo;
	private int puntuacion;
	private byte minuto;
	
	public Resultados(){
		
	}
	public Resultados(byte codPartido, Jugador jugador, byte tiempo, int puntuacion, byte minuto) {		
		this.codPartido = codPartido;
		this.jugador = jugador;
		this.tiempo = tiempo;
		this.puntuacion = puntuacion;
		this.minuto = minuto;
	}
	
	public void visualizar() {
		System.out.println("El jugador: "+jugador.getNombre()+" de nacionalidad: "+jugador.getNacionalidad()+" del club "+jugador.getCl().getNombre());
		System.out.println("ha jugado el partido cod: "+codPartido);
	}
	
	

}
