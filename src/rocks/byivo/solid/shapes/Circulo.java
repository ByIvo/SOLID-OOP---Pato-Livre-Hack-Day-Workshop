package rocks.byivo.solid.shapes;

import rocks.byivo.solid.interfaces.IShapeArea;

public class Circulo extends Shape implements IShapeArea{
	
	private double raio;

	public Circulo(double raio) {
		super();
		this.raio = raio;
	}

	public Circulo() {
		super();
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	@Override
	public double calcular() {
		return Math.pow(raio,2) * Math.PI;
	} 
	
}
