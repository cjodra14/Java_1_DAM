import java.util.*;
public class Ejer18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src=new Scanner(System.in);
		int i, n1=0, n2=1, n=1, num;
		
		System.out.println("Teclea cuantos numeros quieres:");
		num=src.nextInt();
		
		for(i=1;i<=num;i++) {
			if(i<num) {
				
			
				System.out.print(n+",");
			n=n1+n2;
			n1=n2;
			n2=n;
			} else {
				System.out.print(n);
			}
				
				
			}
			
			
			
		
		
		
		

	}

}
