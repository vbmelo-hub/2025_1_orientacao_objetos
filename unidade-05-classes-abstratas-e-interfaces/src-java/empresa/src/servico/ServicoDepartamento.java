package servico;

import modelo.departamento.Departamento;
import repositorio.BDSimulado;

public class ServicoDepartamento {
    private Departamento d;

    public String cadastrarDepartamento(String nome, String id) {
        d = new Departamento(nome, id);
        if(BDSimulado.addDepartamento(d)) {
            return "Departamento cadastrado com sucesso!";
        }
        return "Este departamento já está cadastrado!";
    }

    public String removerDepartamento(String id) {
        if(BDSimulado.getDepartamento(id).getQuantidadeFuncionarios() == 0) {
            BDSimulado.removerDepartamento(id);
            return "Departamento removido com sucesso";
        }
        return "Um departamento com funcion�rios n�o pode ser exclu�do";
    }

    public String listarFuncionariosDepartamento(String id) {
        Departamento d = BDSimulado.getDepartamento(id);
        return d.listarFuncionarios();
    }
}
