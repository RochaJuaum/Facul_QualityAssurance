 package ExerciciosManzano;

import java.util.Scanner;

public class ExercicioD {

	/*Apresentar todos os valores numéricos inteiros ímpares situados na 
	 * faixa de 0 a 20. Para verificar se o número é ímpar, 
	 * efetuar dentro da malha a verificação lógica desta condição com
	 *  a instrução se, perguntando se o número é ímpar; sendo,
	 *  mostre-o; não sendo, passe para o próximo passo. 
	 * 
	 */

	public static void main(String[] args) {
	Scanner ler= new Scanner(System.in);
	
	for (int i = 0; i <= 20; i++) {
        if (i % 2 != 0) { // Verifica se o número é ímpar
            System.out.println(i); // Mostra o número ímpar
            
           
    }
	}
	ler.close();
	}
}
	
