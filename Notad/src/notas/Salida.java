package notas;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.jdom2.*;
import org.jdom2.output.XMLOutputter;

public class Salida {
	
	
	public void salidaDatos(String nombre,String [] asignatura,int [] nota) {
		System.out.printf("NOMBRE: %s",nombre);
		System.out.printf("\n\n");
		System.out.printf("A S I G N A T U R A   Y   N O T A S \n");
		for(int i=0;i<asignatura.length;i++) {
			System.out.printf("\n");
			System.out.printf("%s",asignatura[i]);
			System.out.printf("		%d",nota[i]);
		}
	Element raiz = new Element ("Notas");
	Document documento = new Document(raiz);
	
	Element estudiante = new Element("Estudiante");
	estudiante.addContent(new Element("Nombre").addContent(nombre));
	for(int i=0;i<asignatura.length;i++) {
	estudiante.addContent(new Element(asignatura[i].substring(0, 4)).addContent(String.valueOf(nota[i])));	
	}
	raiz.addContent(estudiante);
	XMLOutputter salida=new XMLOutputter();
	try {
		FileWriter fw=new FileWriter(new File("notas.xml"));
		salida.output(documento, fw);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.println("Error al crear el archivo XML "+e.getMessage());
	}	
	}
	
	
	
	
	
	
}
