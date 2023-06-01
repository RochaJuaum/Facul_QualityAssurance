package ExerciciosFaccat;

import java.util.Scanner;

public class Ex21Faccat {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual a hora de inicio do jogo?");
		int inicio = sc.nextInt();
		System.out.println("Qual a hora do termino?");
		int fim = sc.nextInt();
		
		int duracao = 0;
		
		if (inicio == fim) {
			duracao = 24;
			System.out.println("O jogo teve o total de "+ duracao +" horas");
		}
		else if (inicio > fim) {
			duracao = (inicio - 24 ) * -1 + fim;
			System.out.println("O jogo teve o total de "+ duracao +" horas");
		}
		else if (inicio < fim) {
			duracao = ((inicio + fim) - 24) * -1;
			System.out.println("O jogo teve o total de "+ duracao +" horas");
		}
		else {
			System.out.println("Ocorreu um erro!!");
		}
		
	}
}
