package servico;

import modelo.Cliente;
import repositorio.BDSimulado;

public class ServicoBanco {
	public void criarConta() {
		
	}
	public void criarCliente(String nome, String cpf, String dataNascimento) {
		Cliente c = new Cliente(nome, cpf, dataNascimento);
		BDSimulado.getClientes().put(cpf, c); 
	}
	public void criarCliente(String nome, String cpf, String endereco, String dataNascimento) {
		//this.criarCliente(nome, cpf, dataNascimento);
		//BDSimulado.getClientes().get(cpf).setEndereco(endereco);
		Cliente c = new Cliente(nome, cpf, endereco, dataNascimento);
		BDSimulado.getClientes().put(cpf, c);
	}
}
