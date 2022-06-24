package entidades;

import java.io.File;

public class Medico {
    private String nome;
    private String especialidade;

    public Medico(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
        File pastaMedico;
        if (System.getProperty("os.name").equalsIgnoreCase("Windows 11")
                || System.getProperty("os.name").equalsIgnoreCase("Windows 10")) {
            pastaMedico = new File("C:\\workspace\\Projeto3-Java\\Arquivos\\" + nome);
        } else {
            pastaMedico = new File("/home/matheus/Programming/Projeto3-Java/Arquivos/" + nome);
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

    @Override
    public String toString() {
        return "Nome: " + nome +
                "Especialidade: " + especialidade;
    }
}
