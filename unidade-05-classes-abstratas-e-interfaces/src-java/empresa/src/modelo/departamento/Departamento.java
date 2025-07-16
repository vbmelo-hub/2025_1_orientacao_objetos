package modelo.departamento;
import modelo.funcionario.Funcionario;

import java.util.HashMap;

public class Departamento {
	private String nome;
	private String id;
	private HashMap<String, Funcionario> funcionarios;
	
	public Departamento(String nome, String id) {
		this.nome = nome;
		this.id = id;
		//Cria��o de um novo mapa a cada novo Departamento
		this.funcionarios = new HashMap<String, Funcionario>(); 
	}
	
	public String getId() {
		return id;
	}
	
	public boolean adicionarFuncionario(Funcionario f) {
		//Verificar se o funcionario já não pertece ao departamento (pelo valor)
		if(this.funcionarios.containsKey(f.getId())) {
			return false;
		}
		this.funcionarios.put(f.getId(), f);
		return true;
	}
	
	public boolean removerFuncionario(String matricula) {
		if(this.funcionarios.containsKey(matricula)) {
			funcionarios.remove(matricula);
			return true;
		}
		return false;
	}
	
	public String listarFuncionarios() {
		String lista = "Funcionários do " + this.nome + "\n";
		for(Funcionario m : this.funcionarios.values()) {
			lista += m.listarFuncionario() + "\n";
		}
		return lista;
	}

	public int getQuantidadeFuncionarios() {
		return this.funcionarios.size();
	}
}
