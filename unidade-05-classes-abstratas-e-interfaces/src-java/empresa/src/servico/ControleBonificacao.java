package servico;

import modelo.funcionario.Funcionario;
import modelo.funcionario.FuncionarioBonificavel;

public class ControleBonificacao {
	private static double totalBonficacao = 0;
	
	public static double registrarBonficacao(FuncionarioBonificavel f) {
		f.bonificar();
		totalBonficacao += f.getBonificacao();
		return f.getBonificacao();
	}
	
	public static double getTotalBonficacao() {
		return totalBonficacao;
	}

}
