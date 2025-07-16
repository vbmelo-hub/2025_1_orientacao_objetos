package ui;

import java.util.Scanner;

import servico.Servico;

public class InterfaceUsuario {

	private Scanner teclado;
	private Servico servico;

	public InterfaceUsuario(Servico servico) {
		this.servico = servico;
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
				cadastrarFuncionario("funcionario");
				break;
				
			case 4:
				cadastrarFuncionario("gerente");
				break;
				
			case 5:
				cadastrarFuncionario("diretor");
				break;
				
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
				System.out.println(servico.listarFuncionarios());
				break;
				
			default:
				System.out.println("Opção Invalida.");
			break;
			
			}		
		}while (opcao != 0);
		teclado.close();
		
		
		
	}

	private void listarFuncionariosDepartamento() {
		  System.out.print("ID do departamento: ");
	        String id = teclado.nextLine();
	        System.out.println(servico.listarFuncionariosDepartamento(id));
		
	}

	private void transferirFuncionario() {
		 System.out.print("Matrícula do funcionário: ");
	        String matricula = teclado.nextLine();
	        System.out.print("ID do departamento de origem: ");
	        String idOrigem = teclado.nextLine();
	        System.out.print("ID do departamento de destino: ");
	        String idDestino = teclado.nextLine();
	        System.out.println(servico.trasferirFuncionarioDepartamento(matricula, idOrigem, idDestino));
		
	}

	private void removerfuncionario() {
		System.out.print("Matrícula do funcionário: ");
        String matricula = teclado.nextLine();
		servico.removerFuncionario(matricula);
		
	}

	private void cadastrarFuncionario(String tipo) {
		 System.out.print("Nome do " + tipo + ": ");
	        String nome = teclado.nextLine();
	        System.out.print("CPF do " + tipo + ": ");
	        String cpf = teclado.nextLine();
	        System.out.print("ID do departamento de lotação: ");
	        String idDepartamento = teclado.nextLine();
	        System.out.print("Salário: ");
	        double salario = Double.parseDouble(teclado.nextLine());
	        System.out.println(servico.cadastrarFuncionario(nome, cpf,idDepartamento, tipo));
		
	}

	private void removerDepartamento() {
		   System.out.print("ID do departamento: ");
	        String id = teclado.nextLine();
	        System.out.println(servico.removerDepartamento(id));
		
	}

	private void cadastrarDepartamento() {
        System.out.print("Nome do departamento: ");
        String nome = teclado.nextLine();
        System.out.print("ID do departamento: ");
        String id = teclado.nextLine();
        System.out.println(servico.cadastrarDepartamento(nome, id));

		
	}

	private void imprimirMenu() {
		StringBuilder menu = new StringBuilder();
		menu.append("\n============================================\n");
        menu.append("Escolha uma opção:\n");
        menu.append("1. Cadastrar departamento\n");
        menu.append("2. Remover departamento\n");
        menu.append("3. Cadastrar funcionário\n");
        menu.append("4. Cadastrar gerente\n");
        menu.append("5. Cadastrar diretor\n");
        menu.append("6. Remover funcionário\n");
        menu.append("7. Transferir funcionário de departamento\n");
        menu.append("8. Listar funcionários de um departamento\n");
        menu.append("9. Listar todos os funcionários\n");
        menu.append("0. Sair do sistema\n");
        System.out.println(menu);
		
	}
	
}
