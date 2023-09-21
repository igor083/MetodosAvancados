package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import exceptions.FiguraException;

public class FigurasGeometricasTest {

    private FigurasGeometricas figuras;

    @Before
    public void setUp() throws FiguraException {
        figuras = new FigurasGeometricas(4.0, 5.0, 3.0, 2.0);
    }

    @Test
    public void testAreaRetangulo() throws FiguraException {
        assertEquals("20.0", figuras.areaDaFigura(FigurasGeometricas.R));
    }

    @Test
    public void testAreaQuadrado() throws FiguraException {
        assertEquals("9.0", figuras.areaDaFigura(FigurasGeometricas.Q));
    }

    @Test
    public void testAreaCirculo() throws FiguraException {
        assertEquals("12.56", figuras.areaDaFigura(FigurasGeometricas.C));
    }

    @Test
    public void testPerimetroRetangulo() throws FiguraException {
        assertEquals("18.0", figuras.PerimetroDaFigura(FigurasGeometricas.R));
    }

    @Test
    public void testPerimetroQuadrado() throws FiguraException {
        assertEquals("12.0", figuras.PerimetroDaFigura(FigurasGeometricas.Q));
    }

    @Test
    public void testPerimetroCirculo() throws FiguraException {
        assertEquals("12.56", figuras.PerimetroDaFigura(FigurasGeometricas.C));
    }

    @Test
    public void testToStringRetangulo() throws FiguraException {
        assertEquals("Retangulo de altura 4.0 e largura 5.0", figuras.toStringDaFigura(FigurasGeometricas.R));
    }

    @Test
    public void testToStringQuadrado() throws FiguraException {
        assertEquals("Quadrado de lado 3.0", figuras.toStringDaFigura(FigurasGeometricas.Q));
    }

    @Test
    public void testToStringCirculo() throws FiguraException {
        assertEquals("Circulo de raio 2.0", figuras.toStringDaFigura(FigurasGeometricas.C));
    }

    @Test
    public void testTodasAreas() {
        String expected = "Retangulo: 20.0\nQuadrado: 9.0\nCirculo: 12.56\n";
        assertEquals(expected, figuras.areaDaFigura(FigurasGeometricas.T));
    }

    @Test
    public void testTodasPerimetros() {
        String expected = "Retangulo: 18.0\nQuadrado: 12.0\nCirculo: 12.56\n";
        assertEquals(expected, figuras.PerimetroDaFigura(FigurasGeometricas.T));
    }

    @Test
    public void testTodasFiguras() {
        String expected = "Retangulo de altura 4.0 e largura 5.0\nQuadrado de lado 3.0\nCirculo de raio 2.0\n";
        assertEquals(expected, figuras.toStringDaFigura(FigurasGeometricas.T));
    }

    @Test(expected = FiguraException.class)
    public void testTipoInvalidoArea() throws FiguraException {
        figuras.areaDaFigura(10); // Tipo inválido deve lançar FiguraException
    }

    @Test(expected = FiguraException.class)
    public void testTipoInvalidoPerimetro() throws FiguraException {
        figuras.PerimetroDaFigura(10); // Tipo inválido deve lançar FiguraException
    }

    @Test(expected = FiguraException.class)
    public void testTipoInvalidoToString() throws FiguraException {
        figuras.toStringDaFigura(10); // Tipo inválido deve lançar FiguraException
    }
}
