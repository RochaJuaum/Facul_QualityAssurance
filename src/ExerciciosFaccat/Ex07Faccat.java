package ExerciciosFaccat;

import java.util.Scanner;

public class Ex07Faccat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	System.out.println("Qual sua idade em:");
	System.out.print("Anos: ");
	int anos = sc.nextInt();
	System.out.print("Meses: ");
	int meses = sc.nextInt();
	System.out.print("Dias: ");
	int dias = sc.nextInt();
	
	dias = (anos*365)+(meses*30)+dias;
			
	System.out.println("Você tem no total "+dias+" dias de idade");
	}

}
