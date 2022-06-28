package entidades;

import java.io.File;

public class Medico {
    private int idMedico;
    private String nome;
    private String especialidade;

    public Medico(String nome, String especialidade, int id) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.idMedico = id;
        File pastaMedico;
        if (System.getProperty("os.name").equalsIgnoreCase("Windows 11")
                || System.getProperty("os.name").equalsIgnoreCase("Windows 10")) {
            pastaMedico = new File("C:\\workspace\\Projeto3-Java\\Arquivos\\Medicos\\Dr.(a) " + nome);
        } else {
            pastaMedico = new File("/home/matheus/Programming/Projeto3-Java/Arquivos/Medicos/Dr.(a) " + nome);
        }
        pastaMedico.mkdir();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    @Override
    public String toString() {
        return "Id: " + idMedico + " Nome: " + nome +
                "\tEspecialidade: " + especialidade;
    }
}
