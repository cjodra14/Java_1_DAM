package conexion;

import java.sql.*;

public class Conexion {
	String driver;
	String hostPortId;
	String user;
	String pass;
	Connection conexion;
	Statement sentencia;
	
	public Conexion() {
		
	}
	public Conexion(String driver, String hostPortId, String user, String pass) {
		super();
		this.driver = driver;
		this.hostPortId = hostPortId;
		this.user = user;
		this.pass = pass;
	}
	public Conexion(String user, String pass) {
		super();
		this.user = user;
		this.pass = pass;
		driver="oracle.jdbc.OracleDriver";
		hostPortId="@localhost:1521:xe";
	}
	
	public void cargarDriver() {
		try {
			Class.forName(driver);
			System.out.println("Driver cargado correctamente");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Error al cargar el driver"+e.getMessage());
		}
	}
	
	public void conectar() {
		try {
			conexion=DriverManager.getConnection("jdbc:oracle:thin:"+hostPortId,user,pass);
			sentencia= conexion.createStatement();
			System.out.println("Conexi�n realizada con exito");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error en la conexi�n"+e.getMessage());
		}
	}
	
	public void crearTabla(String crearTabla) {
		try {
			sentencia.execute(crearTabla);
			System.out.println("Tabla creeada con exito");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error al crear la tabla"+e.getMessage());
		}
	}
	public int actualizarDatos(String sentActualizarDatos) {
		int filasActualizadas=0;
		try {
			filasActualizadas = sentencia.executeUpdate(sentActualizarDatos);
			System.out.println("Datos actualizados con exito");
		} catch (SQLException e) {
			System.out.println("Error al actualizar los datos "+e.getMessage());
		}
		return filasActualizadas;		
	}
	
	public void cerrarConexion() {
		try {
			conexion.close();
			System.out.println("Conexi�n cerrada");
		} catch (SQLException e) {
			System.out.println("Error al cerrar la conexion"+e.getMessage());
		}
	}
	
	
	
	

}
