package entities;

import exception.RdmException;
import helpers.Horario;

public class Creator {

   public static Disciplina criarDisciplina(String nome) throws RdmException {

      boolean contemNumeros = nome.matches(".*\\d.*");// verifica numeros
      boolean contemCaracteresEspeciais = nome.matches(".*[^a-zA-Z0-9 ].*");// verifica caracteres especiais
      if (contemNumeros || contemCaracteresEspeciais) {
         throw new RdmException();
      }
      return new Disciplina(nome);
   }

   public static Aluno criarAluno(String nome) throws RdmException {
      return new Aluno(nome);
   }

   public static Professor criarProfessor(String nome) throws RdmException {
      return new Professor(nome);
   }

   public static Turma criarTurma(
         Professor professor,
         Disciplina disciplina, Aluno[] alunos, Horario horario) throws RdmException {
      return new Turma(professor, disciplina, alunos, horario);
   }
}
