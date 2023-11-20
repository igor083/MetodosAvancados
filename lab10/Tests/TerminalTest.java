import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import controller.Terminal;
import model.OnibusException;


public class TerminalTest {

   private Terminal terminal;

   @Before
   public void setUp() {
      terminal = new Terminal();

   }

   @Test
   public void testVenderPassagem() throws OnibusException {
      int acento = terminal.venderPassagem();
      assertEquals(Character.valueOf('O'), terminal.getOnibus().getAcentos()[acento]);

   }

   @Test
   public void testReservarPassagem() throws OnibusException {
      int acento = terminal.reservarPassagem();
      assertEquals(Character.valueOf('R'), terminal.getOnibus().getAcentos()[acento]);

   }

   @Test
   public void testCancelarPassagem() throws OnibusException {
      int acento = terminal.venderPassagem();
      assertTrue(terminal.cancelarPassagem(acento));
      assertEquals(Character.valueOf('-'), terminal.getOnibus().getAcentos()[acento]);

   }

   @Test
   public void testCancelarPassagemInvalida() {
      assertFalse(terminal.cancelarPassagem(-1));
      assertFalse(terminal.cancelarPassagem(terminal.getOnibus().getCapacidade() + 1));

   }

}
