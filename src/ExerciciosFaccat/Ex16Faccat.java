package ExerciciosFaccat;

import java.util.Scanner;

public class Ex16Faccat {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número de maçãs :");
		double maca = sc.nextDouble();
		
		if (maca < 12) {
			maca = maca * 1.30;
		}
		else {
			
		}
		System.out.println("As maçãs deram um total de R$" +maca);

	}

}
