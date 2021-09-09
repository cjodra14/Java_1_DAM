package datosbanco;

public class Banco {
	private Cliente cl1;
	private Cliente cl2;
	private Cliente cl3;
	
	Banco(){
		cl1=new Cliente("Jose");
		cl2=new Cliente("Juan");
		cl3=new Cliente("Pedro");
	}
	
	void operar() {
		cl1.ingresar(1500.0F);
		cl2.ingresar(700.0F);
		cl1.extraer(110.0F);
		cl3.ingresar(135.54F);
		cl2.extraer(250.0F);
		
	}
	
	void visualizar() {
		float saldoTotal=0;
		cl1.visu();
		cl2.visu();
		cl3.visu();
		System.out.println("El total del dinero es de: "+(cl1.getSaldo()+cl2.getSaldo()+cl3.getSaldo())+"€");
		//System.out.println("El total del dinero es de: "+saldoTotal+ "€");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Banco bc=new Banco();
			bc.operar();
			bc.visualizar();

	}

}
