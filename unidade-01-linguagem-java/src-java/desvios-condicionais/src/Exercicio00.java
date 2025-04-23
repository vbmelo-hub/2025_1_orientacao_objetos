/* Exercícios de fixação
 * Ler a idade de uma pessoa e exibir:
 * "Menor de idade" se for menor que 18;
 * "Maior de idade" caso contrário.
 */

import java.util.Scanner;

public class Exercicio00 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe a idade da pessoa");
		System.out.print("Idade: ");
		int idade = teclado.nextInt();
		System.out.println(idade < 18 ? "Menor de idade." : "Maior de idade"); // exemplo com if ternário
		teclado.close();

	}

}
