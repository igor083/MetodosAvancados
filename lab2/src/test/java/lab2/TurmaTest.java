package lab2;

import entities.Aluno;
import entities.Disciplina;
import entities.Professor;
import entities.Turma;
import helpers.Horario;
import helpers.MyTypes.DiaSemana;
import helpers.MyTypes.HorasDia;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TurmaTest {
    private Turma turma;
    private Professor professor;
    private Disciplina disciplina;
    private Aluno aluno1;
    private Aluno aluno2;

    @BeforeEach
    void setUp() {
        professor = new Professor("Alice");
        disciplina = new Disciplina("Math");
        aluno1 = new Aluno("Bob");
        aluno2 = new Aluno("Carol");
        Aluno[] alunos = {aluno1, aluno2};
        Horario horario = new Horario(DiaSemana.SEGUNDA, HorasDia.ONZE_AS_TREZE);
        turma = new Turma(professor, disciplina, alunos, horario);
    }

    @Test
    public void testConstrutorTurma() {
        assertEquals(professor, turma.getProfessor());
        assertEquals(disciplina, turma.getDisciplina());
        assertArrayEquals(new Aluno[]{aluno1, aluno2}, turma.getTodosAlunos());
        assertTrue(turma.getId() > 0);
    }

    @Test
    public void testGetId() {
        assertTrue(turma.getId() > 0);
    }

    @Test
    public void testGetTodosAlunos() {
        assertArrayEquals(new Aluno[]{aluno1, aluno2}, turma.getTodosAlunos());
    }

    @Test
    public void testGetAlunoPorMatricula() {
        assertEquals(aluno1, turma.getAlunoPorMatricula(aluno1.getMatricula()));
        assertEquals(aluno2, turma.getAlunoPorMatricula(aluno2.getMatricula()));
        assertNull(turma.getAlunoPorMatricula(999)); // Matrícula inexistente
    }
 

    @Test
    public void testGetProfessor() {
        assertEquals(professor, turma.getProfessor());
    }

    @Test
    public void testSetProfessor() {
        Professor novoProfessor = new Professor("Grace");
        turma.setProfessor(novoProfessor);
        assertEquals(novoProfessor, turma.getProfessor());
    }

    @Test
    public void testGetDisciplina() {
        assertEquals(disciplina, turma.getDisciplina());
    }

    @Test
    public void testSetDisciplina() {
        Disciplina novaDisciplina = new Disciplina("Physics");
        turma.setDisciplina(novaDisciplina);
        assertEquals(novaDisciplina, turma.getDisciplina());
    }

}
