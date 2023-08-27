package entities;

import java.util.ArrayList;

public class Aluno {
	private String nome;
	private int matriculaId;
	private ArrayList<Disciplina> arrayCadeiras;

	public Aluno(String nome, int matriculaId) {

		this.nome = nome;

		this.matriculaId = matriculaId;
		arrayCadeiras = new ArrayList<Disciplina>();
	}

	// getters
	public String getNome() {
		return nome;
	}

	public int getMatriculaId() {
		return matriculaId;
	}

	public ArrayList<Disciplina> getArrayCadeiras() {
		return arrayCadeiras;
	}

	// metodos
	public void addDisciplina(Disciplina disc) {
		arrayCadeiras.add(disc);
	}

}
