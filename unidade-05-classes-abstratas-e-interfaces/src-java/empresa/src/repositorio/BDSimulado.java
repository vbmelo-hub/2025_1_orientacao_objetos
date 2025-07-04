package repositorio;

import java.util.HashMap;
import java.util.Map;

import modelo.Autenticavel;
import modelo.departamento.Departamento;
import modelo.funcionario.Funcionario;

public class BDSimulado {
	
	private static Map<String, Departamento> departamentos = new HashMap<String, Departamento>();
	private static Map<String, Funcionario> funcionarios = new HashMap<String, Funcionario>();
	private static Map<String, Autenticavel> autenticaveis = new HashMap<String, Autenticavel>();
	
	public static boolean addDepartamento(Departamento d) {
		if(departamentos.containsKey(d.getId())) return false; 
		departamentos.put(d.getId(), d);
		return true;
	}
	
	public static void removerDepartamento(String id) {
		departamentos.remove(id);
	}
	
	public static boolean addFuncionario(Funcionario f) {
		if(funcionarios.containsKey(f.getMatricula())) { //Verifica por matr?cula
			return false;
		}
		
		if(verificarFuncionario(f.getCpf())) { //Verifica se o cpf existe
			return false;
		}
		
		funcionarios.put(f.getMatricula(), f);
		return true;
	}
	
	public static void removerFuncionario(String matricula) {		
		funcionarios.remove(matricula); //Remove o funcion?rio do mapa de funcion?rios da empres
	}
	
	public static boolean verificarDepartamento(String id) {
		return departamentos.containsKey(id);
	}
	
	public static boolean verificarFuncionario(String cpf) {
		for(Funcionario f : funcionarios.values()) {
			if(f.getCpf().equals(cpf)) return true;
		}
		return false;
	}

	public static boolean addAutenticavel(Autenticavel a) {
		if(autenticaveis.containsKey(a.getId())) {
			return false;
		}

		autenticaveis.put(a.getId(), a);
		return true;
	}

	public static boolean verificarAutenticavel(String cnpj) {
		for(Autenticavel a : autenticaveis.values()) {
			if(a.getId().equals(cnpj)) return true;
		}
		return false;
	}
	
	public static Departamento getDepartamento(String id) {
		return departamentos.get(id);
	}
	
	public static Funcionario getFuncionario(String matricula) {
		return funcionarios.get(matricula);
	}
	
	public static Map<String, Funcionario> getFuncionarios() {
		return funcionarios;
	}
}
