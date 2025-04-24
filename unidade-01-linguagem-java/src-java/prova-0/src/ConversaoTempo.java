/* Problema 1019 - Conversão de Tempo
 * Disponível em: https://judge.beecrowd.com/pt/problems/view/1019
 */

import java.util.Scanner;

public class ConversaoTempo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int tempoSegundos = teclado.nextInt();
		int tempoHoras = tempoSegundos/3600;
		tempoSegundos %= 3600; //somente com o que sobrou de horas
		
		int tempoMinutos = tempoSegundos/60;
		tempoSegundos %= 60; //somente com o que sobrou de minutos
		
		System.out.printf("%d:%d:%d%n", tempoHoras, tempoMinutos, tempoSegundos);
		
		teclado.close();
	}

}
