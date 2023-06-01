package ExerciciosManzano;

public class ExercicioB {
	/* Elaborar um programa que apresente no final o somatório dos 
	 * valores pares existentes na faixa de 1 até 500. 
	 */
	public static void main(String[] args) {
        int soma = 0;
        for (int i = 2; i <= 500; i += 2) {
            soma += i;
        }
        System.out.println("A soma dos valores pares de 1 a 500 é: " + soma);
    }
}

/*usou um loop for para iterar apenas sobre os
 *  números pares na faixa de 1 a 500, iniciando em 2 e
 *   incrementando de 2 em 2 até chegar em 500. Para cada número par, 
 *   adicionamos o número à variável soma.
 *  Ao final do loop, imprimimos o valor
 *   total da soma dos valores pares encontrados.
 */ 
