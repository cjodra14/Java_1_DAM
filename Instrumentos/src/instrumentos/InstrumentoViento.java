package instrumentos;

public class InstrumentoViento implements InstrumentoMusical {

	public void tocar() {
		System.out.println("Esta tocando el instrumento");
		
	}
	public void afinar() {
		System.out.println("Afinamos el instrumento");
		
	}
	public String tipoInstrumento() {
		String tipo = "Este instrumento es: ";
		return tipo;
	}

}
