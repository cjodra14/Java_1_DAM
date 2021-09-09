
public class EjercicioIfNatacion {

	public static void main(String[] args) {
		byte edad=10, lugarCurso, lugarResidencia;
		boolean cursoYaRealizado;
		
		
		
		//Preguntamos si es menor de 18 años
		if(edad<18) {
			System.out.println("NO ESTÁ ADMITIDO AL CURSO");
			
		}
		else {
			cursoYaRealizado=false;
			//preguntamos si es mayo de 30
			if(edad<=30) {
				//preguntamos si ya ha realizado el curso
				if(cursoYaRealizado==false) {
					System.out.println("SI, PUEDE REALIZAR EL CURSO DE NATACIÓN");
				}
				else {
					System.out.println("NO ESTÁ ADMITIDO AL CURSO");
				}
				
			}
			else {
				//preguntamos si ya ha realizado el curso
				if(cursoYaRealizado==false)	{
					System.out.println("NO ESTÁ ADMITIDO AL CURSO");
				}
				else {
					lugarCurso=7;
					lugarResidencia=7;
					//preguntamos si el lugar del curso y el de residencia son el mismo
					if(lugarCurso==lugarResidencia) {
						System.out.println("SI, PUEDE REALIZAR EL CURSO DE NATACIÓN");
					}
					else {
						System.out.println("NO ESTÁ ADMITIDO");
					}
				}
				
			}
		}

	}

}
