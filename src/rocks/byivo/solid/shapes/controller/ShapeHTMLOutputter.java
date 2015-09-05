package rocks.byivo.solid.shapes.controller;

public class ShapeHTMLOutputter extends ShapeOutputter {

	public ShapeHTMLOutputter(ShapeCalculator calculator) {
		super(calculator);
	}

	@Override
	public void outputVolume() {
		if (this.getCalculator() instanceof ShapeVolumeCalculator)
			System.out.println("<p>" + ((ShapeVolumeCalculator) this.getCalculator()).calcularVolume() + "</p>");
	}

	@Override
	public void outputArea() {
		System.out.println("<p>" + this.getCalculator().calcularArea() + "</p>");
	}

}
