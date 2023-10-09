package Tests.TestesAdministrativas;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import Administrativa.Administrativa;
import Administrativa.Entrevista;
import Administrativa.Reuniao;

public class TestAdministrativa {

    private Administrativa administrativa;

    @Before
    public void setUp() {
        administrativa = new Administrativa();
    }

    @Test
    public void testObterReunioesAgendadas() {
        String reunioes = administrativa.obterReunioesAgendadas();
        assertNotNull(reunioes);
        assertTrue(reunioes.contains("Reuniões agendadas com a diretoria"));
    }

    @Test
    public void testObterEntrevistas() {
        String entrevistas = administrativa.obterEntrevistas();
        assertNotNull(entrevistas);
        assertTrue(entrevistas.contains("Entrevistas agendadas"));
    }

    @Test
    public void testReunioesAgendadasNaoVazias() {
        ArrayList<Reuniao> reunioes = administrativa.reunioesAgendadas;
        assertNotNull(reunioes);
        assertFalse(reunioes.isEmpty());
    }

    @Test
    public void testEntrevistasAgendadasNaoVazias() {
        ArrayList<Entrevista> entrevistas = administrativa.entrevistasAgendadas;
        assertNotNull(entrevistas);
        assertFalse(entrevistas.isEmpty());
    }
}
