package app;

import model.Diretor;
import model.Gerente;

public class TesteFuncionario {
	


	public static void main(String[] args) {
		Gerente gerente = new Gerente("Joao", "99100","masc", 0.8);
        Gerente diretor = new Diretor("Maria", "23412","masc", 1.5);

        System.out.println(gerente.getBonificacao());
        System.out.println(diretor.getBonificacao());
    }
}