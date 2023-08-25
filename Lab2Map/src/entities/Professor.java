package entities;

import java.util.ArrayList;

public class Professor {
	private String nome;
	private int professorId;
	private ArrayList<Disciplina>arrayCadeiras;
	
	public Professor(String nome, int professorId) {
		this.nome = nome;
		this.professorId = professorId;
		arrayCadeiras = new ArrayList<Disciplina>();
	}

	public String getNome() {
		return nome;
	}

	public int getProfessorId() {
		return professorId;
	}

	public ArrayList<Disciplina> getArrayCadeiras() {
		return arrayCadeiras;
	}

}
