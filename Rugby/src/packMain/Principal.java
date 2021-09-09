package packMain;

import club.*;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Club cl1=new Club("Universitario Bilbao Rugby",(short) 1969);
		Club cl2=new Club("Gernika Rugby Taldea",(short)1999);
		
		Equipo e1=new Equipo("Senior Femenino","Senior Masculino","Senior B","Sub 18","Sub16",cl1);
		Jugador j1=new Jugador((long)74236,"Jodra Lopez","Christian","Medio melé",(float)1.75f,(float)60.1f,"Española",cl1);
		Jugador j2=new Jugador((long)74236,"Jodra Lopez","Christian","Medio melé",(float)1.75f,(float)70.1f,"Española",cl1);
		Jugador j3=new Jugador((long)74236,"Jodra Lopez","Christian","Medio melé",(float)1.75f,(float)60.1f,"Española",cl1);
		Resultados r1=new Resultados((byte)12,j1,(byte)1,15,(byte)36);
		r1.visualizar();
		j2.visualizar();
		e1.visualizar();
		cl1.visualizar();
		cl2.visualizar();
		System.out.println("Hay "+Jugador.contAltos+" de mas de 1,7m.");
		System.out.println("Hay "+Jugador.medMele+" Medio Melés");
		System.out.println("Hay "+Jugador.pesoMas+" que pesen mas de 70 kg");*/
		
		
		ClubArrayList cla=new ClubArrayList();
		cla.introClub("Universitario Bilbao Rugby",(short) 1969);
		cla.introClub("Gernika Rugby Taldea",(short)2007);
		cla.introClub("Arrasate Rugby Taldea",(short)1976);
		cla.introClub("Durango Rugby Taldea",(short)1986);
		//ClubArrayList.contar(cla.getClubes());
	}

}
