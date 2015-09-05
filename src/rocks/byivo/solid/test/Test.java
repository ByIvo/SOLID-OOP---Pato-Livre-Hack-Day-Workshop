package rocks.byivo.solid.test;

import rocks.byivo.solid.shapes.Circulo;
import rocks.byivo.solid.shapes.Retangulo;

public class Test {
	
	public static void main(String[] args) {
		System.out.println(new Retangulo(3, 9).calcularArea());
		System.out.println(new Retangulo(10, 20).calcularArea());
		
		System.out.println(new Circulo(2).calcularArea());
		System.out.println(new Circulo(5).calcularArea());
	}
}
