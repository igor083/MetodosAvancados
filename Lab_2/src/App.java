import entities.Aluno;
import entities.ControleAcademico;
import entities.Disciplina;

public class App {
	public static void main(String args[]) throws Exception {
		ControleAcademico controleAcademico = new ControleAcademico();
		Aluno aluno = new Aluno("joao", 202080129);
		Disciplina disciplina = new Disciplina("matematica");
		
		controleAcademico.adicionarAluno(aluno);
		controleAcademico.adicionaDisciplina(disciplina);
		
		System.out.println(disciplina.tamanhoTurma());
	}

}
