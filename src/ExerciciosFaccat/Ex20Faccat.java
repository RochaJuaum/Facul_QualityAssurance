package ExerciciosFaccat;

import java.util.Scanner;

public class Ex20Faccat {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um número :");
		int n1 = sc.nextInt();
		
		System.out.println("Informe outro número :");
		int n2 = sc.nextInt();
		
		if (n1 > n2) {
			System.out.println(n2+","+n1);
		}
		else {
			System.out.println(n1+","+n2);
		}
		
		
		
	}
	
}
