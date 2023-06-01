package ExerciciosFaccat;

import java.util.Scanner;

public class Ex29Faccat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Digite um número: ");
		int n1 = sc.nextInt();
		System.out.print("Digite um número: ");
		int n2 = sc.nextInt();
		System.out.print("Digite um número: ");
		int n3 = sc.nextInt();
		
		 if ((n1 > n3 && n2 > n3)) {
		        System.out.println(n1 + n2);
		    }
		 else if ((n2 < n1 && n2 < n3)) {
		        System.out.println(n1 + n3);
		    } 
		 else {
		        System.out.println(n2 + n3);
		    }
		    
		    
		    
		    
		    
		}	
	}
