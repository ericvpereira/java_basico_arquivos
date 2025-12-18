package model.application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Program5 {
    public static void main(String[] args) {
        
        try (
            BufferedReader br = new BufferedReader(new FileReader("c:\\temp\\origem.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("c:\\temp\\copia.txt"))
        ) {
            String line;

            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }

            System.out.println("File copied with sucessed!");

        }
         catch (IOException e) {
            System.out.println("EROOR: " + e.getMessage());
        }
    } 
}
