public interface MetodoPagamento {
    String processarPagamento(double valor);
    double getTotalPagamento();
}
