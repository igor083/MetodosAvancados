package Alunos;

public class Alunos {
    private String nome;
    private int matricula;
    private Historico historico;
    private RDM rdm;

    public Alunos(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.historico = new Historico();
        this.rdm = new RDM();
    }

    public void adicionarDisciplinaConcluida(String disciplina) {
        historico.adicionarDisciplinaConcluida(disciplina);
    }

    public void adicionarNota(String disciplina, double nota) {
        rdm.adicionarNota(disciplina, nota);
    }

    public void imprimirHistorico() {
        System.out.println("Histórico do Aluno: " + nome);
        historico.imprimirHistorico();
    }

    public void imprimirRDM() {
        System.out.println("Rendimento Acadêmico do Aluno: " + nome);
        System.out.println("RDM: " + rdm.calcularRDM());
    }
}
