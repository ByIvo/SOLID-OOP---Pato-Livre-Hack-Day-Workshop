package rocks.byivo.solid.shapes.controller;

public abstract class ShapeOutputter {

	private ShapeCalculator calculator;

	public ShapeOutputter(ShapeCalculator calculator) {
		super();
		this.calculator = calculator;
	}

	public ShapeCalculator getCalculator() {
		return calculator;
	}

	public void setCalculator(ShapeCalculator calculator) {
		this.calculator = calculator;
	}
	
	public abstract void outputArea();
	public abstract void outputVolume();
}
