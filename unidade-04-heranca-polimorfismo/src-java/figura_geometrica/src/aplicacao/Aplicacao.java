package aplicacao;

import java.util.ArrayList;

import modelo.Circulo;
import modelo.FiguraGeometrica;
import modelo.Quadrado;
import modelo.Retangulo;
import modelo.Trapezio;

public class Aplicacao {
	
	static ArrayList<FiguraGeometrica> figuras = new ArrayList<FiguraGeometrica>();

	public static void main(String[] args) {
		FiguraGeometrica r = new Retangulo("Retangulo", 5, 3);
		figuras.add(r);
		FiguraGeometrica c = new Circulo("Circulo", 4);
		figuras.add(c);
		FiguraGeometrica q = new Quadrado("Quadrado", 10);
		figuras.add(q);
		double d = Math.sqrt(Math.pow(8-5, 2) + 3*3);
		FiguraGeometrica t = new Trapezio("Trapézio", 8, 5 ,d, 3);
		figuras.add(t);
		
		for(FiguraGeometrica f : figuras) {
			System.out.println("Área: " + f.getArea() + "\tPerímetro: " + f.getPerimetro());
		}
		
		
		
		/*
		System.out.println(r.getDescricao()+"   "+ r.getArea()+"   "+ r.getPerimetro());
		System.out.println(c.getDescricao()+"   "+ c.getArea()+"   "+ c.getPerimetro());
		System.out.println(q.getDescricao()+"   "+ q.getArea()+"   "+ q.getPerimetro());
		System.out.println(t.getDescricao()+"   "+ t.getArea()+"   "+ t.getPerimetro());
		*/
		
	}

}
