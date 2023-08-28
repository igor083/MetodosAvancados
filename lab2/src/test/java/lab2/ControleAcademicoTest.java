package lab2;

import org.junit.jupiter.api.Test;

import entities.ControleAcademico;
import entities.Disciplina;
import entities.Professor;
import helpers.Horario;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ControleAcademicoTest {
  ControleAcademico CA =new ControleAcademico();
    @Test
    void testArraysIniciais() {
      ControleAcademico CA =new ControleAcademico(); 
      int soma = CA.getTodosAlunos().size()+CA.getTodasDisciplinas().size()+CA.getTodosProfessores().size();
        assertEquals(soma, 0);
    }
    @Test
     void testeCriarDisciplina(){// testa a adicao da cisciplina no array do controle academico
      CA.criarAluno("Igor");
      CA.criarDisciplina(null, new Professor(
         "null",
          0)
          , null);
       assertEquals(CA.getTodasDisciplinas().size(), 1);
     }
     @Test
     void testeCriarAluno(){//testa a adicao do aluno no array do controle academico
      CA.criarAluno("null");
      assertEquals(CA.getTodosAlunos().size(),1);
     }
     @Test 
     void testeCriarProfessor(){
      CA.criarProfessor("null");
      assertEquals(CA.getTodosProfessores().size(),1);

     }
 
}
