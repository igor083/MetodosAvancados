package app;

import java.util.ArrayList;

import entities.Aluno;
import entities.ControleAcademico;
import entities.Disciplina;
import entities.Professor;
import entities.Turma;
import helpers.Horario;
import helpers.MyTypes;

public class App {
    public static void main(String args[]) {
        ControleAcademico RDM = new ControleAcademico("RDM");

        Professor Sabrina = RDM.criarProfessor("Sabrina");
        Professor Klaudio = RDM.criarProfessor("Klaudio");

        Disciplina disciplina = RDM.criarDisciplina("Paradigmas");

        Aluno aluno1 = RDM.criarAluno("Joao");
        Aluno aluno2 = RDM.criarAluno("Maria");

        RDM.criarTurma(
            Sabrina,
            disciplina,
            new Aluno[]{aluno1, aluno2},
            new Horario(MyTypes.DiaSemana.SEGUNDA, MyTypes.HorasDia.ONZE_AS_TREZE)
        );

        RDM.criarTurma(
            Sabrina,
            "Paradigmas",
            new Aluno[]{aluno2},
            new Horario(MyTypes.DiaSemana.TERÇA, MyTypes.HorasDia.ONZE_AS_TREZE)
        );

        RDM.printTurmasDoProfessor(Sabrina);
        RDM.printHorarioDoProfessor(Sabrina);
        RDM.printAlunosDaDisciplina(disciplina);
        RDM.printDisciplinasDoAluno(aluno2);
        RDM.printHorarioDoAluno(aluno2);
        RDM.printQtdAlunosDaDisciplina(disciplina);
    }
}
