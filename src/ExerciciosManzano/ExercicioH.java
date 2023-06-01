
	/* H Elaborar um programa que apresente os valores de conversão de 
	 * graus Celsius em Fahrenheit, de 10 em 10 graus,
	 * iniciando a contagem em 10 graus Celsius e finalizando em 
	 * 100 graus Celsius.
	 * O programa   deve   apresentar   os   valores   das   duas   temperaturas.  
	 * A   fórmula   de   conversão é  f=9c +160
	 *                                     5 
	 * sendo F a temperatura em Fahrenheit e C a temperatura em Celsius. 
	 * 
	 */
package ExerciciosManzano;

public class ExercicioH {

	


	
	public static void main(String[] arg) {
	int celsiusInicial = 10;
	int celsiusFinal = 100;
	int incremento = 10;

	System.out.println("celsius :fahrenheit");

	for (int celsius = celsiusInicial; celsius <= celsiusFinal; celsius += incremento) {
	double fahrenheit = celsius * 9 / 5.0 + 32;

	System.out.println(celsius +  "\t" + fahrenheit);
	 
	}
	 }
	}


