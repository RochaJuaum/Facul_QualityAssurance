package ExerciciosFaccat;

import java.util.Scanner;

public class Ex27Faccat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		float n1 = sc.nextFloat();
		
		if (n1==0.0) {
			System.out.println("O número é igual a zero");
		}
		else if (n1>0.0){
			System.out.println("O número é positivo");
		}
		else {
			System.out.println("O número é negativo");
		}
		
		
		
		
	}

}
