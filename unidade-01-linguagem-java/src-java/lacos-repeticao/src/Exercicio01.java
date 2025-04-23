/* Exercícios de fixação
 * Ler um número inteiro n e imprimir todos os números pares de 1 até n.
 */

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n = teclado.nextInt();
		
		if(n >= 0) {
			for(int i=2; i<=n; i+=2) { //O primeiro número par entre 1 e n positivo é 2
				System.out.print(i + "  ");
			}
		}else {
			for(int i=0; i>=n; i-=2) { //O maior número par entre 1 e n, n<=0, é 0
				System.out.print(i + "  ");
			}
		}
		
		teclado.close();
	}

}
