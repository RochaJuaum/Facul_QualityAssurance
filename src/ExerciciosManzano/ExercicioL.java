  /*L) Elaborar  um  programa  que  efetue  a  leitura  de  valores  positivos 
   * inteiros  até  que  um  valor  negativo seja  informado. 
   * Ao  final  devem  ser  apresentados  o  maior  e  o  menor  valores 
   * informados  pelo usuário.
   */
package ExerciciosManzano; 

import java.util.Scanner;
public class ExercicioL {

public static void main(String[] args) {
	        
	        
	Scanner ler = new Scanner(System.in);

	  int maiorValor = Integer.MIN_VALUE;
	  int menorValor = Integer.MAX_VALUE;
System.out.println("Digite os valores inteiros positivos (digite um valor negativo para sair):");

	 while (true) {
	            int valor = ler.nextInt();

	if (valor < 0) {
	      break;
	            

	            
	            }

if (valor > maiorValor) {
maiorValor = valor;
	            }

if (valor < menorValor) {
menorValor = valor;
	            }
	        }

	        System.out.println("Maior valor: " + maiorValor);
	        System.out.println("Menor valor: " + menorValor);
	        
	        ler.close();
	    }
	

	    }
	


