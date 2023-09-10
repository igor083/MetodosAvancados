package app;

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

        RDM.removerProfessor(Klaudio);

        Disciplina disciplina = new Disciplina("Paradigmas");
        Disciplina disciplina2 = new Disciplina("Paradigmas");

        RDM.criarTurma(
            Sabrina, 
            "Paradigmas", 
            null, 
            new Horario(MyTypes.DiaSemana.SEGUNDA, MyTypes.HorasDia.ONZE_AS_TREZE)
        );
        RDM.criarTurma(
            Sabrina, 
            disciplina, 
            null, 
            new Horario(MyTypes.DiaSemana.SEGUNDA, MyTypes.HorasDia.ONZE_AS_TREZE)
        );

        RDM.getTurmasDoProfessor(Sabrina).forEach(e -> System.out.println(e.getDisciplina().getNome()));

    }
}
