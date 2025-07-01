package aplicacao;

import java.util.Scanner;

import modelo.Departamento;
import modelo.Diretor;
import modelo.Funcionario;
import modelo.Gerente;
import servico.ControleBonificacao;
import servico.Servico;
import ui.InterfaceUsuario;

public class Aplicacao {

	public static void main(String[] args) {
	Servico servico = new Servico();
	InterfaceUsuario iu = new InterfaceUsuario(servico);
	iu.exibir();
	
		
	}
			
	
}
