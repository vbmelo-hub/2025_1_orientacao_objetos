package repositorio;

import java.util.HashMap;

import modelo.Cliente;
import modelo.Conta;

public class BDSimulado {
	private static HashMap<String, Cliente> clientes = new HashMap <String, Cliente>();
	private static HashMap<String, Conta> contas = new HashMap <String, Conta>();
	public static HashMap<String, Cliente> getClientes() {
		return clientes;
	}
	public static HashMap<String, Conta> getContas() {
		return contas;
	}
	
	public static boolean addCliente(String chave, Cliente c) {
		if(clientes.get(chave) == null) {
			clientes.put(chave, c);
			return true;
		}
		return false;
	}
	public static boolean addConta(String chave, Conta c) {  
		if(contas.get(chave) == null) {
			contas.put(chave, c);
			return true;
		}
		return false;
	}
}
