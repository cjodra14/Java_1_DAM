package barcos1;

import java.sql.*;

public class Barco {
	
	String strcon;
	String hostPortId;
	String user;
	String pass;
	
	Connection conexion;
	Statement sentencia;
	ResultSet resultadoSentencia;
	
	Barco(){
		
	}
	public Barco(String strcon, String hostPortId,String user, String pass){
		this.strcon=strcon;
		this.hostPortId=hostPortId;
		this.user=user;
		this.pass=pass;
	}
	public Barco(String user, String pass){
		this.user=user;
		this.pass=pass;
		strcon="oracle.jdbc.OracleDriver";
		hostPortId="@localhost:1521:xe";
		
	}
	
	public String getStrcon() {
		return strcon;
	}
	public void setStrcon(String strcon) {
		this.strcon = strcon;
	}
	public String getHostPortId() {
		return hostPortId;
	}
	public void setHostPortId(String hostPortId) {
		this.hostPortId = hostPortId;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public Connection getConexion() {
		return conexion;
	}
	public void setConexion(Connection conexion) {
		this.conexion = conexion;
	}
	public Statement getSentencia() {
		return sentencia;
	}
	public void setSentencia(Statement sentencia) {
		this.sentencia = sentencia;
	}
	public ResultSet getResultadoSentencia() {
		return resultadoSentencia;
	}
	public void setResultadoSentencia(ResultSet resultadoSentencia) {
		this.resultadoSentencia = resultadoSentencia;
	}
	
	public void cargarDriver() {
		System.out.println( "Conexión a la base de datos..." );
		try {
			Class.forName(strcon);
			System.out.println("Driver cargado con exito");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println( "No se pudo cargar el driver JDBC");
			return;
		}
	}
	public void conectar1() {
		try{ // Se establece la conexión con la base de datos
	        conexion = DriverManager.getConnection  ("jdbc:oracle:thin:"+hostPortId, user, pass);
	        System.out.println("Exito al conectar con la base de datos");
	        sentencia=conexion.createStatement();
	      } catch( SQLException e ) {
	        System.out.println( "No hay conexión con la base de datos." );
	        return;
	        }
	}
	public void conectar2() throws SQLException {
		conexion = DriverManager.getConnection ("jdbc:oracle:thin:"+hostPortId, user, pass);
		sentencia=conexion.createStatement();
	}
	public void cerrarConexion() throws SQLException {
		conexion.close();
	}
	
	public ResultSet consulta(String consulta) {
		
		try {
			resultadoSentencia=sentencia.executeQuery(consulta);
			System.out.println("Consulta realizada");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error al realizar la consulta");
		}
		return resultadoSentencia;
		
	}
	
	public int actualizar(String consultaActualizar) {
		int filasModificadas=0;
		try {
			filasModificadas=sentencia.executeUpdate(consultaActualizar);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error al actualizar los datos");
		}
		return filasModificadas;
	}
	
	public void borrar(String borrarDato) throws SQLException {		
		sentencia.executeUpdate(borrarDato);
	}
	public void insertar(String insertarDato) throws SQLException {
		sentencia.executeUpdate(insertarDato);
	}
	
	public void crear(String crearTabla) throws SQLException {	
		sentencia.execute(crearTabla);	
	}
	
	
}
