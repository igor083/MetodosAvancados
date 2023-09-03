package entities;

import helpers.Uuid;

public class Aluno {
    private int matricula = Uuid.gerarIdAleatorio();
    private String nome = "";

    Aluno(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
      return matricula;
    }

    public String getNome() {
      return nome;
    }

    public void setNome(String nome) {
      this.nome = nome;
    }
}
