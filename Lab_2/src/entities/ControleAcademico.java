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

    public String getHorarioFormatado(String horario) {
        switch (horario) {
            case "SETE_AS_NOVE":
                return "07:00 às 09:00";
            
            case "NOVE_AS_ONZE":
                return "09:00 às 11:00";

            case "ONZE_AS_TREZE":
                return "11:00 às 13:00";

            case "QUATORZE_AS_DEZESSEIS":
                return "14:00 às 16:00";
            
            case "DEZESSEIS_AS_DEZOITO":
                return "16:00 às 18:00";

            case "DEZOITO_AS_VINTE":
                return "18:00 às 20:00";

            case "VINTE_AS_VINTE_DOIS":
                return "20:00 às 22:00";

            default:
                return "";
        }
    }

	// =-=-=-=-=-=-=-=-=| prints |=-=-=-=-=-=-=-=-=
	public void printDisciplinasDoAluno(Aluno aluno) {
		System.out.println("Disciplinas do aluno " + aluno.getNome() + ":");

		aluno.getDisciplinas().forEach(disciplina -> {
			System.out.println("-> "+disciplina.getNome());
		});

        System.out.print("\n");
	}

	public void printDisciplinasDoProfessor(Professor professor) {
		System.out.println("Disciplinas do professor " + professor.getNome() + ":");

		professor.getDisciplinas().forEach(disciplina -> {
			System.out.println("-> "+disciplina.getNome());
		});

        System.out.print("\n");
	}
 
    public void printAlunosDaDisciplina(Disciplina disciplina) {
        System.out.println("Alunos da disciplina " + disciplina.getNome() + ":");

        disciplina.getAlunos().forEach(aluno -> {
            System.out.println("-> "+aluno.getNome());
        });

        System.out.print("\n");
    }

    public void printHorarioDoProfessor(Professor professor) {
        System.out.println("Horario do professor " + professor.getNome() + ":");

        professor.getDisciplinas().forEach(disciplina -> {
            String dia = disciplina.getHorario()[0];
            String hora = this.getHorarioFormatado(disciplina.getHorario()[1]);
   
            System.out.println("-> "+dia+" ("+hora+")");
        });

        System.out.print("\n");
    }
       
    public void printHorarioDoAluno(Aluno aluno) {
        System.out.println("Horario do aluno " + aluno.getNome() + ":");

        aluno.getDisciplinas().forEach(disciplina -> {
            String dia = disciplina.getHorario()[0];
            String hora = this.getHorarioFormatado(disciplina.getHorario()[1]);

            System.out.println("-> "+dia+" ("+hora+")");
        });

        System.out.print("\n");
    }

    public void printAlunosQtd(Disciplina disciplina) {
        System.out.println("Quantidade de alunos da disciplina " + disciplina.getNome() + ": " + disciplina.getAlunos().size());
        System.out.print("\n");
    }
}
