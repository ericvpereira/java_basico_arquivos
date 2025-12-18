package model.application;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {

        String line = "Olá, mundo!";
        File file = new File("c:\\temp\\texto.txt");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
            bw.write(line);
            bw.newLine();
        }
        catch (IOException e) {
            System.out.println("ERROR: " + e.getLocalizedMessage());
        }
    } 
}
