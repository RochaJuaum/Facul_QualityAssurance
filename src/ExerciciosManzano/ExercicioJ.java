/*j)Elaborar  um  programa  que  apresente  os  resultados 
	 * da  soma  e  da  média  aritmética
	 * dos  valores pares situados na faixa numérica de 50 a 70w
	 */
package ExerciciosManzano;

public class ExercicioJ {

public static void main(String[] args) {
	
int valorInicial = 50;
int valorFinal = 70;
int soma = 0;
int quantidadePares = 0;
for (int num = valorInicial; num <= valorFinal; num++) {
if (num % 2 == 0) {  
soma += num;
quantidadePares++;
	            
double media = (double) soma / quantidadePares;
System.out.println(" A soma dos valores pares são: " + soma );
System.out.println("A média aritmética dos valores pares são:" + media );      

	       
	
	    }
	}

	    }
		
}


