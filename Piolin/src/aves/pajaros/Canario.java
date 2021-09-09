package aves.pajaros;

import aves.Ave;

public class Canario extends Ave {
	float tamanio;
	protected Canario(){
		super();
	}
	Canario(char sexo, byte edad){
		super(sexo,edad);
	}
	protected Canario(char sexo, byte edad, float tamanio){
		super(sexo,edad);
		this.tamanio=tamanio;	
	}
	public void altura() {
		if (tamanio>30) {
			System.out.println("Alto");
		}else if(tamanio>=15) {
			System.out.println("Mediano");
		}else {
			System.out.println("Bajo");
		}
	}
	public float getTamanio() {
		return tamanio;
	}
	public void setTamanio(float tamanio) {
		this.tamanio = tamanio;
	}
}