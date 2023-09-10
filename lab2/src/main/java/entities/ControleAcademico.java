package entities;

import java.util.ArrayList;

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


    public Professor criarProfessor(String nome) {
        Professor novoProfessor = new Professor(nome);
        this.professores.add(novoProfessor);

        return novoProfessor;
    }

    public void removerProfessor(Professor professor) {
        this.professores.remove(professor);
    }

    public ArrayList<Turma> getTurmasDoProfessor(Professor professor) {
        ArrayList<Turma> turmasDoProfessor = new ArrayList<Turma>();

        for (Turma turma : this.turmas) {
            if (turma.getProfessor().equals(professor)) {
                turmasDoProfessor.add(turma);
            }
        }

        return turmasDoProfessor;
    }


    public Turma criarTurma(Professor professor, String disciplinaNome, Aluno[] alunos, Horario horario) {
        Disciplina disciplina = this.criarDisciplina(disciplinaNome);

        Turma novaTurma = new Turma(professor, disciplina, alunos, horario);
        
        this.turmas.add(novaTurma);

        return novaTurma;
    }
    public Turma criarTurma(Professor professor, Disciplina disciplina, Aluno[] alunos, Horario horario) {
        Turma novaTurma = new Turma(professor, disciplina, alunos, horario);
        
        this.turmas.add(novaTurma);

        return novaTurma;
    }

    public Disciplina criarDisciplina(String name) {
        for (Disciplina d : this.disciplinas) {
            if (d.getNome().equals(name)) {
                return d;
            }
        }

        Disciplina novaDisciplina = new Disciplina(name);

        this.disciplinas.add(novaDisciplina);

        return novaDisciplina;
    }
}
