package EstrellasTV;
import aves.Ave;
import aves.pajaros.Canario;

public class Piolin extends Canario {
	int numPeliculas;
	Piolin(){
		super();
	}
	public Piolin(char sexo, byte edad, float tamanio, int numPeliculas){
		super(sexo,edad,tamanio);
		this.numPeliculas=numPeliculas;
	}
}

