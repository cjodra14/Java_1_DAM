package aves;

public class Ave{
	char sexo;
	byte edad;
	static int contAves=0;
	
	protected Ave(){
		contAves=contAves+1;
	}
	protected Ave(char sexo, byte edad){
		this.sexo=sexo;
		this.edad=edad;
		contAves=contAves+1;
	}
	public static void visuAves() {
		System.out.println("En total tenemos "+contAves+" aves");
	}
	public void quienSoy() {
		System.out.println("soy "+sexo+" y tengo "+edad+" años");
	}
}
