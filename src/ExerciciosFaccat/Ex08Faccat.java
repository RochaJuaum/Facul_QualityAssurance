package ExerciciosFaccat;

import java.util.Scanner;

public class Ex08Faccat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o número de votos em branco: ");
		int brancos = sc.nextInt();
		System.out.print("Digite o número de votos nulos: ");
		int nulos = sc.nextInt();
		System.out.print("Digite o número de votos válidos: ");
		int validos = sc.nextInt();
		
		int totalVotos = brancos+nulos+validos;
		
		System.out.println("Foram um total de "+totalVotos+" Votos");
		System.out.println(brancos*100/totalVotos +"% dos votos foram em branco");
		System.out.println(nulos*100/totalVotos +"% dos votos foram nulos");
		System.out.println(validos*100/totalVotos +"% dos votos foram válidos");
	}

}
