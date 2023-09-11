package lab2;

import exception.RdmException;
import entities.Creator;
import entities.Disciplina;
import entities.Aluno;
import entities.Professor;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CreatorTest {

    @Test
    public void testCriarDisciplinaComNumeros() {
        assertThrows(RdmException.class, () -> {
            Creator.criarDisciplina("Math123");
        });
    }

    @Test
    public void testCriarDisciplinaComCaracteresEspeciais() {
        assertThrows(RdmException.class, () -> {
            Creator.criarDisciplina("History!");
        });
    }

    @Test
    public void testCriarDisciplinaValida() throws RdmException {
        Disciplina disciplina = Creator.criarDisciplina("Physics");
        assertEquals("Physics", disciplina.getNome());
    }

    @Test
    public void testCriarAlunoComNumeros() {
        assertThrows(RdmException.class, () -> {
            Creator.criarAluno("John123");
        });
    }

    @Test
    public void testCriarAlunoComCaracteresEspeciais() {
        assertThrows(RdmException.class, () -> {
            Creator.criarAluno("Alice#Smith");
        });
    }

    @Test
    public void testCriarAlunoValido() throws RdmException {
        Aluno aluno = Creator.criarAluno("Eve Johnson");
        assertEquals("Eve Johnson", aluno.getNome());
    }

    @Test
    public void testCriarProfessorComNumeros() {
        assertThrows(RdmException.class, () -> {
            Creator.criarProfessor("Bob123");
        });
    }

    @Test
    public void testCriarProfessorComCaracteresEspeciais() {
        assertThrows(RdmException.class, () -> {
            Creator.criarProfessor("Carol@Davis");
        });
    }

    @Test
    public void testCriarProfessorValido() throws RdmException {
        Professor professor = Creator.criarProfessor("Alice Johnson");
        assertEquals("Alice Johnson", professor.getNome());
    }
}
