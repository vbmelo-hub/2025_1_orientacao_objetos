package modelo;

public interface Autenticavel {
    String getId();
    boolean autenticar(String senha);
}
