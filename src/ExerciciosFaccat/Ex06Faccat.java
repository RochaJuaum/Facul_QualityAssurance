package ExerciciosFaccat;

import java.util.Scanner;

public class Ex06Faccat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o tamanho base do retângulo: ");
		int base = sc.nextInt();
		System.out.println("Qual a altura do retângulo:");
		int altura = sc.nextInt();
		
		int area = base*altura;
		
		System.out.println("A area do retângulo é " +area);
	}

}
