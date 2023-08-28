package lab2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import entities.Disciplina;
import entities.Professor;

public class ProfessorTest {
   @Test
   public void testeAddDisciplina() {
      Professor professor = new Professor("Professor", 1); 
      professor.addDisciplina(new Disciplina("Disciplina", 1, professor, null )); 
      
      assertEquals(1, professor.getDisciplinas().size());
   }
}

