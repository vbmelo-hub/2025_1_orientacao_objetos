package modelo;

public class Quadrado extends Retangulo {

	public Quadrado(String descricao, double lado) {
		super(descricao, lado, lado);

	}
	@Override
	public String getDescricao() {
		return  super.getDescricao()+" do tipo quadrado";
	}
}
