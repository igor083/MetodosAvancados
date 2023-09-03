package lab2;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import entities.Aluno;
import entities.ControleAcademico;
import entities.Disciplina;
import entities.Professor;
public class AlunoTest {
   @Test
   void testeAddDisciplina(){//testando metodo de adicionar disciplinas ao array de disciplinas do aluno
      Aluno a = new Aluno("Mario", 0);

      a.addDisciplina(
         new Disciplina(null,
            0,
            new Professor("Sabrina", 0),
         null));

         assertEquals(a.getDisciplinas().size(),1);
   }
}
