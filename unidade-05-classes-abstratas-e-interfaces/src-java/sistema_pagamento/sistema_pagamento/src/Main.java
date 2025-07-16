public class Main {
    public static void main(String[] args) {
        Servico servico = new Servico();
        MetodoPagamento cartaoCredito = new CartaoCredito();
        MetodoPagamento pix = new Pix();
        MetodoPagamento boleto = new Boleto();

        System.out.println(servico.realizarPagamento(cartaoCredito, 1000));
        System.out.println(servico.realizarPagamento(pix, 1000));
        System.out.println(servico.realizarPagamento(boleto, 1000));
        System.out.println(servico.realizarPagamento(cartaoCredito, 1000));
        System.out.println(servico.realizarPagamento(pix, 1000));
        System.out.println(servico.realizarPagamento(boleto, 1000));

        System.out.println(servico.getTotalPagamento(cartaoCredito));
    }
}