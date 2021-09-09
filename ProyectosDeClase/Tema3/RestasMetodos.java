
public class RestasMetodos {
	int acum;
		void restar(int i, int j){
			acum=i-j;
		}
		void visualizar() {
			System.out.println(acum);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestasMetodos resta=new RestasMetodos();
		resta.restar(6,3);
		resta.visualizar();
		
		
	}

}
