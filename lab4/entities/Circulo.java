package entities;
import exceptions.FiguraException;
import interfaces.FigurasInterface;

public class Circulo implements FigurasInterface {
	private double raio;

	Circulo(double raio) throws FiguraException {
      if(raio<=0){//testar raio negativo e zero
         throw new FiguraException();
      }
		this.raio = raio;
	}
	public Double calcularArea() {
		return 3.14 * (this.raio * this.raio);
	}

	public Double calcularPerimetro() {
		return 2 * 3.14 * this.raio;
	}
   @Override 
   public String toString(){
      return "Circulo de raio "+raio;
   }
}