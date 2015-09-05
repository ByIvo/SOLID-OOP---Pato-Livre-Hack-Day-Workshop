package rocks.byivo.solid.shapes.controller;

import rocks.byivo.solid.interfaces.IShape;

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
		if (shape instanceof IShape) {
			return ((IShape) shape).calcular();
		} else {
			throw new RuntimeException("Shape não reconhecida!");
		}
	}
}
