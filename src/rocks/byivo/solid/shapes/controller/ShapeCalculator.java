package rocks.byivo.solid.shapes.controller;

import rocks.byivo.solid.shapes.Circulo;
import rocks.byivo.solid.shapes.Retangulo;

public class ShapeCalculator {

	private Object shape;

	public ShapeCalculator(Object shape) {
		super();
		this.shape = shape;
	}

	public Object getShape() {
		return shape;
	}

	public void setShape(Object shape) {
		this.shape = shape;
	}

	public double calcular() {
		if (shape instanceof Circulo) {
			return Math.pow(((Circulo) shape).getRaio(), 2) * Math.PI;
		} else if (shape instanceof Retangulo) {
			Retangulo ret = (Retangulo) shape;
			return ret.getLargura() * ret.getComprimento();
		} else {
			throw new RuntimeException("Shape não reconhecida!");
		}
	}
}
