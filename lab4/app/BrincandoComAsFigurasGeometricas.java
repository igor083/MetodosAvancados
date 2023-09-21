package app;

import entities.FigurasGeometricas;
import exceptions.FiguraException;

public class BrincandoComAsFigurasGeometricas {

   public static void main(String[] args) throws FiguraException {
      FigurasGeometricas fig = new FigurasGeometricas(
            10,
            5,
            7,
            25);

      System.out.println(fig.getTodosPerimetros());
      System.out.println(fig.areaDaFigura(0));
      System.out.println(fig.areaDaFigura(-1));
      System.out.println(fig.areaDaFigura(2));
      System.out.println(fig.areaDaFigura(1));

      System.out.println("figura 1 e: "+fig.toStringDaFigura(1));
      System.out.println("figura 0 e: "+fig.toStringDaFigura(0));
      System.out.println("figura -1 e: "+fig.toStringDaFigura(-1));
      System.out.println("figura 2 e: \n"+fig.toStringDaFigura(2));

   }

}
