package ExerciciosFaccat;

import java.util.Scanner;

	
public class Ex17Faccat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite a nota 1 do aluno :");
		int n1 = sc.nextInt();
		
		System.out.println("Digite a nota 2 do aluno :");
		int n2 = sc.nextInt();
		
		int media = (n1+n2)/2;
		
		System.out.println("A média do aluno é " +media);
		
		if (media >= 6) {
			System.out.println("O aluno foi aprovado");
		}
		else {
			System.out.println("O aluno foi reprovado");
		}
	}

}
