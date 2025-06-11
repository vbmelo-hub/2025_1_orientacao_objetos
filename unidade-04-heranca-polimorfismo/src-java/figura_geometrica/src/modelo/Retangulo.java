package modelo;

public class Retangulo extends Quadrilatero {
	public Retangulo(String descricao, double altura, double largura){
	 super(descricao, altura, altura, largura, largura);
 }
	@Override
	public String getDescricao() {
		return "Este é um retangulo";
	}
	@Override
	public double getArea() {
		return this.lado1 * this.lado3;
	}
}
