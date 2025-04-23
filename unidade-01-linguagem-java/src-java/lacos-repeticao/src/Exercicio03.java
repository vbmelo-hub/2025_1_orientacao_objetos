/* Exercícios de fixação
 * Fazer um programa que leia 5 números inteiros e calcule a média deles usando um laço.
 */

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite cinco números.");
		int soma = 0;
		for(int i=0; i<5; i++) {
			System.out.printf("%dº número: ", i+1);
			soma += teclado.nextInt();
		}
		double media = (double)soma/5;
		System.out.println("Média: " + media);
		teclado.close();
	}

}
