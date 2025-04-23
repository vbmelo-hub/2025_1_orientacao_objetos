//Exercícios de fixação
/* Exercicio 05:
 * Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas,
 *  o valor que recebe por hora e calcule o salário desse funcionário. 
 *  A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
 */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		String numeroFuncionario = teclado.next();
		int horasTrabalhadas = teclado.nextInt();
		double valorHora = teclado.nextDouble();
		double salario = horasTrabalhadas*valorHora;
		System.out.printf("NUMBER = %s%nSALARY = U$ %.2f%n", numeroFuncionario, salario);
		teclado.close();
	}

}
