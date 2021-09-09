package club;

public class Club {
	private String codigo;
	private String nombre;
	private String sedeSocial;
	private int telefono;
	private String email;
	private short anyo;	
	Club(){}

	public Club(String codigo, String nombre, String sedeSocial, int telefono, String email, short anyo) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.sedeSocial = sedeSocial;
		this.telefono = telefono;
		this.email = email;
		this.anyo = anyo;
	}

	public Club(String nombre, short anyo) {
		super();
		this.nombre = nombre;
		this.anyo = anyo;
	}

	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSedeSocial() {
		return sedeSocial;
	}
	public void setSedeSocial(String sedeSocial) {
		this.sedeSocial = sedeSocial;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public short getAnyo() {
		return anyo;
	}
	public void setAnyo(short anyo) {
		this.anyo = anyo;
	}
	public void visualizar() {
		System.out.println("El club de rugby llamado: "+nombre+" se fundó en  el año: "+anyo);
	}


}
