package entities;
import exceptions.FiguraException;
import interfaces.FigurasInterface;

public class Retangulo implements FigurasInterface {
	private double altura;
	private double largura;

	Retangulo(double altura, double largura) throws FiguraException {
      if(altura<=0||largura<=0){//testar altura e largura negativo e zero
         throw new FiguraException();
      }
		this.altura = altura;
		this.largura = largura;
	}

	public Double calcularArea() {
		return this.altura * this.largura;
	}

	public Double calcularPerimetro() {
		return 2 * (this.altura + this.largura);
	}
   @Override 
   public String toString(){
      return "Retangulo de largura "+largura+" e altura "+altura ;
   }
}
