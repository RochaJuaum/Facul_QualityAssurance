package ExerciciosFaccat;

import java.util.Scanner;

public class Ex09Faccat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o salário: ");
		float salario = sc.nextFloat();
		System.out.print("Digite o percentual de aumento: ");
		int aumento = sc.nextInt();
		
		float salarioFinal = salario/100*aumento;
		
		System.out.println("O salário antes do aumento era R$" +salario);
		System.out.println("O funcionário teve um aumento de " +aumento+"%");
		System.out.println("O salário depois do aumento é R$" +(salarioFinal+salario));
	}

}
