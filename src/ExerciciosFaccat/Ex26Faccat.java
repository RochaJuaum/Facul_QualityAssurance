package ExerciciosFaccat;

import java.util.Scanner;

public class Ex26Faccat {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);		
		
		System.out.println("Informe a quantidade atual em estoque :");
		int estoqueAtual = sc.nextInt();
		System.out.println("Informe a quantidade máxima do estoque :");
		int estoqueMaximo = sc.nextInt();
		System.out.println("Informe a quantidade mínima em que se deve ter em estoque :");
		int estoqueMinimo = sc.nextInt();
		
		int estoqueMedia = (estoqueMinimo + estoqueMaximo)/2;
		
		if (estoqueAtual >= estoqueMedia) {
			System.out.println("Não efetuar compra");
		}
		else {
			System.out.println("Efetuar compra");
		}
		
		
	}
}
