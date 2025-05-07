public class Aplicacao {

	public static void main(String[] args) {
		Porta porta1 = new Porta();
		porta1.altura = 2.1;
		porta1.largura = 0.9;
		porta1.espessura = 0.06;
		porta1.material = "Madeira";
		porta1.cor = "Branca";
		
		//Objeto do tipo Fechadura
		Fechadura fechadura1 = new Fechadura();
		fechadura1.chave = "abcd";
		porta1.fechadura = fechadura1;
		
		
		
		if (porta1.abrir()) {
			System.out.println("Porta aberta.");
		} else {
			System.out.println("Não foi possível abrir a porta.");
		}
		
		if(porta1.destrancar("abcd")) {
			System.out.println("Porta destrancada.");
		} else {
			System.out.println("Não foi possível destrancar a porta.");
		}
		
		if (porta1.abrir()) {
			System.out.println("Porta aberta.");
		} else {
			System.out.println("Não foi possível abrir a porta.");
		}
	}
}
