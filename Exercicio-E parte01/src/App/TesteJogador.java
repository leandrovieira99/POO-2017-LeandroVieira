package App;
import Model.Jogador;

public class TesteJogador {
	public static void main(String[] args) {
		Jogador p1 = new Jogador(87,4,230);
		Jogador p2 = new Jogador(76,6,400);
		p1.atacar(p2);
		System.out.println(p1.GetPontos());
		System.out.println(p2.GetPontos());
	}

}