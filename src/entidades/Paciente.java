package entidades;

import enuns.Sexo;

public class Paciente {
    private String nome;
    private int idade;
    private Sexo genero;

    public Paciente(String nome, int idade, Sexo genero) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setGenero(Sexo genero) {
        this.genero = genero;
    }

    public Sexo getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                "Idade: " + idade +
                "Gênero: " + genero;
    }
}