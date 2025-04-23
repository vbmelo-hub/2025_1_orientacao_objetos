/* Exercícios de fixação
 * Receber um número de 1 a 7 e imprimir o dia da semana correspondente utilizando switch.
 */

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ler um número de 1 a 7 e informa o dia da semana correspondente");
		System.out.print("Número: ");
		byte numero = teclado.nextByte();
		
		switch (numero) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2: 
			System.out.println("Segunda-feira");
			break;
		case 3: 
			System.out.println("Terça-feira");
			break;
		case 4: 
			System.out.println("Quarta-feira");
			break;
		case 5: 
			System.out.println("Quinta-feira");
			break;
		case 6: 
			System.out.println("Sexta-feira");
			break;
		case 7: 
			System.out.println("Sábado");
			break;
		
		default:
			System.out.println("O número escolhido é inválido");
			break;
		}
		teclado.close();

	}

}
