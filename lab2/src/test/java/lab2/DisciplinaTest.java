package lab2;

import entities.Disciplina;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DisciplinaTest {
    private Disciplina disciplina;

    @BeforeEach
    void setUp() {
        disciplina = new Disciplina("Matemática");
    }

    @Test
    public void testConstrutorDisciplina() {
        assertEquals("Matemática", disciplina.getNome());
    }

    @Test
    public void testGetNome() {
        assertEquals("Matemática", disciplina.getNome());
    }

    @Test
    public void testSetNome() {
        disciplina.setNome("Física");
        assertEquals("Física", disciplina.getNome());
    }
}
