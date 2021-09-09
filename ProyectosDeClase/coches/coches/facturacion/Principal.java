package coches.facturacion;

public class Principal {

	public static void main(String[] args) {
		float importe;
		
		Vendedor vend1=new Vendedor("67357902K","Juan",(byte)1,1200.7F);
		Vendedor vend2=new Vendedor("35557989K","Amaia",(byte)2,1500.7F);
		vend1.visualizar();
		vend2.visualizar();
		Coche car1=new Coche("7172CVS","Citroen","xsara picasso",2500);
		Coche car2=new Coche("BI6802CD","Opel","Vectra",1000);
		Coche car3=new Coche("0937CCR","Renault","trafic",3500);
		Coche car4=new Coche("5872LDS","Honda","CB650R",7100);
		Coche car5=new Coche("8770CCP","Honda","VFR 800 V-tec",2900);
		importe=car1.precioColor("gris");
		car1.visualizarVehic(importe);
		importe=car2.precioColor("gris");
		car2.visualizarVehic(importe);
		importe=car3.precioColor("amarillo");
		car3.visualizarVehic(importe);
		importe=car4.precioColor("rojo");
		car4.visualizarVehic(importe);
		importe=car5.precioColor("gris");
		car5.visualizarVehic(importe);
		Cliente client1=new Cliente("1646316A","Andoni",657896123, 'b');
		Cliente client2=new Cliente("2164661F","Iker",657567123, 'b');
		Cliente client3=new Cliente("1648466A","Alain",657884266, 'a');
		Compra comp1=new Compra(vend1, car4, client1, (byte)20,(byte)10,(byte)20);
		Compra comp2=new Compra(vend1, car1, client3, (byte)20,(byte)10,(byte)20);
		Compra comp3=new Compra(vend2, car2, client2, (byte)20,(byte)10,(byte)20);
		Compra comp4=new Compra(vend2, car3, client3, (byte)20,(byte)10,(byte)20);
		Compra comp5=new Compra(vend2, car5, client1, (byte)20,(byte)10,(byte)20);
		comp1.visualizar();
		comp2.visualizar();
		comp3.visualizar();
		comp4.visualizar();
		comp5.visualizar();
	}

}
