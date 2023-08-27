package entities;

import java.util.ArrayList;

import helpers.Horario;
import helpers.MyTypes;

public class Disciplina {
	private String nome;
	private int id;
	private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	private Professor professor;
	private Horario	horario;

	public Disciplina(String nome, int id, Aluno[] alunos, Professor professor, Horario horario) {
		this.nome = nome;
		this.id = id;
		this.professor = professor;
		this.horario = horario;

        for (Aluno aluno : alunos) {
            this.alunos.add(aluno);
            aluno.addDisciplina(this);
        }
	}
    

	// =-=-=-=-=-=-=-=-=| Getters |=-=-=-=-=-=-=-=-=
	public ArrayList<Aluno> getAlunos() {
		return this.alunos;
	}

	public String getNome() {
		return this.nome;
	}	

	public Professor getProfessor() {
		return this.professor;
	}

	public boolean alunoEstaNaDisciplina(Aluno aluno) {
		for (Aluno alunoDaDisciplina : this.alunos) {
			if (alunoDaDisciplina.getId() == aluno.getId()) {
				return true;
			}
		}

		return false;
	}

	

	// =-=-=-=-=-=-=-=-=| setters |=-=-=-=-=-=-=-=-=
	public void addAluno(Aluno aluno) {
		this.alunos.add(aluno);
	}

	public void addProfessor(Professor professor) {
		this.professor = professor;
	}

}
