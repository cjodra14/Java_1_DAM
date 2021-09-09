package club;

import java.util.ArrayList;
import java.util.Iterator;


public class ClubArrayList {	

	 static ArrayList<Club> clubes=new ArrayList<Club>();
	
	
	
	public ArrayList<Club> getClubes() {
		return clubes;
	}

	public void setClubes(ArrayList<Club> clubes) {
		this.clubes = clubes;
	}

	public void introClub(String nombre, short anyo) {
		
		Club aux=new Club(nombre,anyo);
		clubes.add(aux);
	}
	
	public static void contar() {
		int contClubes=0;
		int contClubesAntes=0;
		/*Iterator<Club> it= clubes.iterator();
		while (it.hasNext()) {
			Club cl=it.next();
			contClubes++;
			if (2000>=cl.getAnyo()) {
				contClubesAntes++;
			}	
		}*/
		
		/*for (int i = 0; i < clubes.size(); i++) {
			Club cl=(Club) clubes.get(i);
			contClubes++;
			if (2000>=cl.getAnyo()) {
				contClubesAntes++;
			}
		}*/
		for(Club clTemp: clubes) {
			contClubes++;
			if (2000>=clTemp.getAnyo()) {
				contClubesAntes++;
			}
		}
		
		
		System.out.print("Hay "+contClubes+" en total ");
		System.out.println("de ellos "+contClubesAntes+"  son anteriores al año 2000");
		
	}
}
