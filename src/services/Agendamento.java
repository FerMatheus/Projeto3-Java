package services;

import java.io.File;
import java.util.Date;

import entidades.*;

public class Agendamento {
    private int id;
    private Medico medico;
    private Paciente paciente;
    private Date data;

    public Agendamento(Medico medico, Paciente paciente, Date data, int id) {
        this.medico = medico;
        this.paciente = paciente;
        this.data = data;
        this.id = id;
        File pastaAgendamentos;
        if (System.getProperty("os.name").equalsIgnoreCase("Windows 11")
                || System.getProperty("os.name").equalsIgnoreCase("Windows 10")) {
            pastaAgendamentos = new File(
                    "C:\\workspace\\Projeto3-Java\\Arquivos\\Dr. " + medico.getNome() + "\\Agendamentos");
        } else {
            pastaAgendamentos = new File(
                    "/home/matheus/Programming/Projeto3-Java/Arquivos/Dr. " + medico.getNome() + "/Agendamentos");
        }
        pastaAgendamentos.mkdir();
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
}
