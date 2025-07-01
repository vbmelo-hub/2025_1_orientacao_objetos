package aplicacao;

import modelo.cliente.Cliente;
import modelo.cliente.PessoaFisica;
import modelo.cliente.PessoaJuridica;
import modelo.funcionario.Funcionario;
import servico.Servico;
import ui.InterfaceUsuario;

public class Aplicacao {

	public static void main(String[] args) {
	Servico servico = new Servico();
	InterfaceUsuario iu = new InterfaceUsuario(servico);
		Cliente c;
		c = new PessoaFisica("Jõao", "Rua A", "123");
		System.out.println(c.toString());
		c = new PessoaJuridica("Ardidas", "Rua B", "456");
		System.out.println(c.toString());
	//iu.exibir();
	
		
	}
			
	
}
