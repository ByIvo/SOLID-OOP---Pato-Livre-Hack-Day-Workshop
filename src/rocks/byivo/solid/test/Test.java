package rocks.byivo.solid.test;

import rocks.byivo.solid.shapes.Circulo;
import rocks.byivo.solid.shapes.Esfera;
import rocks.byivo.solid.shapes.Retangulo;
import rocks.byivo.solid.shapes.controller.ShapeCalculator;
import rocks.byivo.solid.shapes.controller.ShapeHTMLOutputter;
import rocks.byivo.solid.shapes.controller.ShapeJSONOutputter;
import rocks.byivo.solid.shapes.controller.ShapeOutputter;
import rocks.byivo.solid.shapes.controller.ShapeVolumeCalculator;

public class Test {
	
	public static void main(String[] args) {
		System.out.println(new ShapeCalculator(new Retangulo(3, 9)).calcularArea());
		System.out.println(new ShapeCalculator(new Retangulo(10, 20)).calcularArea());
		
		System.out.println(new ShapeCalculator(new Circulo(2)).calcularArea());
		System.out.println(new ShapeCalculator(new Circulo(5)).calcularArea());
		
		System.out.println();
		
		ShapeOutputter shape1 = new ShapeJSONOutputter(new ShapeCalculator(new Retangulo(3, 9)));
		ShapeOutputter shape2 = new ShapeJSONOutputter(new ShapeCalculator(new Circulo(2)));
		ShapeOutputter shape3 =new ShapeHTMLOutputter(new ShapeVolumeCalculator(new Esfera(3, 9)));
		
		shape1.outputArea();
		System.out.println();
		shape2.outputArea();
		System.out.println();
		shape3.outputArea();
		shape3.outputVolume();
		System.out.println();
		shape1.outputVolume();

	}
}
