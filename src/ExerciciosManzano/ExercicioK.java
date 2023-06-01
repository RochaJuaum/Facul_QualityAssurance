     /*k)Elaborar  um 
	 *  programa  que  possibilite  
	 * calcular  a área  total  de  uma  residência 
	 * (sala,  cozinha, banheiro, quartos, área de serviço, quintal, garagem, etc.). 
	 *  O programa deve solicitar a entrada do nome,
	 *  a largura e o comprimento de um determinado cômodo. 
	 * Em seguida, deve apresentar a área 
	 * do  cômodo  lido  e  também  uma  mensagem  solicitando  do  usuário 
	 *  a  confirmação  de  continuar calculando  novos  cômodos.  
	 *  Caso  o  usuário  responda  “NAO”, 
	 *   o  programa  deve  apresentar  
	 *   o  valor total acumulado da área residencial. 
	 * 
	 */
package ExerciciosManzano;

import java.util.Scanner;
public class ExercicioK {
public static void main(String[] args) {
		
	Scanner ler = new Scanner(System.in);
	double areaTotal = 0;

	String resposta = "Sim";
	while (resposta.equalsIgnoreCase("SIM")) {
		
	System.out.print("Digite o nome do cômodo: ");
	String nomeComodo = ler.nextLine();

	System.out.print("Digite a largura do cômodo: ");
	            
	double largura = ler.nextDouble();

	System.out.print("Digite o comprimento do cômodo: ");
	            
	double comprimento = ler.nextDouble();
	double areaComodo = largura * comprimento;
	 areaTotal += areaComodo;
	 ler.nextLine(); 
	            
	   System.out.println(

	           


	"Área do cômodo " + nomeComodo + ": " + areaComodo + " metros quadrados");

	System.out.print("Deseja calcular a área de mais um cômodo? (SIM/NAO): ");
	    resposta = ler.nextLine();
	  
	 System.out.println("Área total da residência:" + areaTotal + " metros quadrados.");
	 		       

	        
	        


	        ler.close();
	    }



	   
	    
	}

	}


