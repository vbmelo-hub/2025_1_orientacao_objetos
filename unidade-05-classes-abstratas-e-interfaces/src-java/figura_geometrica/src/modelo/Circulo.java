package modelo;

public class Circulo extends FiguraGeometrica {

	private double raio;
	
	public Circulo(String descricao, double raio) {
		super(descricao);
		this.raio = raio;
	}
	@Override
	public double getArea() {
		return Math.PI * this.raio * this.raio;
	}
	@Override
	public double getPerimetro() {
		return 2 * this.raio * Math.PI;
	}
	 
}
