package aplicacao;

import modelo.cliente.Cliente;
import modelo.cliente.PessoaFisica;
import modelo.cliente.PessoaJuridica;
import servico.ServicoDepartamento;
import servico.ServicoFuncionario;
import ui.InterfaceUsuario;

public class Aplicacao {

	public static void main(String[] args) {
	ServicoFuncionario servicoFuncionario = new ServicoFuncionario();
	ServicoDepartamento servicoDepartamento = new ServicoDepartamento();

	InterfaceUsuario iu = new InterfaceUsuario(servicoFuncionario, servicoDepartamento);
		/* Cliente c;
		c = new PessoaFisica("João", "Rua A", "123");
		System.out.println(c.toString());
		c = new PessoaJuridica("Ardidas", "Ardidas Pimentas", "Rua B", "456");
		System.out.println(c.toString()); */
		iu.exibir();
	}
			
	
}
