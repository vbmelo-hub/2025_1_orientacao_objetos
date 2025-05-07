

public class Fechadura {
	String descricao;
	String chave = "abcd";
	
	public boolean verificarChave(String chave) {
		if (this.chave.equals(chave)) {
			return true;
		}
		return false;
	}
}

