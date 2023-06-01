package ExerciciosFaccat;

import java.util.Scanner;

public class Ex25Faccat {

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o numero da conta :");
		String numConta = sc.next();
		System.out.println("Informe o saldo :");
		double saldo = sc.nextDouble();
		System.out.println("Informe o debito :");
		double debito = sc.nextDouble();
		System.out.println("Informe o crédito :");
		double credito = sc.nextDouble();
		
		double saldoAtual = saldo - debito + credito;
		
		if (saldoAtual >= 0) {
			System.out.println("O saldo da conta "+numConta +" é positivo e tem R$ " +saldoAtual +" disponível");
		}
		else {
			System.out.println("O saldo da conta "+numConta +" está R$ " +saldoAtual +" negativo");
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
