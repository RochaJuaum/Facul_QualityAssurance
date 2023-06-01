package ExerciciosFaccat;

import java.util.Scanner;

public class Ex23Faccat {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual seu nome ?");
		String nome = sc.next();
		System.out.println("Qual sua altura ?");
		double altura = sc.nextFloat();
		System.out.println("Qual seu sexo?");
		char sexo = sc.next().charAt(0);
		
		double pesoIdeal = 0.0;
		
		if (sexo == 'm' || sexo == 'M') {
			pesoIdeal = 72.7 * altura - 58;
			System.out.println(nome +" seu peso ideal é " +pesoIdeal +" Kg");
		}
		else if ((sexo == 'f') || (sexo == 'F')) {
			pesoIdeal = 62.1 * altura - 44.7;
			System.out.println(nome +" seu peso ideal é " +pesoIdeal +" Kg");
		}
		else {
			System.out.println("Caractere inválido!!!!");
		}
		
		
		
		
	}
}
