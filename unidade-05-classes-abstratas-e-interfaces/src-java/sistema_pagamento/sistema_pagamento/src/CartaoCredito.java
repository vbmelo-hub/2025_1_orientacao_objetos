public class CartaoCredito implements MetodoPagamento {
    private double total = 0;
    @Override
    public String processarPagamento(double valor) {
        total += (valor * 1.05);
        return "Pagamento com cartão de crédito no valor de: R$ "
                + (valor * 1.05);
    }

    @Override
    public double getTotalPagamento() {
        return total;
    }
}
