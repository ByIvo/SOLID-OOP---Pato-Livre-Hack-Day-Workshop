package rocks.byivo.solid.shapes.controller;

public class ShapeOutputter {

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

	public void outputHTML() {
		System.out.println("<p>" + calculator.calcularArea()+ "</p>");
	}
	
	public void outputJSON() {
		System.out.println("{area:" + calculator.calcularArea() + "}");
	}
}
