package modelo;

public class Trapezio extends Quadrilatero {
	
	private double altura;
	
	public Trapezio(String descricao, double lado1, double lado2, double lado3, double lado4, double altura) {
		super(descricao, lado1, lado2, lado3, lado4);
		this.altura = altura;
	}
	
	public Trapezio(String descricao, double B, double b, double d, double altura) {
		//double d = Math.sqrt(Math.pow(B-b, 2) + altura*altura);
		super(descricao, altura, d, B, b);
		this.altura = altura;
	}
	
	@Override
	public double getArea() {
		return (lado3 + lado4)* altura / 2;
	}

}
