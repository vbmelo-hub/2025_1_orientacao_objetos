package modelo.funcionario;

import modelo.departamento.Departamento;

public class Vendedor extends Funcionario{

    public Vendedor(String nome, String cpf, Departamento departamento) {
        super(nome, cpf, departamento);
    }

    public Vendedor(String nome, String cpf, double salario, Departamento departamento) {
        super(nome, cpf, salario, departamento);
    }

    public void vender(String produto, double valor) {
        this.bonificacao += valor * 0.05;
    }

    @Override
    public void bonificar() {
        this.bonificacao += salario * 0.05;
    }
}
