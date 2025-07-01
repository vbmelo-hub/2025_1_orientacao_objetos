package modelo.cliente;

public abstract class Cliente {
    private String nome;
    private String endereco;

    public Cliente(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public abstract String getID();

    @Override
    public String toString() {
        return "Nome: " + this.nome + "\nEndereço: " + this.endereco;
    }
}

