package ExerciciosFaccat;

import java.util.Scanner;
 
public class Ex18Faccat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe seu ano de nascimento :");
		int idade = sc.nextInt();
		
		idade = 2023 - idade;
		
		if (idade > 16) {
			System.out.println("Você já pode votar!");
		}
		else {
			System.out.println("Você ainda não pode votar!");
		}
		
		

	}

}
