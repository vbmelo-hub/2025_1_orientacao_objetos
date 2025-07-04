package servico;

import modelo.Autenticavel;

public class ControleInterno {
    public boolean login(Autenticavel autenticavel, String senha) {
        return autenticavel.autenticar(senha);
    }
}
