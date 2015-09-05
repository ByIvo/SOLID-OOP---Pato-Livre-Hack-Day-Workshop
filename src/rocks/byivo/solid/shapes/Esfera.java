package rocks.byivo.solid.shapes;

import rocks.byivo.solid.interfaces.IShapeArea;
import rocks.byivo.solid.interfaces.IShapeVolume;

public class Esfera extends Shape implements IShapeArea, IShapeVolume {

	private double altura;
	private double raio;

	public Esfera() {
	}

	public Esfera(double altura, double raio) {
		super();
		this.altura = altura;
		this.raio = raio;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double calcular() {
		return 4 * Math.PI * Math.pow(raio, 2);
	}

	@Override
	public double calcularVolume() {
		return 4 * ((Math.PI * altura * Math.pow(raio, 2))/3);
	}

}
