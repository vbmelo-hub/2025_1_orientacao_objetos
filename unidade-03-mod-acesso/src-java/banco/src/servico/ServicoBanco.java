package servico;

import modelo.Cliente;
import modelo.Conta;
import repositorio.BDSimulado;

public class ServicoBanco {
	
	public void criarCliente(String nome, String cpf, String dataNascimento) {
		Cliente c = new Cliente(nome, cpf, dataNascimento);
		//BDSimulado.getClientes().put(cpf, c); 
		BDSimulado.addCliente(cpf, c);
	}
	public void criarCliente(String nome, String cpf, String endereco, String dataNascimento) {
		//this.criarCliente(nome, cpf, dataNascimento);
		//BDSimulado.getClientes().get(cpf).setEndereco(endereco);
		Cliente c = new Cliente(nome, cpf, endereco, dataNascimento);
		BDSimulado.addCliente(cpf, c);
	}
	public void criarConta(String numero, String agencia) {
		Conta c = new Conta(numero, agencia);
		BDSimulado.addConta(numero, c);
	}
	public void criarConta(String numero, String agencia, String cpfCliente) {
		this.criarConta(numero, agencia);
		Cliente cl = BDSimulado.getClientes().get(cpfCliente);
		System.err.println(cl);
		//System.err.println(BDSimulado.getContas().get(numero).toString());

		BDSimulado.getContas().get(numero).setTitular(cl);
	}
	public String atribuirClienteConta(String numero, String cpf) {
		if (BDSimulado.getClientes().get(cpf) == null) {
			return "Cliente inexistente!";
		}
		if (BDSimulado.getContas().get(numero) == null) {
			return "Conta inexistente!";
		}
		if (BDSimulado.getContas().get(numero).getTitular() != null) {
			return "Esta conta já tem um cliente!";
		}
		BDSimulado.getContas().get(numero).setTitular(BDSimulado.getClientes().get(cpf));
		return "Cliente atribuido com sucesso!";
	}
	public String getRelatorioClientes() {
		String relatorio = "";
		for (Cliente c : BDSimulado.getClientes().values()) {
			relatorio += c.toString();
			relatorio += "\n=============================\n";
		}
		return relatorio;
	}
	public String getRelatorioConta(String numero) {
		return BDSimulado.getContas().get(numero).toString();
	}
}
