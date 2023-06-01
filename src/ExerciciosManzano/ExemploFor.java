package ExerciciosManzano;

import java.util.Scanner;

public class ExemploFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite qual tabuada deseja ? ");
		int valor = sc.nextInt();
		for (int i = 1; i < 11; i++) {
			System.out.println(valor + " * " + i + "  =  " + valor * i);
		}
		sc.close();
	}

}
