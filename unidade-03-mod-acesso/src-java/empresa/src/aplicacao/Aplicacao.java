package aplicacao;

import java.util.Scanner;
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
				System.out.println("VocÍ escolheu sair do sistema");
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
				System.out.print("Nome do funcion·rio: ");
				nome = teclado.nextLine();
				System.out.print("CPF do funcion√°rio: ");
				String cpf = teclado.nextLine();
				System.out.print("ID do departamento de lotaÁ„o: ");
				identificador = teclado.nextLine();
				System.out.println(servico.cadastrarFuncionario(nome, cpf, identificador));
				break;
				
			case 4:
				System.out.print("MatrÌcula do funcion√°rio: ");
				matricula = teclado.nextLine();
				System.out.println("OperaÁ„o realizada");
				break;
				
			case 5:
				System.out.print("MatrÌcula do funcion√°rio: ");
				matricula = teclado.nextLine();
				System.out.print("ID do departamento de lota√ß√£o atual: ");
				identificador = teclado.nextLine();
				System.out.print("ID do departamento de lota√ß√£o de destino: ");
				String idDestino = teclado.nextLine();
				System.out.println(servico.trasferirFuncionarioDepartamento(matricula, identificador, idDestino));
				break;
				
			case 6:
				System.out.print("Identificador do departamento: ");
				identificador = teclado.nextLine();
				System.out.println(servico.listarFuncionariosDepartamento(identificador));
				break;
				
			case 7: 
				System.out.println(servico.listarFuncionarios());
				break;
				
			default:
				System.out.println("OpÁ„o inv·lida");;
			}
			
		}while(opcao != 0);
		
		teclado.close();
		
	}
	
	public static void imprimirMenu() {
		String menu = "\n\n============================================\nEscolha uma opÁ„o: ";
		menu += "\n1. Cadastrar departamento";
		menu += "\n2. Remover departamento";
		menu += "\n3. Cadastrar funcion√°rio";
		menu += "\n4. Remover funcion√°rio";
		menu += "\n5. Transferir funcion√°rio de departamento";
		menu += "\n6. Listar funcion√°rios de um departamento";
		menu += "\n7. Listar todos os funcion√°rios";
		menu += "\n0. Sair do sistema";
		System.out.println(menu);
	}

}
