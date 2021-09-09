package pruebaarrays;
import java.util.Scanner;

public class TestArrayBidimensional {
	Scanner src=new Scanner(System.in);
	int a=3, b=5;
	int [] [] matriz= {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};/*new int[a][b];*/
	                          
	
	void teclear() {
		for(int x=0;x<matriz.length;x++) {
			for(int i=0;i<matriz[x].length;i++) {
				System.out.println("Teclea un numero para la posición"+x+" "+i);
				matriz[x][i]=src.nextInt();
				
			}
		}
	}
		void visu() {
			for(int x=0;x<matriz.length;x++) {
				for(int i=0;i<matriz[x].length;i++) {
					System.out.println("El numero en la posición "+x+" "+i+" es :"+matriz[x][i]);
				}
			}
	}
		int suma() {
			int suma=0;
			for(int x=0;x<matriz.length;x++) {
				for(int i=0;i<matriz[x].length;i++) {
					suma=suma+matriz[x][i];
				}
			}
			
			return suma;
		}
		void verSuma(int suma) {
			System.out.println("La suma de todos es: "+suma);
		}
		
		void multiplicar(int elementos) {
			int multiplicacion=1;
			boolean fin=false;
			//int x=elementos/b;
			int i=a;
			int w=b;
			int cont=0, primerfor=1, segundofor=1;
			
			if(elementos>(a*b)){
				System.out.println("No es posible, hay mas elementos que numeros");
			}else {
			
			
				for(int z=0;z<i && !fin;z++) {
					System.out.println("Ha pasado por aqui por "+primerfor+" vez");
					for(int t=0;t<w && !fin;t++) {
						if(cont<elementos) {
						multiplicacion=multiplicacion*matriz[z][t];
						cont++;}
						else {
							fin=true;
							//i=0;
							//w=0;
						}
						
						System.out.println("Ha pasado por aqui por el segundo for por "+segundofor+" vez");
						segundofor++;
					}
					primerfor++;
			}
				System.out.println("La multiplicacion da: "+multiplicacion);
			}
		}
		
		void verDiagonal() {
			for(int x=0;x<matriz.length;x++) {
				//for(int i=x;i==x;i++) {
					System.out.println(matriz[x][x]);
				//}
			}
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int suma;
		TestArrayBidimensional obj=new TestArrayBidimensional();
		//obj.teclear();
		obj.visu();
		suma=obj.suma();
		obj.multiplicar(3);
		obj.verSuma(suma);
		obj.verDiagonal();

	}

}
