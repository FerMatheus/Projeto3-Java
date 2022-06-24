package services;

public class Consulta {
    private String descricao;
    private Agendamento agendamento;

    public Consulta(Agendamento agendamento, String descricao) {
        this.descricao = descricao;
        this.agendamento = agendamento;
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
