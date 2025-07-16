package modelo.funcionario;

import modelo.departamento.Departamento;

public class Vendedor extends Funcionario {
    private double comissao;

    public Vendedor(String nome, String cpf, Departamento departamento) {
        super(nome, cpf, departamento);
        this.comissao = 0;
    }

    public Vendedor(String nome, String cpf, double salario, Departamento departamento) {
        super(nome, cpf, salario, departamento);
        this.comissao = 0;
    }

    public void vender(String produto, double valor) {
        this.comissao += valor * 0.05;
    }
}
