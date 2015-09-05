package rocks.byivo.solid.shapes.controller;

public class ShapeJSONOutputter extends ShapeOutputter {

	public ShapeJSONOutputter(ShapeCalculator calculator) {
		super(calculator);
	}

	@Override
	public void outputArea() {
		System.out.println("{area:" + this.getCalculator().calcularArea() + "}");
	}

	@Override
	public void outputVolume() {
		if (this.getCalculator() instanceof ShapeVolumeCalculator)
			System.out.println("{area:" + ((ShapeVolumeCalculator) this.getCalculator()).calcularVolume() + "}");
	}
}
