import java.text.DecimalFormat;

public class Conta {
	public String titular;
	public double saldo;
	public String numero;
	public String agencia;
	public double limite;
	public boolean sacar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public boolean transferir(Conta destino, double valor) {
		if (this.sacar(valor)) {
			destino.depositar(valor);
			return true;
		}
		return false;
	}
	
	public String emitirSaldo() {
		//String valor = String.format("%.2f", this.saldo);
		DecimalFormat df = new DecimalFormat("###,##0.00");
		String valor = df.format(this.saldo);
		if (this.saldo < 0) return "R$ " + df.format(Math.abs(this.saldo)) + " D";
		return "R$ " + valor;
	}
	
	@Override
	public String toString() {
		String relatorio = "Agência: " + this.agencia;
		relatorio += "\nConta: " + this.numero;
		relatorio += "\nCliente: " + this.titular;
		relatorio += "\nSaldo: " + this.emitirSaldo();
		relatorio += "\nLimite Disponível: " + (this.saldo >= 0 ? this.limite : this.limite + this.saldo);
		return relatorio;
	}
}
