//Exercícios de fixação
/* Exercício 06:
 * Fazer um programa para ler o código de uma peça 1, o número de peças 1, 
 * o valor unitário de cada peça 1, o código de uma peça 2, 
 * o número de peças 2 e o valor unitário de cada peça 2. 
 * Calcule e mostre o valor a ser pago.
 */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		String codPeca1 = teclado.next();
		int numeroPeca1 = teclado.nextInt();
		double valorPeca1 = teclado.nextDouble();
		String codPeca2 = teclado.next();
		int numeroPeca2 = teclado.nextInt();
		double valorPeca2 = teclado.nextDouble();
		
		double valorTotal = numeroPeca1*valorPeca1 + numeroPeca2*valorPeca2;
		System.out.printf("VALOR A PAGAR = R$ %.2f%n", valorTotal);
		teclado.close();
	}

}
