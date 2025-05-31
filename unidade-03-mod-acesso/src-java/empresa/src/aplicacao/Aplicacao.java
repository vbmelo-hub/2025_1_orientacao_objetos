package aplicacao;

import java.util.HashMap;

import modelo.Departamento;
import modelo.Funcionario;

public class Aplicacao {

	public static void main(String[] args) {
		Funcionario f = new Funcionario("Joao da Silva de Paula", "12345678900", new Departamento("Tecnologia da Informa��o", "TI"));
		System.out.println(f.getMatricula());
		
		
	}

}
