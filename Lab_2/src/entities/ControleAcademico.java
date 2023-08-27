package entities;

import java.util.ArrayList;
import helpers.Uuid;

public class ControleAcademico {
	private ArrayList<Aluno> todosAlunos;
	private ArrayList<Disciplina> todasDisciplinas;
	private ArrayList<Professor> todosProfessores;

	private Uuid alunosIds = new Uuid();


	public ControleAcademico() {
		this.todosAlunos = new ArrayList<>();
		this.todasDisciplinas = new ArrayList<>();
		this.todosProfessores = new ArrayList<>();
	}

	public Aluno criarAluno(String nome) {
		Aluno novoAluno = new Aluno(nome, this.alunosIds.createUuid());
		this.todosAlunos.add(novoAluno);
		return novoAluno;
	}

	public Disciplina criarDisciplina() {
		Disciplina novaDisciplina = new Disciplina("MAP");
		this.todasDisciplinas.add(novaDisciplina);
		return novaDisciplina;
	}

	public Professor criarProfessor() {
		Professor novoProfessor = new Professor("Sabrina");
		this.todosProfessores.add(novoProfessor);
		return novoProfessor;
	}
}
