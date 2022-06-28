package services;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

import entidades.*;

public class Agendamento {
    private int id;
    private Medico medico;
    private Paciente paciente;
    private Date data;

    public Agendamento(Medico medico, Paciente paciente, Date data, int id) throws IOException {
        this.medico = medico;
        this.paciente = paciente;
        this.data = data;
        this.id = id;
        criarPasta();
        criarArquivo();
    }

    public void criarPasta() {
        File pastaAgendamentos;
        if (System.getProperty("os.name").equalsIgnoreCase("Windows 11")
                || System.getProperty("os.name").equalsIgnoreCase("Windows 10")) {
            pastaAgendamentos = new File(
                    "C:\\workspace\\Projeto3-Java\\Arquivos\\Medicos\\Dr.(a) " + medico.getNome() + "\\Agendamentos");
        } else {
            pastaAgendamentos = new File(
                    "/home/matheus/Programming/Projeto3-Java/Arquivos/Medicos/Dr.(a) " + medico.getNome()
                            + "/Agendamentos");
        }
        pastaAgendamentos.mkdir();
    }

    public void criarArquivo() throws IOException {
        File arquivoAgendamentos;
        if (System.getProperty("os.name").equalsIgnoreCase("Windows 11")
                || System.getProperty("os.name").equalsIgnoreCase("Windows 10")) {
            arquivoAgendamentos = new File(
                    "C:\\workspace\\Projeto3-Java\\Arquivos\\Medicos\\Dr.(a) " + medico.getNome()
                            + "\\Agendamentos\\agendado id "
                            + id + ".txt");
        } else {
            arquivoAgendamentos = new File(
                    "/home/matheus/Programming/Projeto3-Java/Arquivos/Medicos/Dr.(a) " + medico.getNome()
                            + "/Agendamentos/agendado id " + id + ".txt");
        }
        FileWriter escritor = new FileWriter(arquivoAgendamentos);
        BufferedWriter escritorBuff = new BufferedWriter(escritor);
        escritorBuff.write(toString());
        escritorBuff.close();
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Id do agendamento: " + id + "\nMédico: " + medico.getNome() + "\nPaciente: " + paciente.getNome()
                + "\nData e hora do agendamento: " + data.toString();
    }
}
