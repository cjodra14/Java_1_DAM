package pruebaarrays;

public class Ejer5Arrays {
	final int NUMARRAY=12;
	double[]i=new double[NUMARRAY];
	
	Ejer5Arrays() {
		
	}
//rellena la media de cada alumno 
	void rellenarAlumnos() {
		for(int n=0;n<i.length;n++) {
			i[n]=((Math.random())*11);
			//esta parte calcula si la nota aleatoria es mayor a 10 la redondea a 10
			if(i[n]>10) {
				i[n]=10;
			}
		}
	}
	//visualiza la nota media de cada alumno
	void visuMediaAlum() {
		for(int n=0;n<i.length;n++) {
			System.out.print("La nota media del alumno "+(n+1)+" es un: ");
			System.out.printf("%.2f",((float)(i[n]))); //Aqui para darle formato se ha tenido que hacer un cast, el formato cientifico tiene mantisa
			System.out.println();
		}
	}
	//hace el calculo de la mañana
	float calcMediaMan() {
		float media = 0;
		for(int n=0;n<8;n++) {
			media=(float) (media+(i[n]));
		}
		media=media/8;
		return media; 
	}
	//visualiza media de la mañana
	void visuMediaMan(float media) {
		
			System.out.print("La nota media de los alumnos de la mañana es: ");
			System.out.printf("%.2f",(media));
			System.out.println();

	}
	//calcula la media de la tarde
	float calcMediaTarde() { //se usa un metodo que retorna
		float media = 0;
		for(int n=8;n<i.length;n++) {
			media=(float) (media+(i[n]));
		}
		media=media/5;
		return media; 
	}
	//visualiza la media de la tarde
	void visuMediaTarde(float media) { //se usa un metodo que recibe
		
			System.out.print("La nota media de los alumnos de la tarde es: ");
			System.out.printf("%.2f",(media)); //da formato con el printf a 2 decimales el valor que recibe por media
			System.out.println();

	}
	
	//calcula la media total del centro
	float calcMediaTotal() {
		float media = 0;
		for(int n=0;n<i.length;n++) {
			media=(float) (media+(i[n]));
		}
		media=media/i.length;
		return media; 
	}
	//Visualiza la media del centro
	void visuMediaTotal(float media) {
		
			System.out.print("La nota media de los alumnos del centro es: ");
			System.out.printf("%.2f",(media));
			System.out.println();

	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float mediaMan,mediaTarde,mediaTotal;
		Ejer5Arrays ob=new Ejer5Arrays();
		ob.rellenarAlumnos();
		ob.visuMediaAlum();
		System.out.println();
		mediaMan=ob.calcMediaMan();
		ob.visuMediaMan(mediaMan);
		System.out.println();
		mediaTarde=ob.calcMediaTarde();
		ob.visuMediaTarde(mediaTarde);
		System.out.println();
		mediaTotal=ob.calcMediaTotal();
		ob.visuMediaTotal(mediaTotal);

	}
}
