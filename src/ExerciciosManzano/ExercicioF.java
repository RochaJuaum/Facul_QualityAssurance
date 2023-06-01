package ExerciciosManzano;

import java.util.Scanner;

public class ExercicioF {

	/*f) Elaborar  um  programa  que  apresente  
	 * como  resultado  o  valor  de  uma  potência  de  uma  
	 * base qualquer elevada a um expoente qualquer, 
	 * ou seja, de BE, em que B é o valor da base e E o valor do expoente.
	 *  Observe que neste exercício não pode ser utilizado o
	 *  operador de exponenciação do portuguol (^). 
	 * 
	 */
	
	    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o valor da base B: ");
	        int base = scanner.nextInt();

	        System.out.print("Digite o valor do expoente E: ");
	        int expoente = scanner.nextInt();

	        int resultado = 1;

	        for (int i = 1; i <= expoente; i++) {
	            resultado *= base; 
	        }

	        System.out.println(base + " elevado a " + expoente + " é igual a: " + resultado);
	        scanner.close();
	    }
	}
	







