/* Exercício OBI: Xadrez
 * Disponível em: https://olimpiada.ic.unicamp.br/pratique/p1/2018/f1/xadrez/
 */

import java.util.Scanner;

public class Xadrez {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int linhas = teclado.nextInt();
		int colunas = teclado.nextInt();
		
		if((linhas+colunas)%2 == 0) System.out.println(1);
		else System.out.println(0);
		teclado.close();
	}

}
