package lab2;

import entities.Aluno;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AlunoTest {
    private Aluno aluno;

    @BeforeEach
    void setUp() {
        aluno = new Aluno("João");
    }

    @Test
    public void testConstrutorAluno() {
        assertEquals("João", aluno.getNome());
        assertEquals(aluno.getMatricula(), aluno.getId());
    }

    @Test
    public void testGetNome() {
        assertEquals("João", aluno.getNome());
    }

    @Test
    public void testGetMatricula() {
        assertTrue(aluno.getMatricula() > 0);
    }

    @Test
    public void testGetId() {
        assertEquals(aluno.getMatricula(), aluno.getId());
    }

    @Test
    public void testSetNome() {
        aluno.setNome("Maria");
        assertEquals("Maria", aluno.getNome());
    }
}
