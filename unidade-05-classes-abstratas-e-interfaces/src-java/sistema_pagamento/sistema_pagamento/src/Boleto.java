public class Boleto implements MetodoPagamento {
    private double total = 0;
    @Override
    public String processarPagamento(double valor) {
        total += valor;
        return "Boleto gerado no valor de: R$ " + valor;
    }

    @Override
    public double getTotalPagamento() {
        return total;
    }
}
