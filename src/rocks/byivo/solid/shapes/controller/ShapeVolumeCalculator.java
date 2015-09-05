package rocks.byivo.solid.shapes.controller;

import rocks.byivo.solid.interfaces.IShapeVolume;
import rocks.byivo.solid.shapes.Shape;

public class ShapeVolumeCalculator extends ShapeCalculator {

	public ShapeVolumeCalculator(Shape shape) {
		super(shape);
	}

	public double calcularVolume() {
		if (this.getShape() instanceof IShapeVolume) {
			return ((IShapeVolume) this.getShape()).calcularVolume();
		} else {
			throw new Error("Shape não reconhecida!");
		}
	}
}
