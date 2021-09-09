package barcos2;

import java.sql.ResultSet;
import java.sql.SQLException;

import barcos1.Barco;

public class BarcosMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ResultSet resultado;
		int filasModificadas;
		
		//Inicializamos la clase, cargamos los drivers y realizamos la conexion
		Barco barcoSQL = new Barco("tema2","tema2");
		barcoSQL.cargarDriver();
		barcoSQL.conectar1();
		
		//Creamos la tabla
		try { barcoSQL.
		  crear("CREATE TABLE barcos (id_barco number(4,0), nombre_barco varchar2(30), id_tipo number(4,0), dni_propietario varchar2(9), PRIMARY KEY (id_barco))"); 
		  System.out.println("Tabla creada con exito"); } 
		catch (SQLException e) {		
		  System.out.println("Erros al crear la tabla: "+e.getMessage()); 
		  }
		
		//Insertamos los datos de los barcos
		try {
		barcoSQL.insertar("INSERT INTO barcos VALUES (1 ,'Gaston', 7,'13697528G')");
		barcoSQL.insertar("INSERT INTO barcos VALUES (2 ,'Avispa', 2,'95736521K')");
		barcoSQL.insertar("INSERT INTO barcos VALUES (3 ,'Dominator', 1,'98256317A')");
		barcoSQL.insertar("INSERT INTO barcos VALUES (4 ,'Fisterre', 1,'26541138T')");
		System.out.println("Datos introducidos con exito");
		}catch (SQLException e) {
			// TODO: handle exception
			System.out.println("Error al introducir los datos:"+e.getMessage());
		}
		
		
		//Realizamos la consulta 
		resultado=barcoSQL.consulta("SELECT * FROM barcos");
		try {
			while(resultado.next()) {
				System.out.println("Id del barco: "+resultado.getInt(1));
				System.out.println("Nombre del barco: "+resultado.getString(2));
				System.out.println("Tipo de barco: "+resultado.getInt(3));
				System.out.println("DNI del propietario: "+resultado.getString(4));
				System.out.println("-----------------------------------------------------");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("La consulta es erronea o no tiene nada para mostrar"+e.getMessage());
		}
		
		//cambiar barcos de tipo 1 a tipo 10
		filasModificadas=barcoSQL.actualizar("UPDATE barcos SET id_tipo=10 where id_tipo=1");
		System.out.println("Se han actualizado "+filasModificadas+" registros");
		
		
		//Visualizar el numero de barcos por cada tipo
		resultado=barcoSQL.consulta("SELECT id_tipo, COUNT(*) FROM barcos GROUP BY id_tipo");
		try {
			while(resultado.next()) {
				System.out.println("Del barco tipo "+resultado.getInt(1)+" hay "+resultado.getInt(2)+" barcos.");
			}
		} catch (Exception e) {
			System.out.println("Fallo al realizar la consulta");
			// TODO: handle exception
		}
		
		
		//Eliminar un barco por ejemplo el que tenga id 2
		try {
			barcoSQL.borrar("DELETE FROM barcos where id_barco=1");
			System.out.println("Barco eliminado con exito");
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("Error al eliminar el barco "+e.getMessage());
		}
		
		//Cerramos la conexión
		
		try {
			barcoSQL.cerrarConexion();
			System.out.println("Conexión cerrada con exito");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Fallo al cerrar la conexión "+e.getMessage());
		}
		
		
		}
}
