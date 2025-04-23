/* Exercício OBI: Drone de Entrega
 * Disponível em: https://olimpiada.ic.unicamp.br/pratique/pj/2017/f1/drone/
 */

import java.util.Scanner;

public class Drone {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//Dimensões da caixa
		int cxLadoA = teclado.nextInt();
		int cxLadoB = teclado.nextInt();
		int cxLadoC = teclado.nextInt();
		
		//Dimensões da janela
		int janelaAltura = teclado.nextInt();
		int janelaLargura = teclado.nextInt();
		
		//Vamos assumir que não é possível entregar e vamos tentar provar o contrário
		char entrega = 'N';
		
		if(janelaAltura >= cxLadoA && (janelaLargura >= cxLadoB || janelaLargura >= cxLadoC)) entrega = 'S';
		else if(janelaAltura >= cxLadoB && (janelaLargura >= cxLadoA || janelaLargura >= cxLadoC)) entrega = 'S';
		else if(janelaAltura >= cxLadoC && (janelaLargura >= cxLadoA || janelaLargura >= cxLadoB)) entrega = 'S';
		//O else é quando não consegue entregar, mas isso é nossa premissa
		System.out.println(entrega);
		
		teclado.close();
	}

}
