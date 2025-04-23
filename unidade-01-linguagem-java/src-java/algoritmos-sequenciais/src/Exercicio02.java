//Exercícios de fixação
/* Exercicio 02:
 * Faça um programa para ler dois valores inteiros, e depois mostrar na tela a 
 * soma desses números com uma mensagem explicativa, conforme exemplos.
 */

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero1 = teclado.nextInt();
		int numero2 = teclado.nextInt();
		System.out.println("SOMA = " + (numero1+numero2));
		teclado.close();

	}

}
