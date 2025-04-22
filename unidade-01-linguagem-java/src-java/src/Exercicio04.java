//Exercícios de fixação
/* Exercicio 04:
 * Fazer um programa para ler quatro valores inteiros A, B, C e D. 
 * A seguir, calcule e mostre a diferença do produto de A e B pelo produto 
 * de C e D segundo a fórmula:
 * DIFERENCA = (A * B - C * D)
 */

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int a = teclado.nextInt();
		int b = teclado.nextInt();
		int c = teclado.nextInt();
		int d = teclado.nextInt();
		System.out.println("DIFERENÇA = " + ((a*b) - (c*d)));
		teclado.close();
	}

}
