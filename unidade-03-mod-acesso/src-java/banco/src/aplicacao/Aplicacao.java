package aplicacao;
import java.util.Scanner;

import modelo.Cliente;
import modelo.Conta;
import servico.ServicoBanco;

public class Aplicacao {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		ServicoBanco sb = new ServicoBanco();
		byte opcao;
		do {
			Aplicacao.printMenu();
			opcao = Byte.parseByte(teclado.nextLine());
			switch (opcao) {
			case 1:
				System.out.print("Nome: ");
				String nome = teclado.nextLine();
				System.out.print("CPF: ");
				String cpf = teclado.nextLine();
				System.out.print("Data de nascimento: ");
				String dn = teclado.nextLine();
				System.out.println("Deseja adicionar um endereço? (S/N) ");
				char sn = teclado.nextLine().charAt(0);
				if (sn == 'S') {
					System.out.print("Endereço: ");
					String endereco = teclado.nextLine();
					sb.criarCliente(nome, cpf, endereco, dn);
				} else {
					sb.criarCliente(nome, cpf, dn);
				}
				break;
			case 2:
				System.out.print("Número da conta: ");
				String numero = teclado.nextLine();
				System.out.print("Agência: ");
				String agencia = teclado.nextLine();
				System.out.print("Deseja adicionar um cliente? (S/N) ");
				sn = teclado.nextLine().charAt(0);
				if (sn == 'S') {
					System.out.print("Informe o CPF do cliente: ");
					cpf = teclado.nextLine();
					sb.criarConta(numero, agencia, cpf);
				} else {
					sb.criarConta(numero, agencia);
				}				
				break;
			case 3: 
				System.out.print("Número da conta: ");
				numero = teclado.nextLine();
				System.out.print("CPF: ");
				cpf = teclado.nextLine();
				System.out.println(sb.atribuirClienteConta(numero, cpf));
				break;
			case 4:
				System.out.print(sb.getRelatorioClientes());
				break;
			case 5:
				System.out.print("Número da conta: ");
				System.out.print(sb.getRelatorioConta(teclado.nextLine()));
				break;
			case 0:
				System.out.print("Você escolheu sair do sistema.");
				break;
			default:
				System.out.print("Opção inválida!");
				break;
			}
		} while (opcao != 0);
		
		teclado.close();
	}
	public static void printMenu() {
		String menu = "\nEscolha uma opção: \n";
		menu += "1 - Criar cliente \n";
		menu += "2 - Criar conta \n";
		menu += "3 - Atribuir um cliente a conta \n";
		menu += "4 - Emitir relatório de clientes \n";
		menu += "5 - Emitir relatório de uma conta \n";
		menu += "0 - Sair \n";
		System.out.println(menu);
	}

}