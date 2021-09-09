import java.util.Scanner;
public class cincoNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src=new Scanner(System.in);
		int num1=0, num2=0, num3=0, num4=0, num5=0;
		byte i=0;
		
		/*
		while(i<5) {
			if(i==0) {
				System.out.println("teclea el primer numero");
				num1=src.nextInt();
				
			}else {
				if(i==1) {
					System.out.println("teclea el segundo numero");
					num2=src.nextInt();
				}else {
					if(i==2) {
						System.out.println("teclea el tercer numero");
						num3=src.nextInt();
					}else {
						if(i==3) {
							System.out.println("teclea el cuarto numero");
							num4=src.nextInt();
						}else {
							System.out.println("teclea el quinto numero");
							num5=src.nextInt();
						}
					}
				}
			}
			i++;
		}
*/
		
/*		
		
		do {
			if(i==0) {
				System.out.println("teclea el primer numero");
				num1=src.nextInt();
				
			}else {
				if(i==1) {
					System.out.println("teclea el segundo numero");
					num2=src.nextInt();
				}else {
					if(i==2) {
						System.out.println("teclea el tercer numero");
						num3=src.nextInt();
					}else {
						if(i==3) {
							System.out.println("teclea el cuarto numero");
							num4=src.nextInt();
						}else {
							System.out.println("teclea el quinto numero");
							num5=src.nextInt();}}}}
		i++;
		}while(i<5);
		
*/
		
		for(i=0;i<5;i++) {
			if(i==0) {
				System.out.println("teclea el primer numero");
				num1=src.nextInt();
				
			}else {
				if(i==1) {
					System.out.println("teclea el segundo numero");
					num2=src.nextInt();
				}else {
					if(i==2) {
						System.out.println("teclea el tercer numero");
						num3=src.nextInt();
					}else {
						if(i==3) {
							System.out.println("teclea el cuarto numero");
							num4=src.nextInt();
						}else {
							System.out.println("teclea el quinto numero");
							num5=src.nextInt();}}}}
		}
		System.out.println(num1+num2+num3+num4+num5);
	}

}
