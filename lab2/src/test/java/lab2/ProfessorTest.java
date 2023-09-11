package lab2;

import entities.Professor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProfessorTest {
    private Professor professor;

    @BeforeEach
    void setUp() {
        professor = new Professor("Alice");
    }

    @Test
    public void testConstrutorProfessor() {
        assertEquals("Alice", professor.getNome());
        assertTrue(professor.getId() > 0);
    }

    @Test
    public void testGetNome() {
        assertEquals("Alice", professor.getNome());
    }

    @Test
    public void testGetId() {
        assertTrue(professor.getId() > 0);
    }

    @Test
    public void testSetNome() {
        professor.setNome("Bob");
        assertEquals("Bob", professor.getNome());
    }
}
