/* Exercício OBI: Detectando Colisões
 * Disponível em: https://olimpiada.ic.unicamp.br/pratique/pj/2017/f1/drone/
 */

import java.util.Scanner;

public class Colisoes {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//Leitura do 1o. retângulo
		int aX0 = teclado.nextInt();
		int aY0 = teclado.nextInt();
		int aX1 = teclado.nextInt();
		int aY1 = teclado.nextInt();
		
		//Leitura do 2o. retângulo
		int bX0 = teclado.nextInt();
		int bY0 = teclado.nextInt();
		int bX1 = teclado.nextInt();
		int bY1 = teclado.nextInt();
		
		//Assumamos que há colisão e tentaremos provar o contrário
		byte colisao = 1;
		
		if(bX1 < aX0) colisao = 0; //B está atrás de A, sem se tocarem 
		else if(bX0 > aX1) colisao = 0; //B está à frente de A, sem se tocarem 
		else if(bY1 < aY0) colisao = 0; //B está abaixo de A, sem se tocarem 
		else if(bY0 > aY1) colisao = 0; //B está acima de A, sem se tocarem
		//O else é quando haverá colisão, já assumida anteriormente
		
		//É possível juntar as quatro condições em apenas uma composta, separadas por OU
		
		System.out.println(colisao);
				
		teclado.close();
	}

}
