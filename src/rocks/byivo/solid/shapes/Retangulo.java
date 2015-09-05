package rocks.byivo.solid.shapes;

public class Retangulo {

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
	
	public double calcularArea() {
		return largura * comprimento;
	}

}
