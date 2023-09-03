package entities;

import java.util.ArrayList;

public class ControleAcademico {
    private String nome = "";
    private ArrayList<Turma> turmas = new ArrayList<Turma>();
    private ArrayList<Professor> professores = new ArrayList<Professor>();
    private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    private ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();

    ControleAcademico(String nome) {
        this.nome = nome;
    }

}
