package aplicacao;

import modelo.Departamento;
import modelo.Funcionario;

public class Aplicacao {

	public static void main(String[] args) {
		Funcionario f = new Funcionario("Joao da Silva de Paula", "12345678900", new Departamento("Tecnologia da Informação", "TI"));
		System.out.println(f.getMatricula());

	}

}
