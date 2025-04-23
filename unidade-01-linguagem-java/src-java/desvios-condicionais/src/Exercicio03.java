/* Exercícios de fixação
 * Criar um programa que recebe três notas, calcula a média e imprime:
 * "Aprovado" se média ≥ 7,
 * "Recuperação" se média entre 5 e 7,
 * "Reprovado" caso contrário.
 */

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Recebe três notas do aluno e calcula sua situação");
		System.out.print("1ª nota: ");
		double soma = teclado.nextDouble();
		System.out.print("2ª nota: ");
		soma += teclado.nextDouble();
		System.out.print("3ª nota: ");
		soma += teclado.nextDouble();
		double media = soma/3;
		
		String situacao = "Reprovado";
		if(media >= 7) {
			situacao = "Aprovado";
		}
		else if(media >=5) {
			situacao = "Recuperação";
		}
		System.out.println("Situação: " + situacao);
		teclado.close();

	}

}
