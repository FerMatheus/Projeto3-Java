package services;

import java.util.HashMap;
import java.util.Map;

import entidades.*;

public class Agenda {
    private Medico medico;
    private HashMap<String, Paciente> agendados;

    public Agenda(Medico medico) {
        this.medico = medico;
    }

    public void adicionarAagenda(Paciente paciente, String horario) {
        if (verifica(horario)) {
            agendados.put(horario, paciente);
        }
    }

    public boolean verifica(String horario) {
        if (agendados.get(horario) == null) {
            return true;
        }
        return false;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Map<String, Paciente> getAgendados() {
        return agendados;
    }

    public void setAgendados(HashMap<String, Paciente> agendados) {
        this.agendados = agendados;
    }

}
