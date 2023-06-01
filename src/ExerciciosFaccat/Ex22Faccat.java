// A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais 
//de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%. 
//Escreva um algoritmo que leia o número de horas trabalhadas em um mês, o salário por hora e escreva 
//o salário total do funcionário, que deverá ser acrescido das horas extras, caso tenham sido trabalhadas 
//(considere que o mês possua 4 semanas exatas)

package ExerciciosFaccat;

import java.util.Scanner;

public class Ex22Faccat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int horaExtra, horasTrabalhadas; 
		float salario, valorHora, salarioTotal;
		
		
		System.out.println("Quantas horas o funcionário trabalhou por semana ?");
		horasTrabalhadas = sc.nextInt();
		System.out.println("Qual o valor recebido por hora ?");
		valorHora = sc.nextFloat();
		
		horaExtra = horasTrabalhadas - 40;
		float salarioHoraExtra = ((valorHora/2)+valorHora)*horaExtra;
		salario = horasTrabalhadas * valorHora;
		salarioTotal = (salario + salarioHoraExtra) * 4;
		
		System.out.println("O Funcionário fez "+horaExtra+ " horas extras por semana. ganhando R$ " +salarioHoraExtra+ " pelas horas trabalhadas");
		System.out.println("O salario total do funcionário foi de R$ "+ salarioTotal);
		
	}
	
}
