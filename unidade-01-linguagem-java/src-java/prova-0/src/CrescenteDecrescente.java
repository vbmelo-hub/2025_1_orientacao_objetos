/* Problema 1113 - Crescente Decrescente
 * Disponível em: https://judge.beecrowd.com/pt/problems/view/1113
 */

import java.util.Scanner;

public class CrescenteDecrescente {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int x, y;
		do {
			x = teclado.nextInt();
			y = teclado.nextInt();
			if(x > y) System.out.println("Decrescente");
			else if(x<y) System.out.println("Crescente");
		}while (x !=y);
		teclado.close();
	}
}