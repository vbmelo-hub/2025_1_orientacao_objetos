package modelo.funcionario;

import modelo.departamento.Departamento;

public abstract class FuncionarioBonificavel extends Funcionario{
    protected double bonificacao;

    public FuncionarioBonificavel(String nome, String cpf, Departamento departamento) {
        super(nome, cpf, departamento);
    }

    public FuncionarioBonificavel(String nome, String cpf, double salario, Departamento departamento) {
        super(nome, cpf, salario, departamento);
    }

    public double getBonificacao() {
        return bonificacao;
    }

    public abstract void bonificar();
}
