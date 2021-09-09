package futbol;

public class Iniciar {

	public static void main(String[] args) {
		SeleccionFutbol[] selec=new SeleccionFutbol[9];
		selec[0]=new Futbolista(01,"Jose","Garcia Torres",31,12,"Portero");
		selec[1]=new Futbolista(02,"Juan","Guerrero Bolueta",26,01,"Delantero");
		selec[2]=new Futbolista(03,"Paco","Muxika Pon",19,9,"Centro");
		selec[3]=new Futbolista(04,"Oier","Elosegi Perez",28,99,"Defensa");
		selec[4]=new Futbolista(05,"Josu","Coto Iturieta",22,30,"Punta");
		selec[5]=new Futbolista(06,"Iker","Mora Ibinarriaga",27,54,"Defensa");
		selec[6]=new Entrenador(0,"Jorge","Marinez Arantzeta",56,123);
		selec[7]=new Entrenador(100,"Marcos","Sagardui Barrena",42,114);
		selec[8]=new Masajista(747,"Oier","Ajuriaguerra Muskiz",25,"Fisioterapeuta",3);
		
		for(int x=0;x<selec.length;x++) {
			selec[x].entrenamiento();
			if(selec[x].getClass().getName().equals("futbol.Futbolista")) {
				((Futbolista)selec[x]).entrevista();
			}
			if(selec[x].getClass().getName().equals("futbol.Entrenador")) {
				((Entrenador)selec[x]).planificarEntrenamiento();
			}
			if(selec[x].getClass().getName().equals("futbol.Masajista")) {
				((Masajista)selec[x]).darMasaje();
			}
		}
		

	}

}
