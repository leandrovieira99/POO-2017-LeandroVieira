package model;

public abstract class FiguraGeometrica {
	
	private int lado1;
	
	public FiguraGeometrica(int lado1) {
		this.lado1 = lado1;
	}
	
	public int getLado1() {
		return this.lado1;
	}

	public abstract float area();
	
	public abstract float perimetro();
}
