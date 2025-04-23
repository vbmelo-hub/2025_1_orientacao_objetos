/* Exercício OBI: Idade de Camila
 * Disponível em: https://olimpiada.ic.unicamp.br/pratique/p2/2021/f1/idade/
 */

import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//O problema consiste em ler três números inteiros e determinar qual é o do meio, no caso, a idade de Camila.
		 
		int a = teclado.nextInt();
		int b = teclado.nextInt();
		int c = teclado.nextInt();
		
		//Podemos usar as funções de máximo e mínimo da classe Math para isso bem facilmente
		//mas vamos apresentar a resposta à mão
		int maior;
		if(a >= b && a >= c) maior = a;
		else if(b >= a && b >= c) maior = b;
		else maior = c;
		
		int menor;
		if(a <= b && a <= c) menor = a;
		else if(b <=a && b <= c) menor = b;
		else menor = c;
		
		//Pode-se definir a idade de Camila
		int camila = a+b+c-maior-menor;
		System.out.println(camila);
		
		teclado.close();
	}

}
