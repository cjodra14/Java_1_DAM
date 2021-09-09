package pruebaarrays;
import java.lang.Math;

public class Ejer7Arrays {
int n []=new int[7];

	void rellenar() {
		for(int i=0;i<n.length;i++) {
			n[i]=(int)(Math.random()*101);
		}
		for(int i=0;i<n.length;i++) {
			System.out.println(n[i]);
		}
			
	}

	void burbuja() {
		int save;
		for(int i=0;i<n.length-1;i++) {
			
			for(int y=0;y<n.length-i-1;y++) {
					if(n[y+1]<n[y]) { // compara si 
						save=n[y+1];
						n[y+1]=n[y];
						n[y]=save;
					}
					
					//Esta parte nos visualiza cada vez que entra en el segundo for
					for(int x=0;x<n.length;x++) {
						System.out.println(n[x]);
					}
					System.out.println();
			
				}
		
			}
		}
	void visu() {
		for(int i=0;i<n.length;i++) {
			System.out.println(n[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejer7Arrays ob=new Ejer7Arrays();
		ob.rellenar();
		System.out.println();
		ob.burbuja();
		ob.visu();

	}

}
