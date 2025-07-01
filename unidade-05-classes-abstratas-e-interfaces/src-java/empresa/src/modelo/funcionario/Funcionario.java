package modelo.funcionario;

import modelo.departamento.Departamento;

public abstract class Funcionario {
	private String matricula;
	private String nome;
	private String cpf;
	protected double salario;
	protected double bonificacao;
	private Departamento departamento;
	
	private static int contador = 0;
	
	
	public Funcionario(String nome, String cpf, Departamento departamento) {
		this.nome = nome;
		this.cpf = cpf;
		this.departamento = departamento;
		contador++;
		this.matricula = this.definirMatricula();
	}
	
	

	public Funcionario(String nome, String cpf, double salario, Departamento departamento) {
		this(nome, cpf, departamento);
		this.salario = salario;
	}


	//M?todo usado somente pelo pr?prio objeto
	private String definirMatricula() {
		String mat = Integer.toString(contador);
		while(mat.length()<3) mat = "0" + mat;
		String[] s = this.nome.split(" ");
		mat = s[s.length-1].charAt(0) + mat;
		mat = this.nome.charAt(0) + mat;
		return mat.toUpperCase();
	}

	public abstract void bonificar();
	
	public boolean concederAumento(double salario) {
		//Verificar se a mudan?a de saldo ? realmente um aumento
		if(this.salario < salario) {
			this.salario = salario;
			return true;
		}
		return false;		
	}
	
	public double getVencimentoMensal() {
		return this.salario + this.bonificacao;
	}
	
	public String getMatricula() {
		return this.matricula;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public double getBonificacao() {
		return this.bonificacao;
	}
	
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
	public Departamento getDepartamento() {
		return departamento;
	}
	
	@Override
	public String toString() {
		String relatorio = "\nNome: " + this.nome;
		relatorio += "\nMatr?cula: " + this.matricula;
		relatorio += "\nCPF: " + this.cpf;
		relatorio += "\nSal?rio: " + this.salario;
		relatorio += "\nVencimento mensal: " + this.getVencimentoMensal();
		return relatorio;
	}
	
	public String listarFuncionario() {
		return this.matricula + " - " + this.nome; 
	}
}
