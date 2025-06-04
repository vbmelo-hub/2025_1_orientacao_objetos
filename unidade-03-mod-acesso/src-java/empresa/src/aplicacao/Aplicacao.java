package aplicacao;

import java.util.HashMap;
import java.util.Scanner;

import modelo.Departamento;
import modelo.Funcionario;
import servico.Servico;

public class Aplicacao {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nome;
		String identificador;
		String matricula;
		Servico servico = new Servico();
		byte opcao = 0;
		do {
			imprimirMenu();
			opcao = Byte.parseByte(teclado.nextLine());
			switch (opcao) {
			case 0: 
				System.out.println("Você escolheu sair do sistema");
				break;
			
			case 1: 
				System.out.print("Nome do departamento: ");
				nome = teclado.nextLine();
				System.out.print("ID do departamento: ");
				identificador = teclado.nextLine();
				System.out.println(servico.cadastrarDepartamento(nome, identificador));
				break;
			
			case 2:
				System.out.print("ID do departamento: ");
				identificador = teclado.nextLine();
				System.out.println(servico.removerDepartamento(identificador));
				break;
				
			case 3: 
				System.out.print("Nome do funcionário: ");
				nome = teclado.nextLine();
				System.out.print("CPF do funcionário: ");
				String cpf = teclado.nextLine();
				System.out.print("ID do departamento de lotação: ");
				identificador = teclado.nextLine();
				System.out.println(servico.cadastrarFuncionario(nome, cpf, identificador));
				break;
				
			case 4:
				System.out.print("Matrícula do funcionário: ");
				matricula = teclado.nextLine();
				System.out.println("Operação realizada");
				break;
				
			case 5:
				System.out.print("Matrícula do funcionário: ");
				matricula = teclado.nextLine();
				System.out.print("ID do departamento de lotação atual: ");
				identificador = teclado.nextLine();
				System.out.print("ID do departamento de lotação de destino: ");
				String idDestino = teclado.nextLine();
				System.out.println(servico.trasferirFuncionarioDepartamento(matricula, identificador, idDestino));
				break;
				
			case 6:
				System.out.print("Identificador do departamento: ");
				identificador = teclado.nextLine();
				System.out.println(servico.listarFuncionariosDepartamento(identificador));
				break;
				
			default:
				System.out.println("Opção inválida");;
			}
			
		}while(opcao != 0);
		
		teclado.close();
		
	}
	
	public static void imprimirMenu() {
		String menu = "\n\n============================================\nEscolha uma opção: ";
		menu += "\n1. Cadastrar departamento";
		menu += "\n2. Remover departamento";
		menu += "\n3. Cadastrar funcionário";
		menu += "\n4. Remover funcionário";
		menu += "\n5. Transferir funcionário de departamento";
		menu += "\n6. Listar funcionários de um departamento";
		menu += "\n0. Sair do sistema";
		System.out.println(menu);
	}

}
