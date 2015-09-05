package rocks.byivo.solid.test;

import rocks.byivo.solid.shapes.Circulo;
import rocks.byivo.solid.shapes.Retangulo;
import rocks.byivo.solid.shapes.controller.ShapeCalculator;
import rocks.byivo.solid.shapes.controller.ShapeOutputter;

public class Test {
	
	public static void main(String[] args) {
		System.out.println(new ShapeCalculator(new Retangulo(3, 9)).calcularArea());
		System.out.println(new ShapeCalculator(new Retangulo(10, 20)).calcularArea());
		
		System.out.println(new ShapeCalculator(new Circulo(2)).calcularArea());
		System.out.println(new ShapeCalculator(new Circulo(5)).calcularArea());
		
		System.out.println();
		
		new ShapeOutputter(new ShapeCalculator(new Retangulo(3, 9))).outputHTML();;
		new ShapeOutputter(new ShapeCalculator(new Retangulo(10, 20))).outputJSON();;
		
		new ShapeOutputter(new ShapeCalculator(new Circulo(2))).outputHTML();;
		new ShapeOutputter(new ShapeCalculator(new Circulo(5))).outputJSON();;
	}
}
