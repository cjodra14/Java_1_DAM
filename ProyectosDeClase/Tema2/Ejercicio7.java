import java.util.Scanner;
public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src=new Scanner(System.in);
		byte dia, mes;
		
		System.out.println("Introduce el dia numericamente");
		dia=src.nextByte();
		
		if(1<=dia&&dia<=31) { //comprueba que el dia introducido esté entre el 1 y el 31
			
			System.out.println("Introduce el mes numericamente");
			mes=src.nextByte();
			
			if(1<=mes&&mes<=12) { //Comprueba que el mes introducido este entre el 1 y el 12
				
				if((dia>=22&&mes==12)|(dia<=20&&mes==1)) {
					System.out.println("Tu signo del zodiaco es: Capricornio");
					
				}
				else {
					if((dia>=21&&mes==1)|(dia<=19&&mes==2)) {
						System.out.println("Tu signo del zodiaco es: Acuario");
					}
					else {
						if((dia>=20&&mes==2)|(dia<=20&&mes==3)) {
							System.out.println("Tu signo del zodiaco es: Piscis");
					}
						else {
							if((dia>=21&&mes==3)|(dia<=20&&mes==4)) {
								System.out.println("Tu signo del zodiaco es: Aries");
								
							}
							else {
								if((dia>=21&&mes==4)|(dia<=21&&mes==5)) {
									System.out.println("Tu signo del zodiaco es: Tauro");
								}
								else {
									if((dia>=22&&mes==5)|(dia<=21&&mes==6)) {
										System.out.println("Tu signo del zodiaco es: Geminis");
										
									}
									else {
										if((dia>=22&&mes==6)|(dia<=23&&mes==7)) {
											System.out.println("Tu signo del zodiaco es: Cancer");
											
										}
										else {
											if((dia>=24&&mes==7)|(dia<=23&&mes==8)) {
												System.out.println("Tu signo del zodiaco es: Leo");
												
											}
											else {
												if((dia>=24&&mes==8)|(dia<=23&&mes==9)) {
													System.out.println("Tu signo del zodiaco es: Virgo");
												}
												else {
													if((dia>=24&&mes==9)|(dia<=23&&mes==10)) {
														System.out.println("Tu signo del zodiaco es: Libra");
													}
													else {
														if((dia>=24&&mes==10)|(dia<=22&&mes==11)) {
															System.out.println("Tu signo del zodiaco es: Escorpio");
														}
														else {
															System.out.println("Tu signo del zodiaco es: Sagitario");
														
															
														}
													}
												}
												
											}
										}
									}
								}
								
							}
							
						}
					}	
				}
			}
			else {
				 System.out.println("Los meses solo pueden ir del 1 al 12");
			}
		}
		else {
			 System.out.println("Los dias solo pueden ir del 1 al 31");
		}
			
		

	}

}
