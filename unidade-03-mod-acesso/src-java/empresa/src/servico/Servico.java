package servico;

import modelo.Departamento;
import modelo.Funcionario;
import repositorio.BDSimulado;

//Classe que implementa os casos de uso
public class Servico {
	
	private Departamento d;
	private Funcionario f;
	
	public String cadastrarDepartamento(String nome, String id) {
		d = new Departamento(nome, id);
		if(BDSimulado.addDepartamento(d)) {
			return "Departamento cadastrado com sucesso!";
		}
		return "Este departamento já está cadastrado!";
	}
	
	public void removerDepartamento(String id) {
		BDSimulado.removerDepartamento(id);
	}
	
	public String cadastrarFuncionario(String nome, String cpf, String idDepartamento) {
		if(!BDSimulado.verificarDepartamento(idDepartamento)) {
			return "O departamento do cliente não existe!";
		}
		if(BDSimulado.verificarFuncionario(cpf)) {
			return "CPF já cadastrado";
		}
		f = new Funcionario(nome, cpf, d);
		BDSimulado.addFuncionario(f);
		return "Funcionário cadastrado com sucesso";
	}
	
	public void removerFuncionario(String matricula) {
		Departamento d = BDSimulado.getFuncionario(matricula).getDepartamento();
		d.removerFuncionario(matricula);
		BDSimulado.removerFuncionario(matricula);
	}
	
	public String trasferirFuncionarioDepartamento(String matricula, String idOrigem, String idDestino) {
		if(!BDSimulado.verificarDepartamento(idDestino) || !BDSimulado.verificarDepartamento(idOrigem)) {
			return "Departamento de origem ou destino inexistente";
		}
		BDSimulado.getDepartamento(idOrigem).removerFuncionario(matricula);
		BDSimulado.getDepartamento(idDestino).adicionarFuncionario(BDSimulado.getFuncionario(matricula));
		BDSimulado.getFuncionario(matricula).setDepartamento(BDSimulado.getDepartamento(idDestino));
		return "Funcionário transferido com sucesso";
	}

}
