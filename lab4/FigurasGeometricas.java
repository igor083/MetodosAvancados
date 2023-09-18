
class Retangulo {
	private double altura;
	private double largura;

	Retangulo(double altura, double largura) {
		this.altura = altura;
		this.largura = largura;
	}

	public double getArea() {
		return this.altura * this.largura;
	}

	public double getPerimetro() {
		return 2 * (this.altura + this.largura);
	}
}

class Quadrado {
	private double largura;

	Quadrado(double largura) {
		this.largura = largura;
	}

	public double getArea() {
		return this.largura;
	}

	public double getPerimetro() {
		return 4 * this.largura;
	}
}

class Circulo {
	private double raio;

	Circulo(double raio) {
		this.raio = raio;
	}

	public double getArea() {
		return 3.14 * (this.raio * this.raio);
	}

	public double getPerimetro() {
		return 2 * 3.14 * this.raio;
	}
}


public class FigurasGeometricas {
	private Retangulo retangulo;
	private Quadrado quadrado;
	private Circulo circulo;
	
	FigurasGeometricas(double alturaQuadrado, double larguraQuadrado, double comprimentoLadoQuadrado, double raioCirculo) {
		this.retangulo = new Retangulo(alturaQuadrado, larguraQuadrado);
		this.quadrado = new Quadrado(comprimentoLadoQuadrado);
		this.circulo = new Circulo(raioCirculo);
	}



	// =-=-=-=-=-=-=-=-=| Get Areas |=-=-=-=-=-=-=-=-=
	public double getAreaRetangulo() {
		double area = this.retangulo.getArea();
		System.out.println("A área do retângulo é: " + area);
		return area;
	}

	public double getAreaQuadrado() {
		double area = this.quadrado.getArea();
		System.out.println("A área do quadrado é: " + area);
		return area;
	}

	public double getAreaCirculo() {
		double area = this.circulo.getArea();
		System.out.println("A área do círculo é: " + area);
		return area;
	}



	// =-=-=-=-=-=-=-=-=| Get Perimetro |=-=-=-=-=-=-=-=-=
	public double getPerimetroRetangulo() {
		double perimetro = this.retangulo.getPerimetro();
		System.out.println("O perímetro do retângulo é: " + perimetro);
		return perimetro;
	}

	public double getPerimetroQuadrado() {
		double perimetro = this.quadrado.getPerimetro();
		System.out.println("O perímetro do quadrado é: " + perimetro);
		return perimetro;
	}

	public double getPerimetroCirculo() {
		double perimetro = this.circulo.getPerimetro();
		System.out.println("O perímetro do círculo é: " + perimetro);
		return perimetro;
	}
}
