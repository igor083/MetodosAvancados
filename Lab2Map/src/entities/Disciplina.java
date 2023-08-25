package entities;

import java.util.ArrayList;

public class Disciplina {
	private String nome;
	private ArrayList<Aluno> arrayAlunos;
	// horario
	// dias

	// constructor
	public Disciplina(String nome) {
		this.nome = nome;
		arrayAlunos = new ArrayList<Aluno>();
	}

	// get
	public String getNome() {
		return nome;
	}

	public ArrayList<Aluno> getArrayAlunos() {
		return arrayAlunos;
	}

	// metodos
	public String tamanhoTurma() {
		return "A quantidade de alunos na turma e de: " + arrayAlunos.size();

	}

	public void addAlunoNaDisciplina(Aluno aluno) {
		arrayAlunos.add(aluno);
	}
}
