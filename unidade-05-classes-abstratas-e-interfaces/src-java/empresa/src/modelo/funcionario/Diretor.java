package modelo.funcionario;

import modelo.departamento.Departamento;

public class Diretor extends Gerente {

	public Diretor(String nome, String cpf, double salario, Departamento departamento) {
		super(nome, cpf, salario, departamento);
	}
	
	public Diretor(String nome, String cpf, Departamento departamento){
		super(nome, cpf, departamento);
		
		
		
	}
	
	@Override
	public void bonificar() {
		super.bonificar();
		this.bonificacao += 1000.0;
	}
}
