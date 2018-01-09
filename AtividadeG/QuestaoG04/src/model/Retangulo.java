package model;

public class Retangulo extends FiguraGeometrica{
	
	private int lado2;
	
	public Retangulo(int lado1, int lado2) {
		super(lado1);
		this.lado2 = lado2;
	}
	
	public int getLado2() {
		return lado2;
	}
	
	@Override
	public float area() {
		return(getLado1() * getLado2());
	}

	@Override
	public float perimetro() {
		return(2*(getLado1()) + 2*(getLado2()));
	}
	
	
	

}
