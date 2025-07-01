package modelo.cliente;

public class PessoaJuridica extends Cliente{
    private String cnpj;

    public PessoaJuridica(String nome, String endereco, String cnpj) {
        super(nome, endereco);
        this.cnpj = cnpj;
    }

    @Override
    public String getID() {
        return this.cnpj;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCNPJ: " + this.cnpj;
    }
}
