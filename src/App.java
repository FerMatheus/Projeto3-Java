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
        Paciente paciente = new Paciente("Clara", 18, genero);
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date data = formato.parse("15/07/2022");

        Agendamento agenda = new Agendamento(medico, paciente, data, 03);
        Consulta consulta = new Consulta(agenda);
        try {
            consulta.finalizarConsulta(
                    "Foi realizado verificações no pulmão do paciente.\nO mesmo se queixava de dores pulmonares. Realizei o pedido de exames.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
