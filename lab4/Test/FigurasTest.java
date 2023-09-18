
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class FigurasTest {
   @Test
   public quadradoLadoZero(){
      assertThrows(FiguraException, () -> {
         Quadrado q = new Quadrado(0);
        
     });
   }
   @Test
   public RetanguloLadoZero(){
      assertThrows(FiguraException, () -> {
         Retangulo q = new Retangulo(0,0);
        
     });
   }
   @Test
   public CirculoRaioZero(){
      assertThrows(FiguraException, () -> {
         Circulo q = new Circulo(0);
        
     });
   }
   @Test
   public AreaQuadrado(){
      Quadrado q = new Quadrado(2);
      assertEquals(4,q.getArea(),0);
   }
   @Test
   public PerimetroQuadrado(){
      Quadrado q = new Quadrado(1.5);
      assertEquals(6,q.getPerimetro(),0);
   }
   @Test
   public AreaCirculo(){
      Circulo q = new Circulo(10);
      assertEquals(314,q.getArea(),0);
   }
   @Test
   public PerimetroCirculo(){
      Circulo q = new Circulo(10);
      assertEquals(62.8,q.getPerimetro(),0);
   }
   @Test
   public AreaRetangulo(){
      Retangulo q = new Retangulo(10,5);
      assertEquals(50,q.getArea(),0);
   }
   @Test
   public PerimetroRetangulo(){
      Retangulo q = new Retangulo(10,5);
      assertEquals(30,q.getPerimetro(),0);
   }
}
