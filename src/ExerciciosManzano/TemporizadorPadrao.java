package ExerciciosManzano;

import java.util.Scanner;

public class TemporizadorPadrao {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for (int i = 59; i >-1; i--) {
			for (int j = 59; j >-1; j--) {
				System.out.println(i+" : "+j);

			}
		}

		sc.close();

	}

}
