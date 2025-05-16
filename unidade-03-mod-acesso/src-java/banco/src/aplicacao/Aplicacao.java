package aplicacao;
import modelo.Cliente;
import modelo.Conta;

public class Aplicacao {

	public static void main(String[] args) {
		Conta contaPedro = new Conta("12345", "678");
		Cliente cliente1 = new Cliente("Pedro", "123456789-00", "26-01-2000");
		cliente1.setEndereco("Rua A");
		contaPedro.setTitular(cliente1);
		System.out.println("Quantidade de contas: " + Conta.contador);
		//System.out.println(contaPedro);
		
		Cliente cliente2 = new Cliente("João", "987654321-00", "Rua B", "29/02/2000");
		Conta contaJoao = new Conta("98765", "456", cliente2);
		System.out.println();
		//System.out.println(contaJoao);
		System.out.println("Quantidade de contas: " + Conta.contador);
	}

}
