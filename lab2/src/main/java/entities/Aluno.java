package entities;

import helpers.Uuid;

public class Aluno {
    private int matricula = Uuid.gerarIdAleatorio();
    private String nome = "";

    public Aluno(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
      	return this.matricula;
    }

    public int getId() {
        return this.matricula;
    }

    public String getNome() {
      	return this.nome;
    }

    public void setNome(String nome) {
      	this.nome = nome;
    }
}
