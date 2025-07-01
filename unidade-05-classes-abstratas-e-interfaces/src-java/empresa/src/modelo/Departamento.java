package modelo;
import java.util.HashMap;

public class Departamento {
	private String nome;
	private String id;
	private HashMap<String, Funcionario> funcionarios;
	
	public Departamento(String nome, String id) {
		this.nome = nome;
		this.id = id;
		//CriaÁ„o de um novo mapa a cada novo Departamento
		this.funcionarios = new HashMap<String, Funcionario>(); 
	}
	
	public String getId() {
		return id;
	}
	
	public boolean adicionarFuncionario(Funcionario f) {
		//Verificar se o funcionario j√° n√£o pertece ao departamento (pelo valor)
		if(this.funcionarios.containsKey(f.getMatricula())) {
			return false;
		}
		this.funcionarios.put(f.getMatricula(), f);
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
		String lista = "Funcion·rios do " + this.nome + "\n";
		for(Funcionario m : this.funcionarios.values()) {
			lista += m.listarFuncionario() + "\n";
		}
		return lista;
	}
	
	public String emitirRelatorioUmFuncionario(String matriculaFuncionario) {
		return this.funcionarios.get(matriculaFuncionario).toString() +
				"\nDepartamento: " + this.nome;
	}
	
	public int getQuantidadeFuncionarios() {
		return this.funcionarios.size();
	}
}
