package app;

import model.Retangulo;
import model.Quadrado;

public class TesteFigura {

	public static void main(String[] args) {

		Quadrado quadrado = new Quadrado(5);
		Retangulo retangulo = new Retangulo(7,8);
		
		System.out.println("Area do quadrado: "+quadrado.area());
		System.out.println("Perimetro do quadrado: "+quadrado.perimetro());
		
		System.out.println("Area do retangulogulo: "+retangulo.area());
		System.out.println("Perimetro: "+retangulo.perimetro());

}}