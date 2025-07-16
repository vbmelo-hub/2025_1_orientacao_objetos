package modelo.util;

public class Cpf {
    private String cpf;

    public static Cpf getInstance(String cpf){
        /// vários codigos
        //verificar se o cpf é válido
        Cpf instanceCpf = new Cpf(cpf);
        return instanceCpf;
    }

    private Cpf(String cpf) {
        this.cpf = cpf;
    }
    public String getCpf() {
        return cpf;
    }
}
