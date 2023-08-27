package entities;

import java.util.ArrayList;

import helpers.Horario;
import helpers.MyTypes;

public class Disciplina {
	private String nome;
	private int id;
	private ArrayList<Aluno> alunos;
	private Professor professor;
	private Horario	horario;

	public Disciplina(String nome, int id, ArrayList<Aluno> alunos, Professor professor) {
		this.nome = nome;
		this.id = id;
		this.alunos = alunos;
		this.professor = professor;
		this.horario = this.escolherHorarioAleatorio();
	}

	public Disciplina(String nome, int id, ArrayList<Aluno> alunos, Professor professor, Horario horario) {
		this.nome = nome;
		this.id = id;
		this.alunos = alunos;
		this.professor = professor;
		this.horario = horario;
	}

	public Horario escolherHorarioAleatorio() {
		// Escolher melhor horario
		Horario novoHorario = new Horario(MyTypes.DiaSemana.SEGUNDA, MyTypes.HorasDia.ONZE_AS_TREZE);

		return novoHorario;
	}
}
