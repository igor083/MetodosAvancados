package lab2;

import entities.*;
import exception.RdmException;
import helpers.Horario;
import helpers.MyTypes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ControleAcademicoTest {
    private static ControleAcademico controleAcademico;

    @BeforeEach
    void setUp() {
        controleAcademico = new ControleAcademico("Academic Control");
    }

    @Test
    public void testCriarProfessor() throws RdmException {
        Professor professor = controleAcademico.criarProfessor("Alice Johnson");
        assertEquals("Alice Johnson", professor.getNome());
    }

    @Test
    public void testRemoverProfessor() throws RdmException{
        Professor professor = controleAcademico.criarProfessor("Carol Davis");
        int result = controleAcademico.removerProfessor(professor);

        assertEquals(1, result);
    }

    @Test
    public void testRemoverProfessorInexistente() throws RdmException{
        Professor professor = new Professor("John Doe");

        assertThrows(RdmException.class, () -> {
            controleAcademico.removerProfessor(professor);
        });
    }

    @Test
    public void testCriarTurmaComHorarioConflitante() throws RdmException {
        Professor professor = controleAcademico.criarProfessor("Alice Johnson");
        Disciplina disciplina = controleAcademico.criarDisciplina("Math");
        Aluno[] alunos = {
            controleAcademico.criarAluno("David"),
            controleAcademico.criarAluno("Eve")
        };

        // Crie objetos Horario para representar os horários das turmas
        Horario horarioTurma1 = new Horario(MyTypes.DiaSemana.SEGUNDA, MyTypes.HorasDia.NOVE_AS_ONZE);
        Horario horarioTurma2 = new Horario(MyTypes.DiaSemana.SEGUNDA, MyTypes.HorasDia.ONZE_AS_TREZE);

        assertThrows(RdmException.class, () -> {
            controleAcademico.criarTurma(professor, disciplina, alunos, horarioTurma1);
            controleAcademico.criarTurma(professor, disciplina, alunos, horarioTurma2);
        });
    }

    @Test
    public void testCriarTurmaComProfessorDisciplinaAlunosRepetidos() throws RdmException {
        Professor professor = controleAcademico.criarProfessor("Alice Johnson");
        Disciplina disciplina = controleAcademico.criarDisciplina("Math");
        Aluno[] alunos = {
            controleAcademico.criarAluno("David"),
            controleAcademico.criarAluno("Eve")
        };

        // Crie um objeto Horario para representar o horário da turma
        Horario horarioTurma = new Horario(MyTypes.DiaSemana.SEGUNDA, MyTypes.HorasDia.NOVE_AS_ONZE);

        assertThrows(RdmException.class, () -> {
            controleAcademico.criarTurma(professor, disciplina, alunos, horarioTurma);
            controleAcademico.criarTurma(professor, disciplina, alunos, horarioTurma);
        });
    }
}



