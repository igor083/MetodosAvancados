package entities;

import java.util.ArrayList;

public class ControleAcademico {
	private ArrayList<Aluno> arrayAllAlunos;
	private ArrayList<Disciplina> arrayAllDisciplinas;
	private ArrayList<Professor> arrayAllProfessores;

	public ControleAcademico() {
		this.arrayAllAlunos = new ArrayList<>();
		this.arrayAllDisciplinas = new ArrayList<>();
		this.arrayAllProfessores = new ArrayList<>();
	}

	// getters
	public ArrayList<Aluno> getArrayAllAlunos() {
		return this.arrayAllAlunos;
	}

	public ArrayList<Disciplina> getArrayAllDisciplinas() {
		return this.arrayAllDisciplinas;
	}

	public ArrayList<Professor> getArrayAllProfessores() {
		return this.arrayAllProfessores;
	}
	// adicionando entidades

	public void adicionarAluno(Aluno aluno) {
		this.arrayAllAlunos.add(aluno);
	}

	public void adicionarProfessor(Professor p) {
		this.arrayAllProfessores.add(p);
	}

	public void adicionaDisciplina(Disciplina d) {
		this.arrayAllDisciplinas.add(d);
	}
}
