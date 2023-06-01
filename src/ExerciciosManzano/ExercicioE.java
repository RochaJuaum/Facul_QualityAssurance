package ExerciciosManzano;

public class ExercicioE {

	/*Apresentar os resultados das potências de 3, 
	 * variando do expoente 0 até o expoente 15.
	 *  Deve ser considerado  que  qualquer  número  elevado  a  zero  é  1,  e
	 *elevado  a  1  é  ele  próprio.  Observe  que neste exercício não pode ser utilizado o 
	 * operador de exponenciação do portuguol (^). 
	 * 
	 */
	
	
	public static void main(String[] args) {
		int base = 3; 
		int expoente;
		int resultado;

		for (expoente = 0; expoente <= 15; expoente++) {
			if (expoente == 0) {
				resultado = 1; 
				
			} else if (expoente == 1) {
				resultado = base; 
			} else {
				resultado = 1;
				for (int i = 1; i <= expoente; i++) {
					resultado *= base; 
				}
			}

			System.out.println("O 3 elevado a " + expoente + " é igual a: " + resultado);
		}
	}
}

