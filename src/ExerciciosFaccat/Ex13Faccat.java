package ExerciciosFaccat;

import java.util.Scanner;

public class Ex13Faccat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota: ");
		float n1 = sc.nextFloat();
		System.out.print("Digite a segunda nota: ");
		float n2 = sc.nextFloat();
		System.out.print("Digite a terceira nota: ");
		float n3 = sc.nextFloat();
		
		float mediaFinal = (n1*2+n2*3+n3*5)/10;
		
		System.out.println("A nota do aluno é: "+mediaFinal);
		
		
		
		
		
		
	}
	
}
