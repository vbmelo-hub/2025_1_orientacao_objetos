//Exercícios de fixação
/* Exercicio 01:
 * Desenvolver um programa que peça a base e altura de um triângulo 
 * e calcula a sua área..
 */

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Calcula a área de um triângulo");
		System.out.println("Informe a base do triângulo: ");
		double base = teclado.nextDouble();
		System.out.println("Informe a algura do triângulo: ");
		double altura = teclado.nextDouble();
		double area = base*altura/2;
		
		System.out.printf("Área do triângulo de base %.2f e altura %.2f: %.2f u.a.%n", base, altura, area);
		teclado.close();

	}

}
