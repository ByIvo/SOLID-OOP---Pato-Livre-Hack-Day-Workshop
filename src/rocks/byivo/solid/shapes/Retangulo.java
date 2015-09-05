package rocks.byivo.solid.shapes;

import rocks.byivo.solid.interfaces.IShapeArea;

public class Retangulo extends Shape implements IShapeArea{

	private double comprimento;
	private double largura;

	public Retangulo() {
		super();
	}

	public Retangulo(double comprimento, double largura) {
		super();
		this.comprimento = comprimento;
		this.largura = largura;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}
	
	@Override
	public double calcular() {
		return largura * comprimento;
	}
}
