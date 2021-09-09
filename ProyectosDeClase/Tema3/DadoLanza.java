
public class DadoLanza {
	int tirada, alberto=0;
	void lanzam() {
		for(int i=0;i<20;i++) {
			tirada=(int)(Math.random()*6);
			alberto++;
			System.out.print("En la tirada "+alberto+" ha salido el numero: ");
			switch(tirada) {
			case 0:
				System.out.println("1");
			break;
			case 1:
				System.out.println("2");
				break;
			case 2:
				System.out.println("3");
				break;
			case 3:
				System.out.println("4");
				break;
			case 4:
				System.out.println("5");
				break;
			case 5:
				System.out.println("6");
				break;
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DadoLanza obj=new DadoLanza();
		obj.lanzam();

	}

}
