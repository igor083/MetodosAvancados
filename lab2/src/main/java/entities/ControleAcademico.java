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

    public void printTurmasDoProfessor(Professor professor) {
        System.out.println("\nTurmas do professor " + professor.getNome() + ":");

        for (Turma turma : this.turmas) {
            if (turma.getProfessor().equals(professor)) {
                System.out.println("-> "+turma.getDisciplina().getNome() + " - " + turma.getHorario().getDiaSemana() + " / " + turma.getHorario().getHorasDia());
            }
        }
    }

    public void printHorarioDoProfessor(Professor professor) {
        System.out.println("\nHorario do professor " + professor.getNome() + ":");

        for (Turma turma : this.turmas) {
            if (turma.getProfessor().equals(professor)) {
                System.out.println("-> " + turma.getHorario().getDiaSemana() + " às " + turma.getHorario().getHorasDia());
            }
        }
    }

    public Turma criarTurma(Professor professor, String disciplinaNome, Aluno[] alunos, Horario horario) {
        // Verifica colisão de horarios de um mesmo professor
        for (Turma turma : this.turmas) {
            if (
                horario.getDiaSemana().equals(turma.getHorario().getDiaSemana()) &&
                horario.getHorasDia().equals(turma.getHorario().getHorasDia())
            ) {
                return null;
            }
        }

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

    public void printAlunosDaDisciplina(String disciplinaNome) {
        for (Turma turma : this.turmas) {
            if (turma.getDisciplina().getNome().equals(disciplinaNome)) {
                System.out.println("\nAlunos da disciplina " + disciplinaNome + ":");

                if (turma.getTodosAlunos().length == 0) {
                    System.out.println("-> Nenhum aluno matriculado");

                } else {
                    for (Aluno aluno : turma.getTodosAlunos()) {
                        if (aluno != null) {
                            System.out.println("-> " + aluno.getNome());
                        }
                    }
                }

            }
        }
    }
    public void printAlunosDaDisciplina(Disciplina disciplina) {
        for (Turma turma : this.turmas) {
            if (turma.getDisciplina().getId() == disciplina.getId()) {
                System.out.println("\nAlunos da disciplina " + disciplina.getNome() + ":");

                if (turma.getTodosAlunos().length == 0) {
                    System.out.println("-> Nenhum aluno matriculado");

                } else {
                    for (Aluno aluno : turma.getTodosAlunos()) {
                        if (aluno != null) {
                            System.out.println("-> " + aluno.getNome());
                        }
                    }
                }
                break;
            }
        }
    }


    // quais as disciplinas de um aluno

}
