package ExerciciosManzano;

import java.util.Scanner;

public class TemporizadorManual {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Em Quantos Minutos vai começar seu temporizador ? ");
		int min = sc.nextInt();
		System.out.println("Em Quantos Segundos vai começar seu temporizador ? ");
		int seg = sc.nextInt();


		for (int i = min; i <-1; i--) {
			for (int j = seg; j <-1; j--) {
				System.out.println(i+" : "+j);

			}
		}

		sc.close();

	}

}
