package model.application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Program10 {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("c:\\temp\\notas.csv"))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] campos = line.split(";");

                String nome = campos[0];
                double nota = Double.parseDouble(campos[1]);

                    if (nota >= 7.0) {
                        System.out.println(nome + " " + nota);
                    }
                }
            } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

}

