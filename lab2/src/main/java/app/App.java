package app;

import entities.Aluno;
import entities.ControleAcademico;
import entities.Disciplina;
import entities.Professor;

import exception.RdmException;
import helpers.Horario;
import helpers.MyTypes;

public class App {
    public static void main(String args[]) throws RdmException {
        ControleAcademico RDM = new ControleAcademico("RDM");

        Professor Sabrina = RDM.criarProfessor("Sabrina");
        Professor Klaudio = RDM.criarProfessor("Klaudio");

        Disciplina disciplina = RDM.criarDisciplina("Paradigmas");

        Aluno aluno1 = RDM.criarAluno("Joao");
        Aluno aluno2 = RDM.criarAluno("Maria");

        RDM.criarTurma(
            Sabrina,
            disciplina,
            new Aluno[] { aluno1, aluno2 },
            new Horario(MyTypes.DiaSemana.SEGUNDA, MyTypes.HorasDia.ONZE_AS_TREZE)
        );

        RDM.criarTurma(
            Sabrina,
            disciplina,
            new Aluno[] { aluno2 },
            new Horario(MyTypes.DiaSemana.TERÇA, MyTypes.HorasDia.ONZE_AS_TREZE)
        );

        System.out.println(RDM.printTurmasDoProfessor(Sabrina));
        System.out.println(RDM.printHorarioDoProfessor(Sabrina));
        System.out.println(RDM.printDisciplinasDoAluno(aluno2));
        System.out.println(RDM.printHorarioDoAluno(aluno2));
        System.out.println(RDM.printQtdAlunosDaDisciplina(disciplina));
    }

}
