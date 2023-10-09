package Tests.TestesAlunos;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Alunos.Alunos;

public class TestAluno {

   private Alunos aluno;

   @Before
   public void setUp() {
      aluno = new Alunos("João", 12345);
   }

   @Test
   public void testAdicionarDisciplinaConcluida() {
      aluno.adicionarDisciplinaConcluida("Matemática");
      aluno.adicionarDisciplinaConcluida("História");
      assertEquals(2, aluno.getHistorico().getDisciplinasConcluidas().size());
   }

   @Test
   public void testImprimirHistorico() {
      aluno.adicionarDisciplinaConcluida("Matemática");
      aluno.adicionarDisciplinaConcluida("História");
      aluno.imprimirHistorico();
      // Você pode adicionar mais verificações aqui com base na saída impressa
   }

   @Test
   public void testImprimirRDM() {
      aluno.adicionarNota("Matemática", 8.5);
      aluno.adicionarNota("História", 7.0);
      aluno.imprimirRDM();
      // Você pode adicionar mais verificações aqui com base na saída impressa
   }
}
