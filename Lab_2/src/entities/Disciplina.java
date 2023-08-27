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

    public String[] getHorario() {
        String horario[] = new String[] {this.horario.getDiaSemana(), this.horario.getHorasDia()};
        return horario;
    }


	// =-=-=-=-=-=-=-=-=| setters |=-=-=-=-=-=-=-=-=
	public void addAluno(Aluno aluno) {
		this.alunos.add(aluno);
        aluno.addDisciplina(this);
	}
}
