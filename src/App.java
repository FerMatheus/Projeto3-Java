import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.ConsoleHandler;

import entidades.*;
import enuns.Sexo;
import services.Agendamento;
import services.Consulta;

public class App {

    public static void main(String[] args) throws ParseException {
        Medico medico = new Medico("Matheus", "Neuro-Cirugião");
        Sexo genero = Sexo.Masculino;
        Paciente paciente = new Paciente("Samuel", 18, genero);
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date data = formato.parse("15/07/2022");

        Agendamento agenda = new Agendamento(medico, paciente, data, 01);
        Consulta consulta = new Consulta(agenda, "Examinado o paciente");

        System.out.println(consulta);

    }
}
