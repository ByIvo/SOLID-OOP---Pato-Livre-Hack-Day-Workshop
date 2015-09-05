package rocks.byivo.solid.shapes.controller;

import rocks.byivo.solid.interfaces.IShapeArea;
import rocks.byivo.solid.shapes.Shape;

public class ShapeCalculator {

	private Shape shape;

	public ShapeCalculator(Shape shape) {
		super();
		this.shape = shape;
	}

	public Shape getShape() {
		return shape;
	}

	public void setShape(Shape shape) {
		this.shape = shape;
	}

	public double calcularArea() {
		if (shape instanceof IShapeArea) {
			return ((IShapeArea) shape).calcular();
		} else {
			throw new RuntimeException("Shape não reconhecida!");
		}
	}
}
