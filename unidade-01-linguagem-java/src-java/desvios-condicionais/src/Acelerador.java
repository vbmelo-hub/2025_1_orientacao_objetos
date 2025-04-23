/* Exercício OBI: Acelerador de partículas
 * Disponível em: https://olimpiada.ic.unicamp.br/pratique/p2/2020/f1/acelerador/
 */

import java.util.Scanner;

public class Acelerador {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int distancia = teclado.nextInt()-3; //já desconsidera a distancia entre o emissor e a entrada do acelerador
		byte sensor;
		if(distancia%8 == 3) sensor = 1;
		else if (distancia%8 == 4) sensor = 2;
		else sensor = 3;
		System.out.println(sensor);
		teclado.close();

	}

}
