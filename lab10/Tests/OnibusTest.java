

import org.junit.Before;
import org.junit.Test;

import model.Onibus;
import model.OnibusException;

import static org.junit.Assert.assertEquals;



public class OnibusTest {

    private Onibus onibus;

    @Before
    public void setUp() {
        onibus = new Onibus();
    }

    @Test
    public void testAdicionar() throws OnibusException {
        int acento = onibus.adicionar();
         assertEquals(Character.valueOf('O'), onibus.getAcentos()[acento]);
    }

    @Test
    public void testReservar() throws OnibusException {
        int acento = onibus.reservar();
       assertEquals(Character.valueOf('R'), onibus.getAcentos()[acento]);
    }

    @Test
    public void testLiberar() throws OnibusException {
        int acento = onibus.adicionar();
        onibus.liberar(acento);
        assertEquals(Character.valueOf('-'), onibus.getAcentos()[acento]);
    }

     @Test(expected = OnibusException.class)
    public void testAdicionarAteLimite() throws OnibusException {
        for (int i = 0; i < onibus.getCapacidade(); i++) {
            onibus.adicionar();
        }
        onibus.adicionar();  // Deve lançar uma exceção
    }

    @Test(expected = OnibusException.class)
    public void testReservarAteLimite() throws OnibusException {
        for (int i = 0; i < onibus.getCapacidade(); i++) {
            onibus.reservar();
        }
        onibus.reservar();  // Deve lançar uma exceção
    }
}
