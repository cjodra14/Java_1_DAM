import java.sql.*; 
public class Ejer1Oracle {
  static public void main( String[] args ) 
  {
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
   try {
	      System.out.println( "Seleccionando..." );
	     sentencia = conn.createStatement();
	      resultado = sentencia.executeQuery("SELECT nombre_e,provincia  FROM empresas ");
	      //Se recorren las filas retornadas
	  
	   while(resultado.next()){
		System.out.print( "nombre: "+resultado.getString(1));//getString(“nombre”)
		System.out.println( "  provincia:  "+resultado.getString(2));
//para numéricos existen: getInt(“salario”), getFloat(“salario”), getFloat(3),…
	      }	      
	    
	      conn.close(); //Cierre de la conexión
   } catch( SQLException e ){       
            System.out.println("Error: " + 
             e.getMessage());
     }            
   System.out.println("Consulta finalizada.");
 } //Fin del main
} //Fin de la clase
