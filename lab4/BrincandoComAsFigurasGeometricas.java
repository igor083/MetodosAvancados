

public class BrincandoComAsFigurasGeometricas {

	public static void main(String[] args) {
		FigurasGeometricas figurasGeometricas = new FigurasGeometricas(
			10,
			5,
			7,
			25
		);

		figurasGeometricas.getAreaCirculo();
		figurasGeometricas.getPerimetroCirculo();

		figurasGeometricas.getAreaQuadrado();
		figurasGeometricas.getPerimetroQuadrado();

		figurasGeometricas.getAreaRetangulo();
		figurasGeometricas.getPerimetroRetangulo();
	}

}
