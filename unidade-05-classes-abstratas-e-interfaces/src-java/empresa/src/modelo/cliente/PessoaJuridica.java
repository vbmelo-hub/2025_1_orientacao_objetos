package modelo.cliente;

public class PessoaJuridica extends Cliente{
    private String cnpj;
    private String nomeFantasia;

    public PessoaJuridica(String nome, String nomeFantasia, String endereco, String cnpj) {
        super(nome, endereco);
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
    }

    @Override
    public String getID() {
        return this.cnpj;
    }

    @Override
    public String toString() {
        return "Razão social: " + this.nome +
                "\nNome fantasia: " + this.nomeFantasia
                + super.toString() + "\nCNPJ: " + this.cnpj;
    }
}
