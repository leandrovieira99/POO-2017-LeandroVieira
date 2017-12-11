package App;
import Model.Produto;

public class TesteProduto {
	public static void main(String[] args) {
		Produto p1 = new Produto(321, "Uva", 3.60, 20, 3);
		Produto p2 = new Produto(214, "Morango", 8.30, 30, 4);

	System.out.println(p1.toString());
	System.out.println(p2.toString());


}}