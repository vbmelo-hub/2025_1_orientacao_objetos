//Exercícios de fixação
/* Exercicio 03:
 * Faça um programa para ler o valor do raio de um círculo, e depois mostrar o 
 * valor da área deste círculo com quatro casas decimais conforme exemplos.
 * 
 * Fórmula da área: area = π * raio²
 * Considere: π = 3.14159
 */

import java.util.Locale;
import java.util.Scanner;
public class Exercicio03 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US); //Necessário para aceitar a entrada com ponto para casas decimais
		Scanner teclado = new Scanner(System.in);
		double raio = teclado.nextDouble();
		double area = 3.14159*raio*raio;
		System.out.printf("A=%.4f%n", area);
		teclado.close();
	}

}
