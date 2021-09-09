
public class Ecuacion {
	double a, b, c, resn, resp, raiz;

	Ecuacion(){
		a=1;
		b=3;
		c=6;
	}
	void oper() {
		raiz=(b*b)-(4*a*c);
		if(raiz<0) {
			System.out.println("Las raices son complejas");
		}else {
			raiz=Math.sqrt(raiz);
			resn=((-b-(raiz))/(2*a));
			resp=((-b+(raiz))/(2*a));
			
			
			System.out.println(resn);
			System.out.println(resp);
			
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ecuacion obj=new Ecuacion();
		obj.oper();

	}

}
