package servico;

import modelo.Autenticavel;
import modelo.fornecedor.Fornecedor;
import repositorio.BDSimulado;

public class ServicoFornecedor {

    public String cadastrarFornecedor(String nome, String cnpj, String senha) {
        if(BDSimulado.verificarAutenticavel(cnpj)) {
            return "Fornecedor já cadastrado";
        }

        Autenticavel fornecedor = new Fornecedor(cnpj, nome, senha);
        BDSimulado.addAutenticavel(fornecedor);
        return "Fornecedor cadastrado com sucesso";
    }
}
