/* Problema 1160 - Crescimento Populacional
 * Disponível em: https://judge.beecrowd.com/pt/problems/view/1160
 */

import java.util.Locale;
import java.util.Scanner;

public class Crescimento {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		int t = teclado.nextInt();
		for(int i=0; i<t; i++) {
			int pa = teclado.nextInt();
			int pb = teclado.nextInt();
			
			double g1 = teclado.nextDouble()/100; //A entrada é em percentual. Aqui há a conversão para um número entre 0 e 1
			double g2 = teclado.nextDouble()/100;
			
			int contador = 0;
			while(contador <= 100 && pa <= pb) {
				pa = pa + (int)(pa*g1); //É preciso pegar apenas a parte inteira do aumento populacional
				pb = pb + (int)(pb*g2);
				contador++;
			}
			if(contador <= 100) System.out.printf("%d anos.%n", contador);
			else System.out.println("Mais de 1 seculo.");
		}
		teclado.close();
	}
}