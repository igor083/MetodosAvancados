package entities;

import java.util.ArrayList;

import helpers.Horario;
import helpers.MyTypes;
import helpers.Uuid;

public class ControleAcademico {
	private ArrayList<Aluno> todosAlunos;
	private ArrayList<Disciplina> todasDisciplinas;
	private ArrayList<Professor> todosProfessores;

	private Uuid alunosIds = new Uuid();
	private Uuid disciplinasIds = new Uuid();
	private Uuid professoresIds = new Uuid();


	public ControleAcademico() {
		this.todosAlunos = new ArrayList<Aluno>();
		this.todasDisciplinas = new ArrayList<Disciplina>();
		this.todosProfessores = new ArrayList<Professor>();
	}


	// =-=-=-=-=-=-=-=-=| Creators |=-=-=-=-=-=-=-=-=
	public Disciplina criarDisciplina(String nome, Aluno[] alunos, Professor professor, Horario horario) {
		Disciplina novaDisciplina = new Disciplina(
			nome, 
			this.disciplinasIds.createUuid(), 
			alunos, 
			professor, 
			horario
		);

		professor.addDisciplina(novaDisciplina);
		this.todasDisciplinas.add(novaDisciplina);

		return novaDisciplina;
	}




	public Aluno criarAluno(String nome) {
		Aluno novoAluno = new Aluno(nome, this.alunosIds.createUuid());
		this.todosAlunos.add(novoAluno);
		return novoAluno;
	}

	public Professor criarProfessor(String nome) {
		Professor novoProfessor = new Professor(nome, this.professoresIds.createUuid());
		this.todosProfessores.add(novoProfessor);
		return novoProfessor;
	}


	// =-=-=-=-=-=-=-=-=| Getters |=-=-=-=-=-=-=-=-=
	public ArrayList<Disciplina> getTodasDisciplinas() {
		return this.todasDisciplinas;
	}

	public ArrayList<Aluno> getTodosAlunos() {
		return this.todosAlunos;
	}

	public ArrayList<Professor> getTodosProfessores() {
		return this.todosProfessores;
	}

	// =-=-=-=-=-=-=-=-=| prints |=-=-=-=-=-=-=-=-=
	public void printDisciplinasDoAluno(Aluno aluno) {
		System.out.println("Disciplinas do aluno " + aluno.getNome() + ":");

		aluno.getDisciplinas().forEach(disciplina -> {
			System.out.println(disciplina.getNome());
		});
	}

	public void printDisciplinasDoProfessor(Professor professor) {
		System.out.println("Disciplinas do professor " + professor.getNome() + ":");

		professor.getDisciplinas().forEach(disciplina -> {
			System.out.println(disciplina.getNome());
		});
	}

}
