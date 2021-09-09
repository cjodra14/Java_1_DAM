package partidos;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
//faltan import

public class Principal {	
	
	public static void main (String args[]){		
		
		System.out.println("... Nos creamos un ArrayList de objetos de la Clase \"PartidoFutbol\" ...");
		ArrayList<PartidoFutbol> partidos= new ArrayList();
		
		// Instanciamos el fichero donde estan los datos
		File fichero = new File("partidos.txt");
		Scanner s = null;		
	try{			
			System.out.println("... Leemos el contenido del fichero ...");			
				s = new Scanner(fichero);			
			
			// Obtengo los datos de los partidos de fútbol del fichero
		
			while (s.hasNextLine()){
				String linea = s.nextLine();	// Obtengo una linea del fichero (un partido de fútbol)			
				String [] cortarString = linea.split("::");	// Obtengo los datos del partido de futbol		
				PartidoFutbol partido = new PartidoFutbol();	// Creo un objeto de la clase "PartidoFutbol"		
				// Pongo los atributos al objeto "partido"
				partido.setEquipoLocal(cortarString[0]);
				partido.setEquipoVisitante(cortarString[1]);
				partido.setGolesLocal(Integer.parseInt(cortarString[2]));
				partido.setGolesVisitante(Integer.parseInt(cortarString[3]));
				
				// Añadimos el objeto "partido" al ArrayList
				
				partidos.add(partido);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
				if (s != null) {
					s.close();}  
		}
		//codifica el syso para que salga: ... Guardados 50 partidos de fútbol  ...
		System.out.println("... Guardados "+partidos.size() +" partidos de fútbol ...");
		
		
		
		// Imprimimos los elementos del ArrayList
		System.out.println("\n... Resultados de los partidos de Futbol ...");

		Iterator<PartidoFutbol> iter= partidos.iterator();
		while(iter.hasNext()) {
			PartidoFutbol obj=iter.next();
			System.out.println(obj.getEquipoLocal()+" "+obj.getGolesLocal()+"-"+obj.getGolesVisitante()+" "+obj.getEquipoVisitante());
			
		}
		
		
		
	}
}

