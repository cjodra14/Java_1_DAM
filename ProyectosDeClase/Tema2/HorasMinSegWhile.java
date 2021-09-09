
public class HorasMinSegWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int h=0, m, s; //Declaramos las variables
		
		while(h<2) {
			m=0;
			while(m<60) {
				s=0;
				while(s<60) {
					System.out.println(h+":"+m+":"+s);
					s++;
				}
				m++;
			}
			h++;
		}
		
	}

}
