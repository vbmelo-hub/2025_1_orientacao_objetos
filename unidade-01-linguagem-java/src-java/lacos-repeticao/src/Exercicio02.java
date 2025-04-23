/* Exercícios de fixação
 * Criar um programa que peça ao usuário para digitar senhas até que a senha correta seja informada.
 */

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String senha = "mortadela1"; //by Chow
		System.out.print("Digite sua senha: ");
		String entrada = teclado.next();
		while (!senha.equals(entrada)) { //comparação de strings é feita assim, não com ==
			System.err.println("Senha incorreta!");
			System.out.print("Digite sua senha: ");
			entrada = teclado.next();
		}
		System.out.println("Bem-vindo ao sistema");
		teclado.close();
	}

}
