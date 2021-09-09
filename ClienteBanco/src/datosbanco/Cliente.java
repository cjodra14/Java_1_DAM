package datosbanco;

public class Cliente {
	private String nombre;
	private float saldo;
		public Cliente() {
			
		}
	
		public Cliente(String nombre) {
			this.nombre=nombre;
			saldo=0;
		}
		//La diferencia es que no podemos acceder directamente sin crear
		void ingresar(float ingreso) { //No afecta, porque estamos creando un objeto de Clase cliente
			saldo+=ingreso;
		}
		void extraer(float extrae) {
			saldo-=extrae;
		}
		
		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public float getSaldo() {
			return saldo;
		}

		public void setSaldo(float saldo) {
			this.saldo = saldo;
		}

		void visu() {
			System.out.println("> El cliente "+nombre+" tiene "+saldo+"€ de saldo.");
		}

}
