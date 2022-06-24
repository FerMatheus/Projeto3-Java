package services;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Consulta {
    private String descricao;
    private Agendamento agendamento;

    public Consulta(Agendamento agendamento) {
        this.agendamento = agendamento;
        File pastaConsultas;
        if (System.getProperty("os.name").equalsIgnoreCase("Windows 11")
                || System.getProperty("os.name").equalsIgnoreCase("Windows 10")) {
            pastaConsultas = new File(
                    "C:\\workspace\\Projeto3-Java\\Arquivos\\Dr. " + agendamento.getMedico().getNome() + "\\Consultas");
        } else {
            pastaConsultas = new File("/home/matheus/Programming/Projeto3-Java/Arquivos/Dr. " + agendamento.getMedico()
                    .getNome() + "/Consultas");
        }
        pastaConsultas.mkdir();
    }

    public void finalizarConsulta(String descricao) throws IOException {
        this.descricao = descricao;
        File arquivo;
        if (System.getProperty("os.name").equalsIgnoreCase("Windows 11") || System.getProperty("os.name")
                .equalsIgnoreCase("Windows 10")) {
            arquivo = new File("C:\\workspace\\Projeto3-Java\\Arquivos\\Dr. " + agendamento.getMedico()
                    .getNome() + "\\Consultas\\Paciente id: " + agendamento.getId() + ".txt");
        } else {
            arquivo = new File("/home/matheus/Programming/Projeto3-Java/Arquivos/Dr. " + agendamento.getMedico()
                    .getNome() + "/Consultas/Paciente id: " + agendamento.getId() + ".txt");
        }
        FileWriter escritor = new FileWriter(arquivo);
        BufferedWriter escritorBuff = new BufferedWriter(escritor);
        escritorBuff.write("\tRegistro da consulta de id " + agendamento.getId() + "\n");
        escritorBuff.write("\nMédico: " + agendamento.getMedico().getNome() + "\n");
        escritorBuff.write("Paciente: " + agendamento.getPaciente().getNome() + "\n");
        escritorBuff.write("\nDescrição:\n\t" + descricao);
        escritorBuff.close();

    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Médico: " + agendamento.getMedico().getNome() + "\nPaciente: " + agendamento.getPaciente().getNome()
                + "\nDescrição:\n" + descricao;
    }
}
