

public class Aplicacao {

	public static void main(String[] args) {
		Conta cPedro = new Conta();
		cPedro.agencia = "1234";
		cPedro.numero = "12345";
		cPedro.titular = "Pedro";
		cPedro.saldo = 1000.0;
		
		cPedro.depositar(500.0);
		System.out.println("Saldo: " + cPedro.emitirSaldo());
		
		Conta cRicardo = new Conta();
		cRicardo.titular = "Ricardo";
		cRicardo.agencia = "12345";
		cRicardo.saldo = 0.0;
		System.out.println("Saldo: " + cRicardo.emitirSaldo());
		
		cPedro.transferir(cRicardo, 750.0);
		System.out.println("Saldo: " + cPedro.emitirSaldo());
		System.out.println("Saldo: " + cRicardo.emitirSaldo());
		
		System.out.println((cPedro.transferir(cRicardo, 800.00) ? "Transferência realizada" : "Saldo insuficiente"));
		System.out.println("Saldo: " + cPedro.emitirSaldo());
		System.out.println("Saldo: " + cRicardo.emitirSaldo());
	}
}

