package modelo;

public class Quadrilatero extends FiguraGeometrica{
	protected double lado1;
	private double lado2;
	protected double lado3;
	private double lado4;
	public Quadrilatero(String descricao, double lado1, double lado2, double lado3, double lado4) {
		super(descricao);
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		this.lado4 = lado4;
	}
	
	

}
