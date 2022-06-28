import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import entidades.*;
import enuns.Sexo;
import services.Agendamento;
import services.Consulta;

public class App {

    public static void main(String[] args) throws ParseException {
        Staff staff = new Staff();
        Medico medico = new Medico("Matheus", "Dentista", 01);
        Medico medico2 = new Medico("Clara", "Dentista", 02);
        Medico medico3 = new Medico("Samuel", "Dentista", 03);
        try {
            staff.adicionar(medico);
            staff.adicionar(medico2);
            staff.adicionar(medico3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        Sexo genero = Sexo.Masculino;
        Paciente paciente = new Paciente("Samuel", 18, genero);
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        Date data = formato.parse("13/07/2022 17:00");
        Agendamento agenda = null;
        try {
            agenda = new Agendamento(medico, paciente, data, 01);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        Consulta consulta = new Consulta(agenda);
        System.out.println(medico);
        System.out.println();
        System.out.println(paciente);
        System.out.println();
        System.out.println(agenda);
        System.out.println();
        try {
            consulta.finalizarConsulta(
                    "\tFoi realizado verificações no pulmão do paciente.\nO mesmo se queixava de dores pulmonares. Realizei o pedido de exames.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(consulta);
        System.out.println();
        try {
            staff.remover(3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
