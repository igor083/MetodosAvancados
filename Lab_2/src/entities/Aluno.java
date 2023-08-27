package entities;

import java.util.ArrayList;

public class Aluno {
	private String nome;
	private int matricula;
	private ArrayList<Disciplina> disciplinas;

	public Aluno(String nome, int matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}

	// =-=-=-=-=-=-=-=-=| Getters |=-=-=-=-=-=-=-=-=
	public String getNome() {
		return nome;
	}

	public int getMatricula() {
		return this.matricula;
	}

	public int getId() {
		return this.matricula;
	}	

	public ArrayList<Disciplina> getDisciplinas() {
		return this.disciplinas;
	}

	// =-=-=-=-=-=-=-=-=| setters |=-=-=-=-=-=-=-=-=
	public void addDisciplina(Disciplina disciplina) {
		this.disciplinas.add(disciplina);
	}
}
