package club;

public class Equipo {
	String [] equipos = new String[5];
	Club cl;

	public String[] getEquipos() {
		return equipos;
	}
	public void setEquipos(String[] equipos) {
		this.equipos = equipos;
	}
	public Club getCl() {
		return cl;
	}
	public void setCl(Club cl) {
		this.cl = cl;
	}
	Equipo(){}
	public Equipo(String equipo1, String equipo2, String equipo3, String equipo4, String equipo5,Club cl){
		equipos[0]=equipo1;
		equipos[1]=equipo2;
		equipos[2]=equipo3;
		equipos[3]=equipo4;
		equipos[4]=equipo5;
		this.cl=cl;
	}
	public Equipo(String[] equipos, Club cl){
		this.equipos=equipos;		
		this.cl=cl;
	}
	public void visualizar() {
		System.out.println("El club: "+cl.getNombre()+" teléfono: "+cl.getTelefono()+" tiene los siguientes equipo:");
		System.out.print(equipos[0]);for (int i = 1; i <equipos.length; i++) {
			if (equipos[i] != null) {System.out.print(", "+equipos[i]);
		}}
		System.out.println();
	}


}
