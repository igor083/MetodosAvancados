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

		Aluno aluno1 = controleAcademico.criarAluno("Saulo");
		Aluno aluno2 = controleAcademico.criarAluno("Joao");
		Aluno aluno3 = controleAcademico.criarAluno("Maria");

		Professor Sabrina = controleAcademico.criarProfessor("Sabrina");
		Professor Klaudio = controleAcademico.criarProfessor("Klaudio");

		Disciplina POO = controleAcademico.criarDisciplina(
			"MAP", 
            new Aluno[] {aluno1}, 
            Sabrina, 
            new Horario(MyTypes.DiaSemana.QUARTA, MyTypes.HorasDia.NOVE_AS_ONZE)
		);

        POO.addProfessor(Klaudio);
        POO.addAluno(aluno2);
        POO.addAluno(aluno3);

		// Toda a responsabilidade de criar, adicionar e gerenciar os alunos ficam no ControleAcademico
		// Toda a responsabilidade de criar, adicionar e gerenciar as disciplinas ficam no ControleAcademico
		// Toda a responsabilidade de criar, adicionar e gerenciar os professores ficam no ControleAcademico
	}

}
