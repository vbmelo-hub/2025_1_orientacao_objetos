//Exercícios de fixação
/* Exercício 07:
 * Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. 
 * Em seguida, calcule e mostre:
 * a) a área do triângulo retângulo que tem A por base e C por altura.
 * b) a área do círculo de raio C. (π = 3.14159).
 * c) a área do trapézio que tem A e B por bases e C por altura.
 * d) a área do quadrado que tem lado B.
 * e) a área do retângulo que tem lados A e B.
 */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		double a = teclado.nextDouble();
		double b = teclado.nextDouble();
		double c = teclado.nextDouble();
		System.out.printf("TRIANGULO: %.3f%n", a*c/2);
		System.out.printf("CIRCULO: %.3f%n", 3.14159*c*c);
		System.out.printf("TRAPEZIO: %.3f%n", (a+b)*c/2);
		System.out.printf("QUADRADO: %.3f%n", b*b);
		System.out.printf("RETANGULO: %.3f%n", a*b);
		teclado.close();
	}

}
