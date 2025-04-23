/* Exercícios de fixação
 * Fazer um programa que leia uma quantidade indeterminada de massas de bovinos e definir:
 * O mais leve;
 * O mais pesado;
 * A massa média
 */

import java.util.Scanner;

public class Fazenda {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ler a massa de uma quantidade indeterminada de animais");
		System.out.print("Massa (0 para sair): ");
		double massa = teclado.nextDouble();
		double maisPesado = massa;
		double maisLeve = massa;
		int contador = 0;
		double soma = 0.0;
		while(massa != 0) {
			soma += massa;
			contador++;
			if(massa > maisPesado) maisPesado = massa;
			else if(massa < maisLeve) maisLeve = massa;
			System.out.print("Massa (0 para sair): ");
			massa = teclado.nextDouble();
			
		}
		System.out.println("Mais leve: " + maisLeve);
		System.out.println("Mais pesado: " + maisPesado);
		System.out.println("Massa média: " + soma/contador);
		teclado.close();

	}

}
