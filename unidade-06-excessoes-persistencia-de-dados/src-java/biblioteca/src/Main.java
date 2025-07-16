import servico.ServicoUsuario;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ServicoUsuario su = new ServicoUsuario();

        //su.cadastrarUsuario("Pedro", "123.456.789-00");
        su.cadastrarUsuario("Maria", "987.654.321-99");
        System.out.println(su.getUsuario().getCpf().getCpf());

    }
}