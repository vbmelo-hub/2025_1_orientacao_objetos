package modelo.fornecedor;

import modelo.Autenticavel;

public class Fornecedor implements Autenticavel {
    private String cnpj;
    private String razaoSocial;
    private String senha;

    public Fornecedor(String cnpj, String razaoSocial, String senha) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.senha = senha;
    }

    @Override
    public String getId() {
        return cnpj;
    }

    @Override
    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }
}
