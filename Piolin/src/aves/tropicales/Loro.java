package aves.tropicales;

import aves.Ave;

public class Loro extends Ave{
	char region;
	String color;
	Loro(){
		super();
	}
	public Loro(char sexo,byte edad, char region, String color){
		super(sexo,edad);
		this.region=region;
		this.color=color;
	}
	public void deDondeEres() {
		switch(region) {
		case 'n': System.out.println("Norte"); break;
		case 's': System.out.println("Sur"); break;
		case 'e': System.out.println("Este"); break;
		case 'o': System.out.println("Oeste"); break;
		}
	}
	public char getRegion() {
		return region;
	}
	public void setRegion(char region) {
		this.region = region;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}