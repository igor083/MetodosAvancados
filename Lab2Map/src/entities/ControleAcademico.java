package entities;

import java.util.ArrayList;

public class ControleAcademico {
	private ArrayList<Aluno> arrayAllAlunos;
	private ArrayList<Disciplina> arrayAllDisciplinas;
	private ArrayList<Professor> arrayAllProfessores;

	public ControleAcademico() {
		arrayAllAlunos = new ArrayList<>();
		arrayAllDisciplinas = new ArrayList<>();
		arrayAllProfessores = new ArrayList<>();
	}

	// getters
	public ArrayList<Aluno> getArrayAllAlunos() {
		return arrayAllAlunos;
	}

	public ArrayList<Disciplina> getArrayAllDisciplinas() {
		return arrayAllDisciplinas;
	}

	public ArrayList<Professor> getArrayAllProfessores() {
		return arrayAllProfessores;
	}
	// adicionando entidades

	public void adicionarAluno(Aluno aluno) {
		arrayAllAlunos.add(aluno);
	}

	public void adicionarProfessor(Professor p) {
		arrayAllProfessores.add(p);
	}

	public void adicionaDisciplina(Disciplina d) {
		arrayAllDisciplinas.add(d);
	}
}
