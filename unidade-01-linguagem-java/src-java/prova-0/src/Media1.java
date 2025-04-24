/* Problema 1005 - Média 1
 * Disponível em: https://judge.beecrowd.com/pt/problems/view/1005
 */

import java.util.Locale;
import java.util.Scanner;

public class Media1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		double a = teclado.nextDouble();
		double b = teclado.nextDouble();
		
		System.out.printf("MEDIA = %.5f%n", (a*3.5 + b*7.5)/11);
		teclado.close();
	}

}
