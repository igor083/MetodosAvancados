package app;

import java.util.ArrayList;

import entities.Aluno;
import entities.ControleAcademico;
import entities.Disciplina;
import entities.Professor;
import helpers.Horario;
import helpers.MyTypes;

public class App {
	public static void main(String args[]) throws Exception {
		ControleAcademico controleAcademico = new ControleAcademico();

		Aluno Saulo = controleAcademico.criarAluno("Saulo");
		Aluno Joao = controleAcademico.criarAluno("Joao");
		Aluno Maria = controleAcademico.criarAluno("Maria");
		Professor Sabrina = controleAcademico.criarProfessor("Sabrina");
		Professor Klaudio = controleAcademico.criarProfessor("Klaudio");
      
		Disciplina MAP = controleAcademico.criarDisciplina(
         "MAP", 
         
         Sabrina, 
         new Horario(MyTypes.DiaSemana.QUARTA, MyTypes.HorasDia.NOVE_AS_ONZE)
         );
         
         

		Disciplina PARADIGMAS = controleAcademico.criarDisciplina(
			"PARADIGMAS", 
            
            Klaudio, 
            new Horario(MyTypes.DiaSemana.QUINTA, MyTypes.HorasDia.VINTE_AS_VINTE_DOIS)
		);
      Saulo.addDisciplina(MAP);
         Maria.addDisciplina(MAP);
         Maria.addDisciplina(PARADIGMAS); 
         Saulo.addDisciplina(PARADIGMAS); 
        controleAcademico.printDisciplinasDoProfessor(Sabrina);
        controleAcademico.printHorarioDoProfessor(Klaudio);
        controleAcademico.printAlunosDaDisciplina(PARADIGMAS);
        controleAcademico.printDisciplinasDoAluno(Maria);
        controleAcademico.printHorarioDoAluno(Maria);
        controleAcademico.printAlunosQtd(PARADIGMAS);
        
	}

}
