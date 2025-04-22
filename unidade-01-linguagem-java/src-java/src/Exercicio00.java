//Exercícios de fixação
/* Exercicio 00:
 * Escrever um programa que mostre o nome de uma pessoa e sua idade em 
 * 31 de dezembro de um determinado ano. Para isso, leia o nome da pessoa, 
 * seu ano de nascimento e o ano para o qual deseje calcular a idade.
 */

import java.util.Scanner;

public class Exercicio00 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Calcula a idade da pessoa pelo seu ano de nascimento");
		System.out.print("Digite o nome: ");
		String nome = teclado.next();
		System.out.print("Digite ano de nascimento: ");
		int anoNascimento = teclado.nextInt();
		System.out.print("Digite o ano para o qual deseja calcular a idade: ");
		int anoIdade = teclado.nextInt();
		int idade = anoIdade - anoNascimento;
		
		System.out.printf("Nome: %s %nIdade em 31/12/%d: %d anos%n", nome, anoIdade, idade);
		teclado.close();
	}
}
