package ExerciciosFaccat;

import java.util.Scanner;

public class Ex24Faccat {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);		
		
		System.out.println("Qual o salário fixo ?");
		double salario = sc.nextDouble();
		System.out.println("Qual o valor das vendas feitas esse mês?");
		double vendas = sc.nextDouble();
		
		double comissao = 0.0, salarioTotal =0.0;
		
		 if ((vendas <= 1500.0) && (vendas > 0)) {
			 comissao = (vendas/100)*3;
			 
		 }
		 else if (vendas > 1500.0) {
			 comissao = (vendas/100)*3;
			 comissao = comissao + ((vendas-1500)/20);
		 }
		 else {
			 System.out.println("Não houve comissão!");
		 }
		 salarioTotal = salario + comissao;
		 System.out.println("O salário total foi de R$ " +salarioTotal);
		
	}

}
