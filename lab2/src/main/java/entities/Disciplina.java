package entities;

import helpers.Uuid;

public class Disciplina {
    private int id = Uuid.gerarIdAleatorio();
    private String nome = "";

    public Disciplina(String nome) {
        this.nome = nome;
    }

    public int getId() {
      	return id;
    }

    public String getNome() {
      	return nome;
    }

    public void setNome(String nome) {
      	this.nome = nome;
    }
}
