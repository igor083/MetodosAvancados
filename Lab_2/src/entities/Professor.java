package entities;

import java.util.ArrayList;

public class Professor {
	private String nome;
	private ArrayList<Disciplina>arrayCadeiras;
	
	public Professor(String nome) {
		this.nome = nome;
		arrayCadeiras = new ArrayList<Disciplina>();
	}

	public String getNome() {
		return nome;
	}

	public ArrayList<Disciplina> getArrayCadeiras() {
		return arrayCadeiras;
	}

}
