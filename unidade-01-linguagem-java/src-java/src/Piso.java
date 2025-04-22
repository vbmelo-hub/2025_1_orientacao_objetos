//Exercícios de fixação
/* Exercício 09: Piso da Escola 
 * Disponível em: https://olimpiada.ic.unicamp.br/pratique/p2/2018/f1/piso/
 */

import java.util.Scanner;

public class Piso {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int largura = teclado.nextInt();
		int comprimento = teclado.nextInt();
		int tipo2 = 2*(largura-1) + 2*(comprimento-1);
		int tipo1 = largura*comprimento + (largura-1)*(comprimento-1);
		System.out.println(tipo1 + "\n" + tipo2);
		teclado.close();

	}

}
