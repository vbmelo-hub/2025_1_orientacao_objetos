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
		return "R$ " + Double.toString(this.saldo);
	}
}
