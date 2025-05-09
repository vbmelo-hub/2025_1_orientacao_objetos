
public class Aplicacao {

	public static void main(String[] args) {
		Conta cPedro = new Conta();
		Cliente cliente1 = new Cliente();
		cliente1.nome = "Pedro";
		cliente1.endereco = "Rua A";
		cliente1.cpf = "123456789-00";
		cliente1.dataNascimento = "26-01-2000";
		cPedro.agencia = "1234";
		cPedro.numero = "12345";
		cPedro.titular = cliente1;
		cPedro.saldo = 1000.0;
		cPedro.limite = 500.0;
		
		cPedro.depositar(500.0);
		System.out.println("Saldo: " + cPedro.emitirSaldo());
		
		Conta cRicardo = new Conta();
		cRicardo.agencia = "12345";
		cRicardo.saldo = 0.0;
		cRicardo.limite = 200.0;
		System.out.println("Saldo: " + cRicardo.emitirSaldo());
		
		cPedro.transferir(cRicardo, 750.0);
		//System.out.println("Saldo: " + cPedro.emitirSaldo());
		//System.out.println("Saldo: " + cRicardo.emitirSaldo());
		
		System.out.println((cPedro.transferir(cRicardo, 800.0) ? "Transferência Realizada" : "Saldo Insuficiente" ));
		//System.out.println("Saldo: " + cPedro.emitirSaldo());
		//System.out.println("Saldo: " + cRicardo.emitirSaldo());
		cPedro.sacar(800.0);
		System.out.println(cPedro);
	}

}
