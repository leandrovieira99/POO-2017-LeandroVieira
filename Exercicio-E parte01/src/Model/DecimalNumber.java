package Model;

public class DecimalNumber {
	private double num1;
	public DecimalNumber(double n) {
		this.num1 = n;
	}
	
	public int retornaInt() {
		return (int)this.num1;
	}
	
	public double retornaDoube() {
		return this.num1 - (int)this.num1;
	}
	

}	
	


