public class Servico {
    public String realizarPagamento(MetodoPagamento metodo, double valor) {
        return metodo.processarPagamento(valor);
    }

    public double getTotalPagamento(MetodoPagamento metodo) {
        return metodo.getTotalPagamento();
    }
}
