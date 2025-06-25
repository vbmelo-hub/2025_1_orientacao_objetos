package modelo;

public abstract class Quadrilatero extends FiguraGeometrica{
	protected double lado1;
	protected double lado2;
	protected double lado3;
	protected double lado4;
	
	public Quadrilatero(String descricao, double lado1, double lado2, double lado3, double lado4) {
		super(descricao);
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		this.lado4 = lado4;
	}
	@Override
	public double getPerimetro() {
		return this.lado1 + this.lado2 + this.lado3 + this.lado4;
	}
	
}
