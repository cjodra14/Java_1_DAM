
public class EjercicioIfNatacion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte edad=16, lCurso, lRes;
		boolean cursoYaRealizado;
		
		
		
		//Preguntamos si es menor de 18 a�os
		if(edad<18) {
			System.out.println("NO EST� ADMITIDO AL CURSO");
			
		}
		else {
			cursoYaRealizado=false;
			//preguntamos si es mayor de 30 y si no ha realizado el curso
			if(edad<=30&&cursoYaRealizado==false) {
				//preguntamos si ya ha realizado el curso
					System.out.println("SI, PUEDE REALIZAR EL CURSO DE NATACI�N");
				
			}
			else {
				//preguntamos si ya ha realizado el curso
				if(edad>30&&cursoYaRealizado==true)	{
					
					lCurso=7;
					lRes=7;
					//preguntamos si el lugar del curso y el de residencia son el mismo
					if(lCurso==lRes) {
						System.out.println("SI, PUEDE REALIZAR EL CURSO DE NATACI�N");
					}
					else {
						System.out.println("NO EST� ADMITIDO");
					}
				}
				else {
					System.out.println("NO EST� ADMITIDO AL CURSO");
				}
				
			}
		}
	}

}
