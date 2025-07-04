package modelo.cliente;

public class PessoaFisica extends Cliente{
    private String cpf;

    public PessoaFisica(String nome, String endereco, String cpf) {
        super(nome, endereco);
        this.cpf = cpf;
    }

    @Override
    public String getID() {
        return this.cpf;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + super.toString() + "\nCPF: " + this.cpf;
    }
}
