/* Problema 1021 - Notas e Moedas
 * Disponível em: https://judge.beecrowd.com/pt/problems/view/1021
 */

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class NotasMoedas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		int dinheiroCentavos = (int)(teclado.nextDouble()*100); //converte o dinheiro lido, em reais, para centavos;
		
		/*A forma mais elegante de fazer essa solução é usando vetor ou lista
		 * Entretanto, como há poucas opções de notas e moedas, a resolução será apresentada 
		 * da forma mais intuitiva e direta
		 */
		System.out.println("NOTAS:");
		System.out.printf("%d nota(s) de R$ 100.00%n", dinheiroCentavos/10000);
		dinheiroCentavos %= 10000;
		System.out.printf("%d nota(s) de R$ 50.00%n", dinheiroCentavos/5000);
		dinheiroCentavos %= 5000;
		System.out.printf("%d nota(s) de R$ 20.00%n", dinheiroCentavos/2000);
		dinheiroCentavos %= 2000;
		System.out.printf("%d nota(s) de R$ 10.00%n", dinheiroCentavos/1000);
		dinheiroCentavos %= 1000;
		System.out.printf("%d nota(s) de R$ 5.00%n", dinheiroCentavos/500);
		dinheiroCentavos %= 500;
		System.out.printf("%d nota(s) de R$ 2.00%n", dinheiroCentavos/200);
		dinheiroCentavos %= 200;
		
		System.out.println("MOEDAS:");
		System.out.printf("%d moeda(s) de R$ 1.00%n", dinheiroCentavos/100);
		dinheiroCentavos %= 100;
		System.out.printf("%d moeda(s) de R$ 0.50%n", dinheiroCentavos/50);
		dinheiroCentavos %= 50;
		System.out.printf("%d moeda(s) de R$ 0.25%n", dinheiroCentavos/25);
		dinheiroCentavos %= 25;
		System.out.printf("%d moeda(s) de R$ 0.10%n", dinheiroCentavos/10);
		dinheiroCentavos %= 10;
		System.out.printf("%d moeda(s) de R$ 0.05%n", dinheiroCentavos/5);
		dinheiroCentavos %= 5;
		System.out.printf("%d moeda(s) de R$ 0.01%n", dinheiroCentavos);
		
		teclado.close();
	}

}
