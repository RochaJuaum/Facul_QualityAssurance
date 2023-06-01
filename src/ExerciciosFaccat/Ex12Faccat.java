package ExerciciosFaccat;

import java.util.Scanner;

public class Ex12Faccat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a temperatura em graus Fahrenheit: ");
		float tempF = sc.nextFloat();
		
		float tempC = 5*(tempF-32)/9;
		
		System.out.println(tempC);
		
		
		
		
		
	}

}
