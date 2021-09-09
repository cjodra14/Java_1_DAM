package coches.facturacion;

public class Coche {
	String matricula;
	String marca;
	String modelo;
	int precioBase;
	
	Coche(){
		
	}
	Coche(String mat, String marca, String mod, int precio){
		matricula=mat;
		this.marca=marca;
		modelo=mod;
		precioBase=precio;
	}
	Coche(String mat, int precio){
		matricula=mat;
		precioBase=precio;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getPrecioBase() {
		return precioBase;
	}
	public void setPrecioBase(int precioBase) {
		this.precioBase = precioBase;
	}
	float precioColor(String color) {
		float importe;
		switch(color) {
		case "blanco":
			importe=precioBase;
			break;
		case "rojo": case "verde": case "azul":
			importe=precioBase*1.05F;
			break;
		case "naranja": case "marron":
			importe=precioBase*1.1F;
			break;
		default:
			importe=precioBase*1.15F;
			break;
			
		
		}
		return importe;
	}
	void visualizarVehic(float importe) {
		System.out.println("El importe final del vehiculo, segun su color es: "+importe);
	}
	
	public static void main(String[] args) {
		float importe;
		Coche c1=new Coche("7172CVS","citroen","xsara picasso",13000);
		
		importe=c1.precioColor("rosa");
		c1.visualizarVehic(importe);
		System.out.println(c1.getClass().getSimpleName());
	}
}
