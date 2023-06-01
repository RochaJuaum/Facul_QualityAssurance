/*I Elaborar um programa que efetue a leitura de 10 valores
	 * numéricos e apresente no final o total do 
	 * somatório e a média aritmética dos valores lidos. 
	 * 
	 */
package ExerciciosManzano;

import java.util.Scanner;
public class ExercicioI {
	
public static void main(String[] args) {
int totalVal = 10;
int somatorio = 0;

Scanner ler=new Scanner(System.in);

System.out.println("Digite " + totalVal + " valores");

for (int i = 1; i <=totalVal; i++) {
	
System.out.print("Valor " + i + " : ");
int valor = ler.nextInt();
somatorio += valor;
}


double media = (double) somatorio / totalVal;

System.out.println("Somatório: " + somatorio);

System.out.println("Média: " + media);

	     
	 ler.close();
	   

}}



