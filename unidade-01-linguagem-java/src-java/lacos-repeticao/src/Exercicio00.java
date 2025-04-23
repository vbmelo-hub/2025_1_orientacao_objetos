/* Exercícios de fixação
 * Imprimir os números de 1 a 10 usando while, do/while e for.
 */
public class Exercicio00 {

	public static void main(String[] args) {
		System.out.println("Imprimir de 0 a 10 com while:");
		byte contador = 0;
		while(contador < 11) {
			System.out.print(contador + "  ");
			contador++;
		}
		System.out.println(); //Apenas para gerar  um salto de linha
		System.out.println("Imprimir de 0 a 10 com do/while:");
		contador = 0;
		do {
			System.out.print(contador++ + "  "); //Mostra o contador e depois incrementa-o em 1
		}while(contador < 11);
		System.out.println(); //Apenas para gerar  um salto de linha
		
		System.out.println("Imprimir de 0 a 10 com for");
		for(int i=0; i<11; i++) {
			System.out.print(i + "  ");
		}
		System.out.println(); //Apenas para gerar  um salto de linha
	}

}
