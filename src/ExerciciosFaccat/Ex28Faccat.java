package ExerciciosFaccat;

import java.util.Scanner;

public class Ex28Faccat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int maior;
		
		System.out.print("Digite um número: ");
		int n1 = sc.nextInt();
		System.out.print("Digite um número: ");
		int n2 = sc.nextInt();
		System.out.print("Digite um número: ");
		int n3 = sc.nextInt();
		
		if (n1 > n2) {
			if (n1 > n3) {
				maior = n1;
			}
			else {
				maior = n3;
			}
		}
		else {
			if (n2 > n3) {
				maior = n2;
			}
			else {
				maior = n3;
			}
		}
		
		System.out.println("o maior número é " +maior);		
	}

}
