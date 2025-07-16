package ui;

import servico.ServicoDepartamento;
import servico.ServicoFuncionario;

import java.util.Scanner;

public class InterfaceUsuario {

	private Scanner teclado;
	private ServicoFuncionario servicoFuncionario;
	private ServicoDepartamento servicoDepartamento;

	public InterfaceUsuario(ServicoFuncionario servicoFuncionario, ServicoDepartamento servicoDepartamento) {
		this.servicoFuncionario = servicoFuncionario;
		this.servicoDepartamento = servicoDepartamento;
		this.teclado = new Scanner(System.in);
	}

	public void exibir() {
		byte opcao;
		do {
			imprimirMenu();
			opcao = Byte.parseByte(teclado.nextLine());
			switch (opcao) {
			case 0:
				System.out.println("Voce escolheu sair do sistema.");
				break;
			case 1:
				cadastrarDepartamento();
				break;
				
			case 2:
				removerDepartamento();
				break;
				
			case 3:
				cadastrarFuncionario("gerente");
				break;
				
			case 4:
				cadastrarFuncionario("diretor");
				break;

			case 5:
				cadastrarFuncionario("vendedor");

			case 6:
				removerfuncionario();
				break;
				
			case 7:
				transferirFuncionario();
				break;
				
			case 8:
				listarFuncionariosDepartamento();
				break;
				
			case 9:
				System.out.println(servicoFuncionario.listarFuncionarios());
				break;
				
			default:
				System.out.println("Op��o Invalida.");
			break;
			
			}		
		}while (opcao != 0);
		teclado.close();
	}

	private void listarFuncionariosDepartamento() {
		  System.out.print("ID do departamento: ");
	        String id = teclado.nextLine();
	        System.out.println(servicoDepartamento.listarFuncionariosDepartamento(id));
	}

	private void transferirFuncionario() {
		 System.out.print("Matr�cula do funcion�rio: ");
	        String matricula = teclado.nextLine();
	        System.out.print("ID do departamento de origem: ");
	        String idOrigem = teclado.nextLine();
	        System.out.print("ID do departamento de destino: ");
	        String idDestino = teclado.nextLine();
	        System.out.println(servicoFuncionario.trasferirFuncionarioDepartamento(matricula, idOrigem, idDestino));
	}

	private void removerfuncionario() {
		System.out.print("Matr�cula do funcion?rio: ");
        String matricula = teclado.nextLine();
		servicoFuncionario.removerFuncionario(matricula);
	}

	private void cadastrarFuncionario(String tipo) {
		 System.out.print("Nome do " + tipo + ": ");
	        String nome = teclado.nextLine();
	        System.out.print("CPF do " + tipo + ": ");
	        String cpf = teclado.nextLine();
	        System.out.print("ID do departamento de lota��o: ");
	        String idDepartamento = teclado.nextLine();
	        System.out.print("Sal�rio: ");
	        double salario = Double.parseDouble(teclado.nextLine());
	        System.out.println(servicoFuncionario.cadastrarFuncionario(nome, cpf,idDepartamento, tipo));
	}

	private void removerDepartamento() {
		   System.out.print("ID do departamento: ");
	        String id = teclado.nextLine();
	        System.out.println(servicoDepartamento.removerDepartamento(id));
	}

	private void cadastrarDepartamento() {
        System.out.print("Nome do departamento: ");
        String nome = teclado.nextLine();
        System.out.print("ID do departamento: ");
        String id = teclado.nextLine();
        System.out.println(servicoDepartamento.cadastrarDepartamento(nome, id));
	}

	private void imprimirMenu() {
		StringBuilder menu = new StringBuilder();
		menu.append("\n============================================\n");
        menu.append("Escolha uma op��o:\n");
        menu.append("1. Cadastrar departamento\n");
        menu.append("2. Remover departamento\n");
        menu.append("3. Cadastrar gerente\n");
        menu.append("4. Cadastrar diretor\n");
		menu.append("5. Cadastrar vendedor\n");
        menu.append("6. Remover funcion�rio\n");
        menu.append("7. Transferir funcion�rio de departamento\n");
        menu.append("8. Listar funcion�rios de um departamento\n");
        menu.append("9. Listar todos os funcion�rios\n");
        menu.append("0. Sair do sistema\n");
        System.out.println(menu);
	}
	
}
