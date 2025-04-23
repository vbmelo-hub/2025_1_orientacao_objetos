/* Exercícios de fixação
 * Escrever um programa que lê dois números inteiros e imprime o maior entre eles.
 */

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ler dois números inteiros e mostra o maior entre eles");
		System.out.print("1º número: ");
		int numero1 = teclado.nextInt();
		System.out.print("2º número: ");
		int numero2 = teclado.nextInt();
		int maior;
		
		if(numero1 > numero2) maior = numero1; //como o if e o else têm apenas uma linha cada, é possível usá-los sem chaves
		else maior = numero2;
		
		System.out.println("Maior: " + maior);
		teclado.close();

	}

}
