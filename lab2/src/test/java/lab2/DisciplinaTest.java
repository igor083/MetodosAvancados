package lab2;

import org.junit.jupiter.api.Test;

import entities.Disciplina;
import entities.Professor;
import entities.Aluno;
import helpers.Horario;
import helpers.MyTypes;  

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DisciplinaTest {

    @Test
    public void testAddAluno() {
        Professor professor = new Professor("Professor",1);
        Horario horario = new Horario(MyTypes.DiaSemana.SEGUNDA, MyTypes.HorasDia.SETE_AS_NOVE);
        Disciplina disciplina = new Disciplina("Disciplina", 1, professor, horario);
        
        Aluno aluno1 = new Aluno("João", 123);

        disciplina.addAluno(aluno1);
        assertTrue(disciplina.getAlunos().contains(aluno1));
    }
}
