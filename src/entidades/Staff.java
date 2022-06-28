package entidades;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Staff {
    private ArrayList<Medico> staff;
    private File arquivoStaff;

    public Staff() {
        staff = new ArrayList<Medico>();
        if (System.getProperty("os.name").equalsIgnoreCase("Windows 11")
                || System.getProperty("os.name").equalsIgnoreCase("Windows 10")) {
            arquivoStaff = new File("C:\\workspace\\Projeto3-Java\\Arquivos\\Medicos\\staff.txt");
        } else {
            arquivoStaff = new File("/home/matheus/Programming/Projeto3-Java/Arquivos/Medicos/staff.txt");
        }
    }

    public void adicionar(Medico x) throws IOException {
        staff.add(x);
        escrever();
    }

    public void remover(int id) throws IOException {
        for (Medico medico : staff) {
            if (medico.getIdMedico() == id) {
                staff.remove(medico);
            }
        }
        escrever();
    }

    public void escrever() throws IOException {
        FileWriter escritor = new FileWriter(arquivoStaff);
        BufferedWriter escritorBuff = new BufferedWriter(escritor);
        for (var medico : staff) {
            escritorBuff.write(medico.toString() + "\n");

        }
        escritorBuff.close();
    }

}
