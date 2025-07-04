public class Pix implements MetodoPagamento {
    private double total = 0;
    @Override
    public String processarPagamento(double valor) {
        total += (valor * 0.9);
        return "Cobrança pix no valor de: R$ " + (valor * 0.9);
    }

    @Override
    public double getTotalPagamento() {
        return total;
    }
}
