package app;

import entities.Aluno;
import entities.ControleAcademico;
import entities.Disciplina;

public class Main {
	public static void main(String args[]) throws Exception {
		ControleAcademico controle = new ControleAcademico();
		Aluno a = new Aluno("joao", 202080129);
		Disciplina d = new Disciplina("matematica");
		controle.adicionarAluno(a);
		controle.adicionaDisciplina(d);
		System.out.println(d.tamanhoTurma());
	}

}
