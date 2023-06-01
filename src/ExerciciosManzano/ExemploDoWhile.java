package ExerciciosManzano;

import java.util.Scanner;

public class ExemploDoWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int contadora = 0;

		do {
			System.out.println("Pablo");
			contadora++;
		} while (contadora < 3);

		sc.close();
	}

}
