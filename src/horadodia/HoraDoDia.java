package horadodia;

import java.util.Scanner;

public class HoraDoDia {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);	
		
		Integer hora = 12;
		
		
		System.out.println("Quantas horas ?");
				
		hora = sc.nextInt();
		
		if(hora < 12) {
			System.out.println("BOM DIA");
		}		
		else if(hora >=  18) {
			System.out.println("BOA NOITE");
		}else {
			System.out.println("BOA TARDE");
			
		}
			
	}

}
