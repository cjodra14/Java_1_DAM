import java.sql.*; 

public class Ejer10Oracle6 {
	
	public class Ventas{
		int anyo;
		String codigo;
		float saldo;
		Ventas(){
			
		}
	}
	static public void main( String[] args ) 
	  {
		String[] inserts= {"Insert into ventas values (2013,'1234',15.70)", "Insert into ventas values (2013,'1235',26.50)","Insert into ventas values (2014,'2234',56.12)", "Insert into ventas values (2015,'3234',89.12)","Insert into ventas values (2015,'3234',69.13)"};
	    Connection conn;
	    Statement sentencia;
	    ResultSet resultado;
	    System.out.println( "Conexión a la base de datos..." );
	    try{ // Se carga el driver JDBC-ODBC
	        Class.forName ("oracle.jdbc.OracleDriver"); 
	      } catch( Exception e ) {
	        System.out.println( "No se pudo cargar el driver JDBC");
	        return; //termina la ejecución del programa
	        }
	   try{ // Se establece la conexión con la base de datos
	        conn = DriverManager.getConnection  ("jdbc:oracle:thin:@localhost:1521:xe", "tema1", "tema1");
	         
	      } catch( SQLException e ) {
	        System.out.println( "No hay conexión con la base de datos." );
	        return;
	        } 
	   
// Hace los insert 	   
	   /*
	   try {
		   for (int j = 0; j < inserts.length; j++) {
			sentencia=conn.createStatement();
			sentencia.executeUpdate(inserts[j]);
			System.out.println("Datos insertados"+inserts[j] );
			sentencia.close();					
		}
		conn.close();	   			
	} catch (Exception e) {
		System.out.println("Error al introducir el dato en la tabla");
		e.printStackTrace();
	} */
	   
// Crea las tablas
	   /*try {
			sentencia=conn.createStatement();
			String sql="CREATE TABLE VENTAS (Anyo NUMBER(4,0) NOT NULL,COD VARCHAR2(20) NOT NULL ,Saldo FLOAT NOT NULL)";
			sentencia.execute(sql);
			sentencia.close();
			conn.close(); 
			System.out.println("Exito al crear la tabla");						
		} catch (SQLException e1) {
			e1.printStackTrace();
			System.out.println("Error al crear la tabla o la tabla ya existe");
		}	*/	
	  
// Visualizar las ventas del año 2013, 14 y 15 
	   try {
		   //for (int i = 2013; i < 2016; i++) {
			sentencia=conn.createStatement();
		   ResultSet rs=sentencia.executeQuery("select anyo,sum(saldo) from ventas group by anyo"); 
		   while(rs.next()) {
		   System.out.println("En el año "+rs.getString(1)+" el importe ha sido: "+rs.getString(2));
		   }
		   sentencia.close();
		//}	   
	} catch (Exception e) {
		e.printStackTrace();
		System.out.println("Error al realizar la consulta");
	}
	   
	   /*try {int cont=12;
		   for (int i = 2013; i < 2016; i++) {
			   
			sentencia=conn.createStatement();
			sentencia.execute("create table ventas"+cont+" as select * from ventas where anyo="+i);
			cont++;
			sentencia.close();
		}
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}*/
	   
	   
	 } //Fin del main
	} //Fin de la clase

