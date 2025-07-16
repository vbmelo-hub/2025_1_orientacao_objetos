package modelo;

public abstract class FiguraGeometrica {
	private String descricao;
	
	FiguraGeometrica(String descricao){
		this.descricao = descricao;
	}
	public abstract double getArea();
	public String getDescricao() {
		return descricao;
	}
	public abstract double getPerimetro();
}
