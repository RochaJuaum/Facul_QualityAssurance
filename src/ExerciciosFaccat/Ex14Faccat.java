package ExerciciosFaccat;

import java.util.Scanner;

public class Ex14Faccat {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor Digite um número :");
		int num = sc.nextInt();
		
		if (num == 10) {
			System.out.println("O número Digitado é igual a 10!");
		}
		else if (num > 10) {
			System.out.println("O número digitado é maior que 10!");
		}
		else {
			System.out.println("O númeor digitado é menor que 10!");
		}
		
	}

}
