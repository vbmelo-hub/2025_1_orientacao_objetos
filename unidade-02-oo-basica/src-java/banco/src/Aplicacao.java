
<<<<<<< HEAD

=======
>>>>>>> 8eea48490e44b1e8921b5cd9781a2fd0dea43abe
public class Aplicacao {

	public static void main(String[] args) {
		Conta cPedro = new Conta();
<<<<<<< HEAD
		cPedro.agencia = "1234";
		cPedro.numero = "12345";
		cPedro.titular = "Pedro";
		cPedro.saldo = 1000.0;
=======
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
>>>>>>> 8eea48490e44b1e8921b5cd9781a2fd0dea43abe
		
		cPedro.depositar(500.0);
		System.out.println("Saldo: " + cPedro.emitirSaldo());
		
		Conta cRicardo = new Conta();
<<<<<<< HEAD
		cRicardo.titular = "Ricardo";
		cRicardo.agencia = "12345";
		cRicardo.saldo = 0.0;
		System.out.println("Saldo: " + cRicardo.emitirSaldo());
		
		cPedro.transferir(cRicardo, 750.0);
		System.out.println("Saldo: " + cPedro.emitirSaldo());
		System.out.println("Saldo: " + cRicardo.emitirSaldo());
		
		System.out.println((cPedro.transferir(cRicardo, 800.00) ? "TransferÃªncia realizada" : "Saldo insuficiente"));
		System.out.println("Saldo: " + cPedro.emitirSaldo());
		System.out.println("Saldo: " + cRicardo.emitirSaldo());
	}
}

=======
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
>>>>>>> 8eea48490e44b1e8921b5cd9781a2fd0dea43abe
