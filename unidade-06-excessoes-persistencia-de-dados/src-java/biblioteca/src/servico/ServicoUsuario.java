package servico;

import modelo.usuario.Usuario;
import modelo.util.Cpf;

public class ServicoUsuario {
    private Usuario usuario;
    public void cadastrarUsuario(String nome, String cpf){
        usuario = new Usuario(nome, Cpf.getInstance(cpf));
        //guardar usuário em um mapa, por exemplo
    }

    public Usuario getUsuario() {
        return usuario;
    }
}
