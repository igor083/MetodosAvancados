package Alunos;

import java.util.ArrayList;
import java.util.List;

public class Historico {
    private List<String> disciplinasConcluidas;

    public Historico() {
        this.disciplinasConcluidas = new ArrayList<>();
    }

    public void adicionarDisciplinaConcluida(String disciplina) {
        disciplinasConcluidas.add(disciplina);
    }

    public void imprimirHistorico() {
        System.out.println("Disciplinas concluídas:");
        for (String disciplina : disciplinasConcluidas) {
            System.out.println(disciplina);
        }
    }
}