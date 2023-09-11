package entities;

import java.util.ArrayList;

import exception.RdmException;
import helpers.Horario;

public class ControleAcademico {
   private String nome = "";
   private ArrayList<Turma> turmas = new ArrayList<Turma>();
   private ArrayList<Professor> professores = new ArrayList<Professor>();
   private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
   private ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();

   public ControleAcademico(String nome) {
      this.nome = nome;
   }

   // ========================== Criadores ================================
   public Professor criarProfessor(String nome) throws RdmException {
      Professor novoProfessor = Creator.criarProfessor(nome);
      this.professores.add(novoProfessor);

      return novoProfessor;
   }

   public int removerProfessor(Professor professor) throws RdmException {
      for (Professor p : this.professores) {
         if (p.getNome().equals(professor.getNome())) {
            this.professores.remove(professor);
            return 1;
         }

      }
      throw new RdmException();
   }

   public Turma criarTurma(Professor professor, Disciplina disciplina, Aluno[] alunos, Horario horario)
         throws RdmException { // Verifica colisão de horarios de um mesmo professor
      for (Turma turma : this.turmas) {
         if (horario.getDiaSemana().equals(turma.getHorario().getDiaSemana()) &&
               horario.getHorasDia().equals(turma.getHorario().getHorasDia())) {
            throw new RdmException();

         } // verifica se turma criada ja existe
         if (turma.getProfessor().equals(professor) && turma.getTodosAlunos().equals(alunos)
               && turma.getDisciplina().equals(disciplina)) {
            throw new RdmException();
         }
      }
      Turma novaTurma = Creator.criarTurma(professor, disciplina, alunos, horario);

      this.turmas.add(novaTurma);

      return novaTurma;
   }

   public Disciplina criarDisciplina(String name) throws RdmException {
      for (Disciplina d : this.disciplinas) {
         if (d.getNome().equals(name)) {
            throw new RdmException();
         }
      }

      Disciplina novaDisciplina = Creator.criarDisciplina(name);

      this.disciplinas.add(novaDisciplina);

      return novaDisciplina;
   }

   public Aluno criarAluno(String nome) throws RdmException {
      for (Aluno d : this.alunos) {
         if (d.getNome().equals(nome)) {
            throw new RdmException();
         }
      }
      Aluno novoAluno = Creator.criarAluno(nome);
      this.alunos.add(novoAluno);

      return novoAluno;
   }

   // ======================= Auxiliadores do
   // print=================================

   public String printTurmasDoProfessor(Professor professor) {
      StringBuilder str = new StringBuilder();
      str.append("\nTurmas do professor " + professor.getNome() + ":");
      str.append("\n");

      for (Turma turma : this.turmas) {
         if (turma.getProfessor().equals(professor)) {
            str.append("-> " + turma.getDisciplina().getNome() + " - " + turma.getHorario().getDiaSemana() + " / "
                  + turma.getHorario().getHorasDia());
            str.append("\n");
         }
      }
      return str.toString();
   }

   public String printHorarioDoProfessor(Professor professor) {
      StringBuilder str = new StringBuilder();
      str.append("\nHorario do professor " + professor.getNome() + ":");
      str.append("\n");

      for (Turma turma : this.turmas) {
         if (turma.getProfessor().equals(professor)) {
            str.append("-> " + turma.getHorario().getDiaSemana() + " às " + turma.getHorario().getHorasDia());
            str.append("\n");
         }
      }
      return str.toString();
   }

   public String printAlunosDaDisciplina(String disciplinaNome) {
      StringBuilder str = new StringBuilder();
      for (Turma turma : this.turmas) {
         if (turma.getDisciplina().getNome().equals(disciplinaNome)) {
            str.append("\nAlunos da disciplina " + disciplinaNome + ":");
            str.append("\n");

            if (turma.getTodosAlunos().length == 0) {

            } else {
               for (Aluno aluno : turma.getTodosAlunos()) {
                  if (aluno != null) {
                     str.append("-> " + aluno.getNome());
                  }
               }

            }

         }

      }
      return str.toString();
   }

   public String printDisciplinasDoAluno(Aluno aluno) {
      StringBuilder str = new StringBuilder();

      str.append("\nDisciplinas do aluno " + aluno.getNome() + ":");
      str.append("\n");

      for (Turma turma : this.turmas) {
         for (Aluno alunoDaTurma : turma.getTodosAlunos()) {
            if (alunoDaTurma != null && alunoDaTurma.getId() == aluno.getId()) {
               str.append("-> " + turma.getDisciplina().getNome());
            }
         }
      }
      return str.toString();
   }

   public String printHorarioDoAluno(Aluno aluno) {
      StringBuilder str = new StringBuilder();
      str.append("\nHorario do aluno " + aluno.getNome() + ":");
      str.append("\n");

      for (Turma turma : this.turmas) {
         for (Aluno alunoDaTurma : turma.getTodosAlunos()) {
            if (alunoDaTurma != null && alunoDaTurma.getId() == aluno.getId()) {
               str.append("-> " + turma.getHorario().getDiaSemana() + " às " + turma.getHorario().getHorasDia());
               str.append("\n");
            }
         }
      }
      return str.toString();
   }

   // Considera todas as turmas de uma determianda disciplina
   public String printQtdAlunosDaDisciplina(Disciplina disciplina) {
      int qtdAlunos = 0;
      StringBuilder str = new StringBuilder();

      for (Turma turma : this.turmas) {
         if (turma.getDisciplina().getId() == disciplina.getId()) {
            qtdAlunos += turma.getTodosAlunos().length;
         }
      }

      str.append("\nQuantidade de alunos da disciplina " + disciplina.getNome() + ": " + qtdAlunos);
      return str.toString();
   }
}
