//Exercícios de fixação
/* Exercício 08: Divisão do Tesouro.
 * Disponível em: https://olimpiada.ic.unicamp.br/pratique/pj/2020/f1/tesouro/
 */

import java.util.Scanner;

public class Tesouro {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int moedas = teclado.nextInt();
		int marinheiros = teclado.nextInt();
		System.out.println((moedas/(marinheiros+2))*2);
		teclado.close();
	}

}
