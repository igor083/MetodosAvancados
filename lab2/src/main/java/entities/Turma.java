package entities;

import helpers.Uuid;

public class Turma {
    private int id = Uuid.gerarIdAleatorio();
    private Aluno[] alunos = new Aluno[45];
    private Professor professor;
    private Disciplina disciplina;

    public Turma(Professor professor, Disciplina disciplina, Aluno[] alunos) {
        this.professor = professor;
        this.disciplina = disciplina;
        this.alunos = alunos;
    }

    public int getId() {
      return this.id;
    }

    public Aluno[] getTodosAlunos() {
      return this.alunos;
    }

    public Aluno getAlunoPorMatricula(int matricula) {
      for (Aluno aluno : this.alunos) {
        if (aluno.getMatricula() == matricula) {
          return aluno;
        }
      }
      return null;
    }

    public Aluno addAluno(Aluno aluno) {
      for (int i = 0; i < this.alunos.length; i++) {
        if (this.alunos[i] == null) {
          this.alunos[i] = aluno;
          return aluno;
        }
      }
      return null;
    }

    public Professor getProfessor() {
      return this.professor;
    }

    public void setProfessor(Professor professor) {
      this.professor = professor;
    }


    public Disciplina getDisciplina() {
      return this.disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
      this.disciplina = disciplina;
    }



}
