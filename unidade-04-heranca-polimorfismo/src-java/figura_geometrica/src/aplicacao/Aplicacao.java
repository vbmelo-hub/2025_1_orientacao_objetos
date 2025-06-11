package aplicacao;

import modelo.Circulo;
import modelo.FiguraGeometrica;
import modelo.Quadrado;
import modelo.Retangulo;

public class Aplicacao {

	public static void main(String[] args) {
		FiguraGeometrica r = new Retangulo("Retangulo", 5, 3);
		FiguraGeometrica c = new Circulo("Circulo");
		FiguraGeometrica q = new Quadrado("Quadrado", 10);
		System.out.println(r.getDescricao()+"   "+ r.getArea());
		System.out.println(c.getDescricao()+"   "+ c.getArea());
		System.out.println(q.getDescricao()+"   "+ q.getArea());
		
		
	}

}
