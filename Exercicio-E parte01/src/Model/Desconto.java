package Model;

public class Desconto {
	private double preco;
	private double desconto;
	
	public Desconto(double v, double d) {
		this.preco = v;
		this.desconto = d;
	}
	
	public double Calcula(){
		return this.preco * (1- this.desconto/100);
	}
}