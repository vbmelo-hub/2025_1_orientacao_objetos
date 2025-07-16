package servico;

import modelo.Autenticavel;
import modelo.departamento.Departamento;
import modelo.funcionario.Diretor;
import modelo.funcionario.Funcionario;
import modelo.funcionario.Gerente;
import modelo.funcionario.Vendedor;
import repositorio.BDSimulado;

public class ServicoFuncionario {
    private Funcionario f;
    private Departamento d;

    public String cadastrarFuncionario(String nome, String cpf, String idDepartamento, String tipo) {
        if(!BDSimulado.verificarDepartamento(idDepartamento)) {
            return "O departamento do cliente não existe!";
        }
        if(BDSimulado.verificarFuncionario(cpf)) {
            return "CPF já cadastrado";
        }
        d = BDSimulado.getDepartamento(idDepartamento);

        if (tipo.equalsIgnoreCase("gerente")) {
            f = new Gerente(nome, cpf, d);
        } else if (tipo.equalsIgnoreCase("diretor")) {
            f = new Diretor(nome, cpf, d);
        } else if (tipo.equalsIgnoreCase("vendedor")) {
            f = new Vendedor(nome, cpf, d);
        }

        d.adicionarFuncionario(f);
        BDSimulado.addFuncionario(f);
        //mudan�a feita para 4/6
        if(f instanceof Autenticavel) {
            BDSimulado.addAutenticavel((Autenticavel) f);
        }
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
        return "Funcion�rio transferido com sucesso";
    }

    public String listarFuncionarios() {
        String lista = "\nLista de funcion�rios: \n";
        for(Funcionario f : BDSimulado.getFuncionarios().values()) {
            lista += f.listarFuncionario() + "\n";
        }
        return lista;
    }
}
