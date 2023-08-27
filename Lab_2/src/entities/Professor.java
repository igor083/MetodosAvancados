package entities;

import java.util.ArrayList;

public class Professor {
	private String nome;
	private int id;
	private ArrayList<Disciplina> disciplinas;
	
	public Professor(String nome, int id) {
		this.nome = nome;
		this.id = id;
	}

	// =-=-=-=-=-=-=-=-=| Getters |=-=-=-=-=-=-=-=-=
	public int getId() {
		return this.id;
	}

	public String getNome() {
		return this.nome;
	}

	public ArrayList<Disciplina> getDisciplinas() {
		return this.disciplinas;
	}

	// =-=-=-=-=-=-=-=-=| setters |=-=-=-=-=-=-=-=-=
	public void addDisciplina(Disciplina disciplina) {
		this.disciplinas.add(disciplina);
	}
}
