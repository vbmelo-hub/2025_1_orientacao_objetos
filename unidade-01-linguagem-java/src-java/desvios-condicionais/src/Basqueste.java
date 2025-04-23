/* Exercício OBI: Basquete de robôs
 * Disponível em: https://olimpiada.ic.unicamp.br/pratique/pj/2018/f1/basquete/
 */

import java.util.Scanner;

public class Basqueste {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int distancia = teclado.nextInt();
		byte pontos;
		if(distancia <= 800) pontos = 1;
		else if(distancia <= 1400) pontos = 2;
		else pontos = 3;
		System.out.println(pontos);
		teclado.close();
	}

}
