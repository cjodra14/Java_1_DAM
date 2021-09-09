package ventas;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Total {

	public static void main(String[] args) {
		int totalkg=0;
		int kgnoveno=0;
		// TODO Auto-generated method stub
		
		ArrayList<Venta> ventas =new ArrayList(); 
		
		File fichero = new File("ventas.txt");
		Scanner s=null;
		try{
			s = new Scanner(fichero);
			
			while (s.hasNextLine()) {
				String linea = s.nextLine();
				String [] cortesString= linea.split("\t");
				Venta venta= new Venta();
				venta.setVendedor(Integer.parseInt(cortesString[0]));
				venta.setProd(Integer.parseInt(cortesString[1]));
				venta.setKilos(Integer.parseInt(cortesString[2]));
				
				ventas.add(venta);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
				if (s != null) {
					s.close();}  
		}
		
		System.out.println("número de lineas en la tabla de ventas: "+ventas.size());
		
		Iterator<Venta> iter= ventas.iterator();
		while (iter.hasNext()) {
			int aux;
			Venta venta = iter.next();
			totalkg=totalkg+venta.getKilos();
			
			if(9==venta.getProd()) {
				
				kgnoveno=kgnoveno+venta.getKilos();
			}
			
		}
		System.out.println("... total de kilos  ... "+totalkg);
		System.out.println("Los kilos comprados del producto 9 son:  "+kgnoveno);
	}

}
