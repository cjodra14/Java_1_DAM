package instrumentos;

public class Guitarra extends InstrumentoViento{
	Guitarra(){
		super();
	}
	@Override
	public void tocar() {
		super.tocar();
		System.out.println("Y suena muy bién");
	}
	@Override
	public void afinar() {
		super.afinar();
		System.out.println("Y no da con la nota");
	}
	@Override
	public String tipoInstrumento() {
		super.tipoInstrumento();
		
		return "Guitarra";
		
	}

}
