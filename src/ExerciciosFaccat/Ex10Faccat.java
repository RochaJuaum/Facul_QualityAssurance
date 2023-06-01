//é a soma do custo de fábrica com a porcentagem do distribuidor e dos impostos
package ExerciciosFaccat;

import java.util.Scanner;
		
public class Ex10Faccat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor do carro: ");
		float valorCarro = sc.nextFloat();
		
		float imposto = valorCarro*45/100;
		float distribuidor = valorCarro*28/100;
		float valorTotal = valorCarro+imposto+distribuidor;
		
		System.out.println("O valor cobrado de impostos é R$" +imposto);
		System.out.println("A porcentagem do distribuidor é R$" +distribuidor);
		System.out.println("O carro é R$" +valorCarro);
		System.out.println("O valor total cobrado pelo carro é R$" +valorTotal);
		
	}

}
