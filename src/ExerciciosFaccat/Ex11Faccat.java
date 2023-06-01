package ExerciciosFaccat;

import java.util.Scanner;

public class Ex11Faccat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o salário desse funcionário: ");
		float salario = sc.nextFloat();
		System.out.print("Digite quantos carros ele vendeu esse mês: ");
		int carrosVendidos = sc.nextInt();
		System.out.print("Digite o valor total de todas as vendas: ");
		float valorVendas = sc.nextFloat();
		System.out.print("Digite o valor que o funcionário recebe por venda: ");
		float bonusPorVenda = sc.nextFloat();
		
		float comissaoPorVenda = valorVendas/100*5;
		float bonusTotal = bonusPorVenda*carrosVendidos;
		float salarioTotal = salario+bonusTotal+comissaoPorVenda;
		
		System.out.println("O salario total desse funcionário esse mês foi R$" +salarioTotal);
		
	}
}
