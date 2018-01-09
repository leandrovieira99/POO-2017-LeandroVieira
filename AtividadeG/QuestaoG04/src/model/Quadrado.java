package model;

public class Quadrado extends FiguraGeometrica{
	
	public Quadrado(int lado1) {
		super( lado1);
	}
	
	public float area() {
		return (getLado1() * getLado1());
	}

	public float perimetro() {
		return (4 * getLado1());
	}
}
