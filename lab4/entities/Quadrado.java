package entities;

import exceptions.FiguraException;
import interfaces.FigurasInterface;

public class Quadrado implements FigurasInterface {
	private double largura;

	Quadrado(double largura) throws FiguraException {
      if(largura<=0){//testar altura e largura negativo e zero
         throw new FiguraException();
      }
		this.largura = largura;
	}

	public Double calcularArea() {
		return this.largura;
	}

	public Double calcularPerimetro() {
		return 4 * this.largura;
	}
   @Override 
   public String toString(){
      return "Quadrado de lado "+largura;
   }
}
