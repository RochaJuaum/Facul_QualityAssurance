package ExerciciosManzano;

public class ExercicioG {

	
	/* Escreva  um  programa  que  apresente  a  série 
	 *  de  Fibonacci  até  o  décimo  quinto  termo. 
	 *   A  série  de Fibonacci  é  formada  pela 
	 *  seqüência:  1,  1,  2,  3,  5, 8,  13,  21,  34,  ...,  etc.
	 * Esta  série  se  caracteriza pela  soma  de  um  termo 
	 * atual  com  o  seu  anterior  subseqüente,  para  que 
	 * seja  formado  o  próximo valor da seqüência. 
	 *  Portanto começando com os números 1, 1 o próximo termo é 1+1=2,
	 * o próximo é 1+2=3, o próximo é 2+3=5, o próximo 3+5=8, etc. 
	 */
	 public static void main(String[] args) {
	        int n = 15; // número de termos desejado do anunciado!

	        int primeiroTermo = 1;
	        int segundoTermo = 1;

	        System.out.println(" A série de Fibonacci até o décimo quinto termo:");

	        System.out.print(primeiroTermo + ", ");
	        System.out.print(segundoTermo + ", ");

	        for (int i = 3; i <= n; i++) {
	            int proximoTermo = primeiroTermo + segundoTermo;
	            System.out.print(proximoTermo + " , " );

	            primeiroTermo = segundoTermo;
	            segundoTermo = proximoTermo;
	        }
	    }
	}
	
	


